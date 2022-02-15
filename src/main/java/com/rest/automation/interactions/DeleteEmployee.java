package com.rest.automation.interactions;

import com.rest.automation.utils.SeleniumFunctions;
import com.rest.automation.utils.enums.RestServices;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Delete;

public class DeleteEmployee implements Interaction {

    private int idEmployee;
    SeleniumFunctions functions = new SeleniumFunctions();

    @Override
    public <T extends Actor> void performAs(T actor) {
        idEmployee = Integer.parseInt(functions.getScenarioData("id_employee"));
        actor.attemptsTo(Delete.from(RestServices.DELETE_EMPLOYEE.toString()+idEmployee));
        functions.saveInScenario("status_del", SerenityRest.lastResponse().jsonPath().getString("status"));
        functions.saveInScenario("data_del", SerenityRest.lastResponse().jsonPath().getString("data"));

    }
}
