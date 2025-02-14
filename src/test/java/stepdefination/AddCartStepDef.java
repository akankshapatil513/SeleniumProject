package stepdefination;

import Module.AddCartModule;
import Module.LoginModule;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

public class AddCartStepDef {
    WebDriver driver;
    AddCartModule addCartModule;
    LoginModule loginModule;

    public AddCartStepDef() {
        System.out.println("Initializing AddCartStepDef...");
        this.driver = DriverFactory.getDriver();
        this.loginModule = new LoginModule(this.driver);
        this.addCartModule = new AddCartModule(this.driver);
    }

    @Given("user opens chrome")
    public void user_open_chrome() {
        System.out.println("Opening browser in step definition...");
        DriverFactory.open_browser();
        this.driver = DriverFactory.getDriver();
        this.loginModule = new LoginModule(this.driver);
    }

    @And("open url{string}")
    public void open_url(String url) {
        System.out.println("Opening URL: " + url);
        DriverFactory.open_url(url);
    }

    @And("user enters username {string}")
    public void user_enter_username(String username) {
        loginModule.enterUsername(username);
    }

    @And("user enters password {string}")
    public void user_enter_password(String password) {
        loginModule.enterPassword(password);
    }

    @And("user enters login button")
    public void user_enter_login_button() {
        loginModule.enterloginbtn();
    }

    @Given("User login in the application")
    public void user_login_in_the_application() {
        System.out.println("User successfully logged in.");
    }

    @And("add one item in cart")
    public void add_one_item_in_cart() throws InterruptedException {

        addCartModule.addcart();
        System.out.println("items added");
    }
}




