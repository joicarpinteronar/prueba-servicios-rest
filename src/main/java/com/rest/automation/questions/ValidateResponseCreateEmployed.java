package com.rest.automation.questions;

import com.rest.automation.utils.SeleniumFunctions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateResponseCreateEmployed implements Question<String> {

    SeleniumFunctions functions = new SeleniumFunctions();

    public static ValidateResponseCreateEmployed is() {
        return new ValidateResponseCreateEmployed();
    }

    @Override
    public String answeredBy(Actor actor) {
       String messageResponse = functions.getScenarioData("status_sus");
        return messageResponse;
    }
}
