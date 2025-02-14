package stepdefination;

import Module.LoginModule;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepDef {

    WebDriver driver;
    LoginModule loginModule;

    @Given("opens Chrome browser")
    public void user_opens_chrome_browser() {
        DriverFactory.open_browser();
        driver = DriverFactory.getDriver();
        loginModule = new LoginModule(driver);
    }

    @Given("open url to {string}")
    public void open_url(String url) {
        DriverFactory.open_url(url);
    }

    @When("enters username {string}")
    public void user_enters_username(String username) {
        loginModule.enterUsername(username);
    }

    @And("enters password {string}")
    public void user_enters_password(String password) {
        loginModule.enterPassword(password);
    }

    @And("clicks the login button")
    public void user_clicks_the_login_button() {
        loginModule.enterloginbtn();
    }

    @Then("should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        // Assuming successful login redirects to inventory page
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals("Login was unsuccessful!", expectedURL, driver.getCurrentUrl());
    }

    @Then("should see error message {string}")
    public void user_should_see_error_message(String expectedMessage) {
        String actualMessage = loginModule.getErrorMessage();

        // If expectedMessage is empty, assert that there is no error message
        if (expectedMessage.isEmpty()) {
            Assert.assertTrue("Expected no error message, but found one!", actualMessage.isEmpty());
        } else {
            Assert.assertEquals("Error message does not match!", expectedMessage, actualMessage);
        }
    }
}
