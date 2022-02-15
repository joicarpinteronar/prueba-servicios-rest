package com.rest.automation.questions;

import com.rest.automation.utils.SeleniumFunctions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateResponseConsultIdEmployee implements Question<String> {

    SeleniumFunctions functions = new SeleniumFunctions();

    public static ValidateResponseConsultIdEmployee is() {
        return new ValidateResponseConsultIdEmployee();
    }

    @Override
    public String answeredBy(Actor actor) {
       String messageResponse = functions.getScenarioData("status_get_id");
        return messageResponse;
    }
}
