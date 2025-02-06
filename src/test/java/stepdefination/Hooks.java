package stepdefination;

import Module.LoginModule;
import io.cucumber.java.AfterStep;
import org.junit.After;
import org.junit.Before;

import static utilities.DriverFactory.driver;

public class Hooks {

@Before
public void setup()
{

}

@After
public void teardown()
{

        driver.close();


}

}
