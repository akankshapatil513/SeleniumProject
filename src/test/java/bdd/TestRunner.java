package bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;

@RunWith(Cucumber.class)
@CucumberOptions(
        features =
                "Features/login.feature",

        glue="stepdefination",
           plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

           dryRun= false

            //tags="@smoke"
)
public class TestRunner {

}
