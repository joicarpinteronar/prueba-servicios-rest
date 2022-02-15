package com.rest.automation.questions;

import com.rest.automation.utils.SeleniumFunctions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateResponseConsultEmployees implements Question<String> {

    SeleniumFunctions functions = new SeleniumFunctions();

    public static ValidateResponseConsultEmployees is() {
        return new ValidateResponseConsultEmployees();
    }

    @Override
    public String answeredBy(Actor actor) {
       String messageResponse = functions.getScenarioData("status_get");
        return messageResponse;
    }
}
