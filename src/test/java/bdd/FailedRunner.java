package bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt", // Re-run only failed scenarios
        glue = "stepDefinitions",
        plugin = { "pretty", "html:target/cucumber-reports" },
        monochrome = true
)
public class FailedRunner {
}
