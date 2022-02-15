package com.rest.automation.stepdefinitions;

import com.rest.automation.models.employee.ConsultIdEmployee;
import com.rest.automation.models.employee.Employee;
import com.rest.automation.questions.ValidateResponseConsultIdEmployee;
import com.rest.automation.questions.ValidateResponseCreateEmployed;
import com.rest.automation.tasks.ConsultIdEmployeeRest;
import com.rest.automation.tasks.CreateEmployeeRest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class ConsultIdEmployeeDefinitions {

    @When("^he consults the employee by his id$")
    public void  heConsultInformationEmployee(List<ConsultIdEmployee> modelIdEmployee) {
        theActorInTheSpotlight().attemptsTo(ConsultIdEmployeeRest.with(modelIdEmployee));
    }

    @Then("validation of the employee query$")
    public void heValidatesTheCreationEmployee(List<ConsultIdEmployee> modelIdEmployee) {
        theActorInTheSpotlight().should(seeThat(ValidateResponseConsultIdEmployee.is(), equalTo(modelIdEmployee.get(0).getStatus())));
    }
}
