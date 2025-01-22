package Module;

import PageObjectModel.CheckoutPageLocator;
import org.openqa.selenium.WebDriver;

public class CheckOutModule {

    WebDriver driver;

    public CheckOutModule(WebDriver driver)

    {
        this.driver=driver;
    }

    public void checkOut()
    {
        driver.findElement(CheckoutPageLocator.checkout).click();
    }

}
