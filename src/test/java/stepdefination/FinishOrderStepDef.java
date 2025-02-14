package stepdefination;

import Module.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

public class FinishOrderStepDef {

        WebDriver driver;
        AddCartModule addCartModule;
        LoginModule loginModule;
        CheckOutModule checkOutModule;
        UserdetailModule userdetailModule;
        FinishOrderModule finishOrderModule;

        public FinishOrderStepDef()
        {
            System.out.println("Initializing CheckOutStepDef...");
            this.driver = DriverFactory.getDriver();
            this.loginModule = new LoginModule(this.driver);
            this.addCartModule = new AddCartModule(this.driver);
            this.checkOutModule = new CheckOutModule(this.driver);
            this.userdetailModule=new UserdetailModule(this.driver);
            this.finishOrderModule=new FinishOrderModule(this.driver);
        }


        @Given("users opening the chrome")
        public void user_open_chrome() {
            System.out.println("Opening browser in step definition...");
            DriverFactory.open_browser();
            this.driver = DriverFactory.getDriver();
            this.loginModule = new LoginModule(this.driver);
        }

        @And("users opening the url {string}")
        public void open_url(String url) {
            System.out.println("Opening URL: " + url);
            DriverFactory.open_url(url);
        }
        @And("users entering the username {string}")
        public void user_enter_username(String username) {
            loginModule.enterUsername(username);
        }

        @And("users entering the password {string}")
        public void user_enter_password(String password) {
            loginModule.enterPassword(password);
        }

        @And("users entering the login button")
        public void user_enter_login_button() {
            loginModule.enterloginbtn();
        }

        @Given("Users logged in application")
        public void user_login_in_the_application() {
            System.out.println("User successfully logged in.");
        }

        @And("users added one item in the cart")
        public void add_one_item_in_cart() throws InterruptedException {

            addCartModule.addcart();

        }
        @Given("users login the application and added items in the cart")
        public void user_login(){
            System.out.println("Added items");
        }

        @And("users click on the checkout button")
        public void user_click_on_checkout_button() throws InterruptedException {
            checkOutModule.checkOut();
        }
        @Then("users validate the checkout page")
        public void user_validate_checkout_page() {
            System.out.println("Checkout succesfully");
        }
        @Given("user open form to fill detail")
        public void user_open_form_to_fill_the_detail() {
            System.out.println("Please fill the details");
        }
        @Given("user enter the first name {string}")
        public void user_enter_first_name(String string) {
            userdetailModule.enterfirstname();

        }
        @Given("user enter the last name {string}")
        public void user_enter_last_name(String string) {
            userdetailModule.enterlastname();

        }
        @Given("user enter the postcode {string}")
        public void user_enter_postcode(String string) {
            userdetailModule.enterpincode();

        }
        @Given("user click on the continue button")
        public void user_click_on_continue_button() {
            userdetailModule.continuebutton();

        }
        @Then("user validate checkout the overview details")
        public void user_validate_checkout_overview_details() {
            System.out.println("checkout review completed");

        }


    @Given("items is added in cart and added all the details")
    public void items_is_added_in_cart_and_added_all_the_details() {
            finishOrderModule.finishOrder();
         }
    @Given("user click on finish button")
    public void user_click_on_finish_button() {
        System.out.println("Order Placed Succesfully");
    }

}
