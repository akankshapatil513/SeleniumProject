package bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;

@RunWith(Cucumber.class)
@CucumberOptions(
        features =
                "Features",

        glue="stepdefination",
      //  plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        plugin = { "pretty", "html:target/cucumber-reports", "rerun:target/rerun.txt" }, // Capture failed scenarios

        dryRun= false

            //tags="@smoke"
)
public class TestRunner {

}
