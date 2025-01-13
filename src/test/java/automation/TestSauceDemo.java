package automation;

import PageObjectModel.LoginBaseClass;
import PageObjectModel.LoginPage;
import org.testng.annotations.Test;

public class TestSauceDemo extends LoginBaseClass {

    @Test(priority = 1,dataProvider = "Logindata")
   public void loginPage(String username ,String password, String expectederrormsg)
    {
        driver.findElement(LoginPage.username).sendKeys(username);
        driver.findElement(LoginPage.password).sendKeys(password);
        driver.findElement(LoginPage.loginbtn).click();
    }

    @Test(priority = 2, dependsOnMethods ="loginPage")
    public void addcart()

    {

        driver.findElement(LoginPage.addcardbtn).click();
        driver.findElement(LoginPage.shopping_cartcontainer).click();
    }

    @Test(priority =3 ,dependsOnMethods ="addcart")
    public void checkOut()
    {
        driver.findElement(LoginPage.checkout).click();
    }

    @Test(priority =4 ,dependsOnMethods = "checkOut",dataProvider ="formdata")
    public void detailsUser(String Firstname ,String Lastname,String Postcode)
    {
        driver.findElement(LoginPage.firstname).sendKeys(Firstname);
        driver.findElement(LoginPage.lastname).sendKeys(Lastname);
        driver.findElement(LoginPage.postcode).sendKeys(Postcode);
        driver.findElement(LoginPage.acontinue).click();
    }

    @Test(priority =5 ,dependsOnMethods ="detailsUser")
    public void finishOrder()
    {
        driver.findElement(LoginPage.Finish).click();
    }
}
