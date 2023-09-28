package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "",
        features = {
                "src/test/resources/features/ConfirmOrder.feature"
        },
        glue = "org.example.definitions",
        plugin = {"pretty", "html:target/cucumberreport.html","json:target/cucumber-report.json"}
)
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
}
