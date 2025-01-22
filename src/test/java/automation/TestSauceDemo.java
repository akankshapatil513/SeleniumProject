package automation;
import PageObjectModel.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class TestSauceDemo extends LoginBaseClass {

    @Test(priority = 1, dataProvider = "Logindata")
    public void loginPage(String username, String password, String expectederrormsg) {
        loginModule.login(username, password);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //Assert.assertEquals(loginModule.getErrorMessage(), expectederrormsg);
    }

    @Test(priority = 2, dataProvider = "Logindata")
    public void add_cart(String username, String password, String expectederrormsg) throws InterruptedException {
        loginModule.login(username, password);
        addCartModule.addcart();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        addCartModule.geterrormsgaddcart();
    }

    @Test(priority = 3, dataProvider = "Logindata")
    public void removecartItem(String username, String password, String expectederrormsg) throws InterruptedException {
        loginModule.login(username, password);
        addCartModule.addcart();
        removcartitemModule.removecart();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        removcartitemModule.getErrorMsgRemoveitem();

    }

    @Test(priority = 4, dataProvider = "Logindata")
    public void checkout(String username, String password, String expectederrormsg) throws InterruptedException {
        loginModule.login(username, password);
        addCartModule.addcart();
        checkoutModule.checkOut();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test(priority = 5, dataProvider = "Logindata")
    public void userdetails(String username, String password, String expectederrormsg) throws InterruptedException {
        loginModule.login(username, password);
        addCartModule.addcart();
        checkoutModule.checkOut();
        userdetailModule.userDetail();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        userdetailModule.getErrorMsgUserDetails();

    }

    @Test(priority = 6,dataProvider ="Logindata")
    public void finishUserOrder(String username,String password,String expectederrormsg) throws InterruptedException {
        loginModule.login(username, password);
        addCartModule.addcart();
        checkoutModule.checkOut();
        userdetailModule.userDetail();
        finisordermodule.finishOrder();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        finisordermodule.geterrormsgFinishorder();
    }
}

