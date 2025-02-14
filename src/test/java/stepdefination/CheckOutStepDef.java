package stepdefination;

import Module.AddCartModule;
import Module.CheckOutModule;
import Module.LoginModule;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

public class CheckOutStepDef {

    WebDriver driver;
    AddCartModule addCartModule;
    LoginModule loginModule;
    CheckOutModule checkOutModule;

    public CheckOutStepDef() {
        System.out.println("Initializing CheckOutStepDef...");
        this.driver = DriverFactory.getDriver();
        this.loginModule = new LoginModule(this.driver);
        this.addCartModule = new AddCartModule(this.driver);
        this.checkOutModule = new CheckOutModule(this.driver);
    }


    @Given("user opening chrome")
    public void user_open_chrome() {
        System.out.println("Opening browser in step definition...");
        DriverFactory.open_browser();
        this.driver = DriverFactory.getDriver();
        this.loginModule = new LoginModule(this.driver);
    }

    @And("opening url {string}")
    public void open_url(String url) {
        System.out.println("Opening URL: " + url);
        DriverFactory.open_url(url);
    }
    @And("user entering username {string}")
    public void user_enter_username(String username) {
        loginModule.enterUsername(username);
    }

    @And("user entering password {string}")
    public void user_enter_password(String password) {
        loginModule.enterPassword(password);
    }

    @And("user entering login button")
    public void user_enter_login_button() {
        loginModule.enterloginbtn();
    }

    @Given("User logged in the application")
    public void user_login_in_the_application() {
        System.out.println("User successfully logged in.");
    }

    @And("added one item in cart")
    public void add_one_item_in_cart() throws InterruptedException {

        addCartModule.addcart();

    }
    @Given("user login the application and added items in cart")
    public void user_login(){
        System.out.println("Added items");
    }

    @And("user click on checkout button")
    public void user_click_on_checkout_button() throws InterruptedException {
        checkOutModule.checkOut();
         }
    @Then("user validate checkout page")
    public void user_validate_checkout_page() {
        System.out.println("Checkout succesfully");
    }

}
