package Module;

import PageObjectModel.OrderFinishPageLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FinishOrderModule {

    WebDriver driver;

    public FinishOrderModule(WebDriver driver)

    {
        this.driver=driver;
    }

    public void finishOrder()
    {
        driver.findElement(OrderFinishPageLocator.Finish).click();

     }
     public void geterrormsgFinishorder()
     {
         WebElement thankYouMessage = driver.findElement(By.className("complete-header"));
         Assert.assertEquals(thankYouMessage.getText().trim(), "Thank you for your order!", "Order completion message is incorrect.");

     }

}
