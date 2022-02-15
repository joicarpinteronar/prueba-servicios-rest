package com.rest.automation.stepdefinitions;

import com.rest.automation.models.employee.Employee;
import com.rest.automation.questions.LastResponseStatusCode;
import com.rest.automation.questions.ValidateResponseCreateEmployed;
import com.rest.automation.tasks.CreateEmployeeRest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class CreateEmployeeDefinitions {

    @When("^he sends the service information to create an employee$")
    public void  heSendsTheServiceInformationEmployee(List<Employee> modelEmployee) {
        theActorInTheSpotlight().attemptsTo(CreateEmployeeRest.with(modelEmployee));
    }

    @Then("validates the creation of an employee by service$")
    public void heValidatesTheCreationEmployee(List<Employee> modelEmployee) {
        theActorInTheSpotlight().should(seeThat(ValidateResponseCreateEmployed.is(), equalTo(modelEmployee.get(0).getStatus())));
    }

    @And("Validate the response code (.*)$")
    public void validateCodeResponse(int code) {
        theActorInTheSpotlight().should(String.valueOf(LastResponseStatusCode.is(code)));
    }



}
