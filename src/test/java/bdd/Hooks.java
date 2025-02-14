package bdd;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverFactory;

public class Hooks {


        @Before
        public void setup() {
            DriverFactory.open_browser();
        }

        @After
        public void teardown() {
            DriverFactory.close_browser(); // Closes only after all scenarios run
        }
    }


