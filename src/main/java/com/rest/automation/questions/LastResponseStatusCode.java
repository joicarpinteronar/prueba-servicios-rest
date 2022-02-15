package com.rest.automation.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LastResponseStatusCode implements Question<Boolean> {

    private int cod;

    public LastResponseStatusCode(int cod) {
        this.cod = cod;
    }

    public static LastResponseStatusCode is(int cod) {
        return new LastResponseStatusCode(cod);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        int response = SerenityRest.lastResponse().statusCode();
        return response == cod;
    }

}
