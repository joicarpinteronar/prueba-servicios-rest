package com.rest.automation.interactions;

import com.rest.automation.utils.SeleniumFunctions;
import com.rest.automation.utils.enums.RestServices;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Get;


public class GetIdEmployee implements Interaction {

    private int idEmployee;

    SeleniumFunctions functions = new SeleniumFunctions();

    public GetIdEmployee(int idEmployee) {
        this.idEmployee =  idEmployee;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Delete.from(RestServices.CONSULT_A_EMPLOYEE.toString()+idEmployee));
        functions.saveInScenario("status_get_id", SerenityRest.lastResponse().jsonPath().getString("status"));
        functions.saveInScenario("message_get_id", SerenityRest.lastResponse().jsonPath().getString("message"));

    }
}
