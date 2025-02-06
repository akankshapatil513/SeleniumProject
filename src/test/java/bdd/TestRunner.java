package bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features/addcart.feature",
        glue="stepdefination",
           dryRun= true
            //tags="@smoke"
)
public class TestRunner {

}
