package com.rest.automation.runners;

import com.rest.automation.utils.BeforeSuite;
import com.rest.automation.utils.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import java.io.IOException;

@CucumberOptions(
        features = "src/test/resources/features/managedEmployee.feature",
        tags = {"@Regression"},
        glue = {"com.rest.automation/stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
@RunWith(CustomRunner.class)
public class ManagedEmployeeRunner {

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/managedEmployee.feature");
    }

}
