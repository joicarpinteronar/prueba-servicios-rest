package com.rest.automation.interactions;

import com.rest.automation.utils.SeleniumFunctions;
import com.rest.automation.utils.enums.RestServices;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class PostEmployee implements Interaction {

    SeleniumFunctions functions = new SeleniumFunctions();
    private final String body;

    public PostEmployee(String body) {
        this.body = body;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Post.to(RestServices.CREATE_EMPLOYEE.toString())
                .with(requestSpecification -> requestSpecification
                        .contentType(ContentType.JSON)
                        .body(body)));
        functions.saveInScenario("status_sus", SerenityRest.lastResponse().jsonPath().getString("status"));
        functions.saveInScenario("message_sus", SerenityRest.lastResponse().jsonPath().getString("message"));


    }
}
