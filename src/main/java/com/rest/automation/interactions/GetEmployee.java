package com.rest.automation.interactions;

import com.rest.automation.utils.SeleniumFunctions;
import com.rest.automation.utils.enums.RestServices;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Get;


public class GetEmployee implements Interaction {

    SeleniumFunctions functions = new SeleniumFunctions();

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Get.resource(RestServices.CONSULT_EMPLOYEE.toString()));
        functions.saveInScenario("status_get", SerenityRest.lastResponse().jsonPath().getString("status"));
        functions.saveInScenario("message_get", SerenityRest.lastResponse().jsonPath().getString("message"));

    }
}
