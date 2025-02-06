package automationtestng;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class SauceDemo extends Base {

    @Test(priority = 1)
    public void loginPage() throws IOException {
        loginModule.login(envprop.getProperty("username"),envprop.getProperty("password"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        File shot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(shot,new File("F:\\Drivers\\Bluetooth\\.jpg"));

        //Assert.assertEquals(loginModule.getErrorMessage(), expectederrormsg);
    }

    @Test(priority =2)
    public void add_cart() throws IOException, InterruptedException {
        loginModule.login(envprop.getProperty("username"),envprop.getProperty("password"));
        addCartModule.addcart();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        addCartModule.geterrormsgaddcart();
        File shot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(shot,new File("F:\\Drivers\\Bluetooth\\d.jpg"));

    }

    @Test(priority = 3)
    public void removecartItem() throws InterruptedException {
        loginModule.login(envprop.getProperty("username"),envprop.getProperty("password"));
        addCartModule.addcart();
        removcartitemModule.removecart();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        removcartitemModule.getErrorMsgRemoveitem();

    }

    @Test(priority = 4)
    public void checkout() throws InterruptedException {
        loginModule.login(envprop.getProperty("username"),envprop.getProperty("password"));
        addCartModule.addcart();
        checkoutModule.checkOut();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test(priority = 5)
    public void userdetails() throws InterruptedException {
        loginModule.login(envprop.getProperty("username"),envprop.getProperty("password"));
        addCartModule.addcart();
        checkoutModule.checkOut();
        userdetailModule.userDetail();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        userdetailModule.getErrorMsgUserDetails();

    }

    @Test(priority = 6)
    public void finishUserOrder() throws InterruptedException {
        loginModule.login(envprop.getProperty("username"),envprop.getProperty("password"));
        addCartModule.addcart();
        checkoutModule.checkOut();
        userdetailModule.userDetail();
        finisordermodule.finishOrder();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        finisordermodule.geterrormsgFinishorder();
    }
}

