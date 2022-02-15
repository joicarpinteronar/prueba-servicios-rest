package com.rest.automation.tasks;

import com.rest.automation.interactions.ConsumeService;
import com.rest.automation.models.employee.ConsultIdEmployee;
import com.rest.automation.models.employee.Employee;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;


public class ConsultIdEmployeeRest implements Task {

    private List<ConsultIdEmployee> modelIdEmployee;

    public ConsultIdEmployeeRest(List<ConsultIdEmployee> modelIdEmployee) {
        this.modelIdEmployee = modelIdEmployee;
    }

    public static ConsultIdEmployeeRest with(List<ConsultIdEmployee> modelIdEmployee) {
        return Tasks.instrumented(ConsultIdEmployeeRest.class, modelIdEmployee);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeService.GetIdEmployee(modelIdEmployee.get(0).getIdEmployee()));
    }
}
