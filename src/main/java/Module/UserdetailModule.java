package Module;

import PageObjectModel.UserDetailsLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class UserdetailModule {

    WebDriver driver;

    public UserdetailModule(WebDriver driver)


    {
        this.driver=driver;
    }
    public void enterfirstname()
    {
        driver.findElement(UserDetailsLocator.firstname).sendKeys("Akanksha");

    }
    public void enterlastname()
    {
        driver.findElement(UserDetailsLocator.lastname).sendKeys("patil");

    }
    public void enterpincode()
    {
        driver.findElement(UserDetailsLocator.postcode).sendKeys("415212");

    }

    public void continuebutton()
    {
        driver.findElement(UserDetailsLocator.acontinue).click();

    }
    public void getErrorMsgUserDetails()
    {
        List<WebElement> checkoutItems = driver.findElements(By.className("cart_item"));
        Assert.assertEquals(checkoutItems.size(), 2, "The number of products during checkout is incorrect.");

    }


    public void userDetail()
    {
        enterfirstname();
        enterlastname();
        continuebutton();
        getErrorMsgUserDetails();
    }


}
