package org.example.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java",
        dryRun = true,
        glue = "org/example/test/step",
        tags = "@SmokeTest or @RegressionTest",
        plugin = {
                "pretty",
                "html: target/cucumber.html",
                "json: target/cucumber.json"
        }
)
public class TestNGRunner extends AbstractTestNGCucumberTests {


}
