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

    public void userDetail()
    {
        driver.findElement(UserDetailsLocator.firstname).sendKeys("Akanksha");
        driver.findElement(UserDetailsLocator.lastname).sendKeys("patil");
        driver.findElement(UserDetailsLocator.postcode).sendKeys("415212");
        driver.findElement(UserDetailsLocator.acontinue).click();
    }

    public void getErrorMsgUserDetails()
    {
        List<WebElement> checkoutItems = driver.findElements(By.className("cart_item"));
        Assert.assertEquals(checkoutItems.size(), 2, "The number of products during checkout is incorrect.");

    }
}
