package Module;

import PageObjectModel.AddCartPageLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddCartModule {

    WebDriver driver;

    public AddCartModule(WebDriver driver)

    {
        this.driver=driver;
    }
    @Test(priority = 2, dependsOnMethods = "loginPage")
    public void addcart() throws InterruptedException
    {
        driver.findElement(AddCartPageLocator.addproduct1).click();
        driver.findElement(AddCartPageLocator.addproduct2).click();
        driver.findElement(AddCartPageLocator.shopping_cartcontainer).click();
    }

    public void geterrormsgaddcart()
    {
        List<WebElement> cartItems = driver.findElements(By.className("cart_item"));
        Assert.assertEquals(cartItems.size(), 2, "The number of products in the cart does not match.");

    }

}
