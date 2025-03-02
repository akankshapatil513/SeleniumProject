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

    public AddCartModule(WebDriver driver) {
        if (driver == null) {
            throw new IllegalArgumentException("WebDriver instance cannot be null.");
        }
        this.driver = driver;
    }
    public void addproduct1() {
        driver.findElement(AddCartPageLocator.addproduct1).click();
    }

    public void addproduct2() {
        driver.findElement(AddCartPageLocator.addproduct2).click();
    }

    public  void viewcontainer()
    {
        driver.findElement(AddCartPageLocator.shopping_cartcontainer).click();

    }
    public  void geterrormsgaddcart()
    {
        List<WebElement> cartItems = driver.findElements(By.className("cart_item"));
        Assert.assertEquals(cartItems.size(), 2, "The number of products in the cart does not match.");

    }

    public void addcart() throws InterruptedException
    {
      addproduct1();
      addproduct2();
      viewcontainer();
      geterrormsgaddcart();
    }
}
