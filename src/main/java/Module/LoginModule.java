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
        enterUsername(username);
        enterPassword(password);
        enterloginbtn();
    }

    public void enterUsername(String username)
    {
        driver.findElement(LoginPageLocator.username).sendKeys(username);

    }
    public void enterPassword(String password)
    {
        driver.findElement(LoginPageLocator.password).sendKeys(password);

    }
    public void enterloginbtn()
    {
        driver.findElement(LoginPageLocator.loginbtn).click();

    }
    public String getErrorMessage()
    {
        WebElement errormsg=driver.findElement(LoginPageLocator.errormsg);
         String msg=errormsg.getText();
        return msg;
    }
}
