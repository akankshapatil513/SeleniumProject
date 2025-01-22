package Module;

import PageObjectModel.RemoveCartitemsLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class RemoveCartItemModule {

    WebDriver driver;

    public RemoveCartItemModule(WebDriver driver)

    {
        this.driver=driver;
    }

    public void removecart() throws InterruptedException
   {
       driver.findElement(RemoveCartitemsLocator.removeitem).click();

   }
   public void getErrorMsgRemoveitem()
   {
       List<WebElement> updatedCartItems = driver.findElements(RemoveCartitemsLocator.removeitem);
       Assert.assertEquals(updatedCartItems.size(), 0, "Cart is not empty after removing products.");

   }
}
