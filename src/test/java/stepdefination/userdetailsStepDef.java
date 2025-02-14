package stepdefination;

import Module.AddCartModule;
import Module.CheckOutModule;
import Module.LoginModule;
import Module.UserdetailModule;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

public class userdetailsStepDef {
        WebDriver driver;
        AddCartModule addCartModule;
        LoginModule loginModule;
        CheckOutModule checkOutModule;
        UserdetailModule userdetailModule;

        public userdetailsStepDef()
        {
            System.out.println("Initializing CheckOutStepDef...");
            this.driver = DriverFactory.getDriver();
            this.loginModule = new LoginModule(this.driver);
            this.addCartModule = new AddCartModule(this.driver);
            this.checkOutModule = new CheckOutModule(this.driver);
            this.userdetailModule=new UserdetailModule(this.driver);
        }


        @Given("users opening chrome")
        public void user_open_chrome() {
            System.out.println("Opening browser in step definition...");
            DriverFactory.open_browser();
            this.driver = DriverFactory.getDriver();
            this.loginModule = new LoginModule(this.driver);
        }

        @And("users opening url {string}")
        public void open_url(String url) {
            System.out.println("Opening URL: " + url);
            DriverFactory.open_url(url);
        }
        @And("users entering username {string}")
        public void user_enter_username(String username) {
            loginModule.enterUsername(username);
        }

        @And("users entering password {string}")
        public void user_enter_password(String password) {
            loginModule.enterPassword(password);
        }

        @And("users entering login button")
        public void user_enter_login_button() {
            loginModule.enterloginbtn();
        }

        @Given("Users logged in the application")
        public void user_login_in_the_application() {
            System.out.println("User successfully logged in.");
        }

        @And("users added one item in cart")
        public void add_one_item_in_cart() throws InterruptedException {

            addCartModule.addcart();

        }
        @Given("users login the application and added items in cart")
        public void user_login(){
            System.out.println("Added items");
        }

        @And("users click on checkout button")
        public void user_click_on_checkout_button() throws InterruptedException {
            checkOutModule.checkOut();
        }
        @Then("users validate checkout page")
        public void user_validate_checkout_page() {
            System.out.println("Checkout succesfully");
        }
        @Given("user open form to fill the detail")
    public void user_open_form_to_fill_the_detail() {
        System.out.println("Please fill the details");
    }
    @Given("user enter first name {string}")
    public void user_enter_first_name(String string) {
            userdetailModule.enterfirstname();

    }
    @Given("user enter last name {string}")
    public void user_enter_last_name(String string) {
            userdetailModule.enterlastname();

    }
    @Given("user enter postcode {string}")
    public void user_enter_postcode(String string) {
            userdetailModule.enterpincode();

    }
    @Given("user click on continue button")
    public void user_click_on_continue_button() {
            userdetailModule.continuebutton();

    }
    @Then("user validate checkout overview details")
    public void user_validate_checkout_overview_details() {
        System.out.println("checkout review completed");

    }
}
