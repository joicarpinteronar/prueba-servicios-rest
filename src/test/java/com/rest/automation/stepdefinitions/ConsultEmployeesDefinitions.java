package com.rest.automation.stepdefinitions;

import com.rest.automation.models.employee.Employee;
import com.rest.automation.questions.ValidateResponseConsultEmployees;
import com.rest.automation.questions.ValidateResponseCreateEmployed;
import com.rest.automation.tasks.ConsultEmployeesRest;
import com.rest.automation.tasks.CreateEmployeeRest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class ConsultEmployeesDefinitions {

    @When("^he consults the list of employees$")
    public void  heConsultsTheListEmployee() {
        theActorInTheSpotlight().attemptsTo(ConsultEmployeesRest.with());
    }

    @Then("validate that the query is satisfactory$")
    public void heValidatesTheConsultEmployee() {
        theActorInTheSpotlight().should(seeThat(ValidateResponseConsultEmployees.is(), equalTo("success")));
    }
}
