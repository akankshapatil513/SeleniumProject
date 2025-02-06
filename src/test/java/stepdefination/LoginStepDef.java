package stepdefination;

import Module.LoginModule;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DriverFactory;

public class LoginStepDef {

    LoginModule loginModule;

    @Given("user open chrome")
    public void user_open_chrome() {
        DriverFactory.open_browser();
        loginModule=new LoginModule(DriverFactory.getDriver());
    }
    @Given("open url {string}")
    public void open_url(String string) {
        DriverFactory.open_url(string);
    }
    @When("user enter username {string}")
    public void user_enter_username(String string) {
            loginModule.enterUsername(string);
         }
    @When("user enter password {string}")
    public void user_enter_password(String string) {
        loginModule.enterPassword(string);
    }
    @When("user enter login button")
    public void user_enter_login_button() {
        loginModule.enterloginbtn();
    }
    @Then("user validate succesful login")
    public void user_validate_succesful_login() {
        System.out.println("6");
    }
    @Then("user validate Login page")
    public void user_validate_login_page() {
        System.out.println("hi 8");
    }


}
