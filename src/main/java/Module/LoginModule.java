package Module;

import PageObjectModel.LoginPageLocator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginModule {

   WebDriver driver;

   public LoginModule(WebDriver driver)
   {
       this.driver=driver;
   }
    public void login(String username, String password) throws NoSuchElementException
    {
        driver.findElement(LoginPageLocator.username).sendKeys(username);
        driver.findElement(LoginPageLocator.password).sendKeys(password);
        driver.findElement(LoginPageLocator.loginbtn).click();
    }
    public String getErrorMessage()
    {
        WebElement errormsg=driver.findElement(LoginPageLocator.errormsg);
        String msg=errormsg.getText();
        return msg;
    }
}
