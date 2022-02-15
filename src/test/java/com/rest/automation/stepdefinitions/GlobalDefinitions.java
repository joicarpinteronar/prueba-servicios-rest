package com.rest.automation.stepdefinitions;

import com.rest.automation.utils.BeforeHook;
import com.rest.automation.utils.SeleniumFunctions;
import cucumber.api.java.en.Given;

import java.io.IOException;


public class GlobalDefinitions {

    SeleniumFunctions functions = new SeleniumFunctions();

    @Given("^that Employee uses the service in (.*)$")
    public void thatEmployeeUsesTheService(String urlBase) throws IOException {
        functions.retrieveTestData(urlBase);
        BeforeHook.prepareStage(functions.getScenarioData(urlBase));
    }

}

