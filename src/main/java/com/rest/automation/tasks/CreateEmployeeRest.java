package com.rest.automation.tasks;

import com.rest.automation.interactions.ConsumeService;
import com.rest.automation.models.employee.Employee;
import com.rest.automation.utils.SeleniumFunctions;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Arrays;
import java.util.List;

public class CreateEmployeeRest implements Task {

    SeleniumFunctions functions = new SeleniumFunctions();
    private List<Employee> modelEmployee;

    public CreateEmployeeRest(List<Employee> modelEmployee) {
        this.modelEmployee = modelEmployee;
    }

    public static CreateEmployeeRest with(List<Employee> modelEmployee) {
        return Tasks.instrumented( CreateEmployeeRest.class, modelEmployee);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeService.PostEmployee(modelEmployee.get(0).toString()));

        try {

            if (SerenityRest.lastResponse().statusCode()==200) {
                String data = String.valueOf(SerenityRest.lastResponse().jsonPath().getString("data"));
                String[] employeeService = data.split(",");
                String idEmployee = Arrays.asList(employeeService).get(2);
                String[] getIdEmployee = idEmployee.split(":");
                functions.saveInScenario("id_employee",Arrays.asList(getIdEmployee).get(1));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
