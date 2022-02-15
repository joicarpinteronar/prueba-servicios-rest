package com.rest.automation.stepdefinitions;

import com.rest.automation.questions.ValidateResponseDeleteEmployee;
import com.rest.automation.tasks.DeleteEmployeeRest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class DeleteEmployeeDefinitions {

    @When("^he eliminates the indicated employee$")
    public void  heDeleteTheListEmployee() {
        theActorInTheSpotlight().attemptsTo(DeleteEmployeeRest.with());
    }

    @Then("validates that the deletion is successful$")
    public void heValidateDeleteEmployee() {
        theActorInTheSpotlight().should(seeThat(ValidateResponseDeleteEmployee.is(), equalTo("success")));
    }
}
