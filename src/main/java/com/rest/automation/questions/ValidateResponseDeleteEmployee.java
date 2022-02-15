package com.rest.automation.questions;

import com.rest.automation.utils.SeleniumFunctions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateResponseDeleteEmployee implements Question<String> {

    SeleniumFunctions functions = new SeleniumFunctions();

    public static ValidateResponseDeleteEmployee is() {
        return new ValidateResponseDeleteEmployee();
    }

    @Override
    public String answeredBy(Actor actor) {
       String messageResponse = functions.getScenarioData("status_del");
        return messageResponse;
    }
}
