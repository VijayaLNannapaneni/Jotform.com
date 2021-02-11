package com.FormTemplates.Registration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/"}
        ,glue={"src/main/java/com/FormTemplates/Registration/stepFunctions"},
        monochrome = true,
        tags = {}
)
public class runner extends AbstractTestNGCucumberTests {
}


