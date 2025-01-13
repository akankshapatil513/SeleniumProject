package automation;
import PageObjectModel.LoginBaseClass;
import PageObjectModel.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Test1 extends LoginBaseClass {


    @Test(priority = 1, dataProvider = "Logindata")
    public void validateLogin(String username, String password, String expectederrormsg) {
        driver.findElement(LoginPage.username).sendKeys(username);
        driver.findElement(LoginPage.password).sendKeys(password);
        driver.findElement(LoginPage.loginbtn).click();
        // WebElement errormsg= driver.findElement(LoginPage.errormsg);
        // String msg= errormsg.getText();
        //assertEquals(msg, expectederrormsg);
        //  }
        driver.findElement(LoginPage.addcardbtn).click();
        driver.findElement(LoginPage.shopping_cartcontainer).click();
        driver.findElement(LoginPage.checkout).click();
        driver.findElement(LoginPage.firstname).sendKeys("Akanksha");
        driver.findElement(LoginPage.lastname).sendKeys("patil");
        driver.findElement(LoginPage.postcode).sendKeys("415212");
        driver.findElement(LoginPage.acontinue).click();
        driver.findElement(LoginPage.Finish).click();
      }
    }





