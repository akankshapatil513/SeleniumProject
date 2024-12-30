package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {

    CoorectUsernamecorrectPassword();
    correcUsernameandincorrectPassword();
    IncorrectUsernameandCorrectpassword();
    IncorrectusernameandIncorrectpassword();
    correctusernameNoPassword();
    Nousernameandcorrectpassword();
    NousernameNoPassword();



    }

   static void CoorectUsernamecorrectPassword() {
       //CoorectUsernamecorrectPassword
       ChromeDriver driver = new ChromeDriver();
       driver.get("https://www.saucedemo.com");
       driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
       driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
       driver.findElement(By.id("login-button")).click();
       System.out.println("Login succefully with correctusername and password");
       driver.close();

   }

   static void correcUsernameandincorrectPassword() {
       ChromeDriver driver = new ChromeDriver();
       driver.get("https://www.saucedemo.com");
       driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
       driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauc");
       driver.findElement(By.id("login-button")).click();
       System.out.println();
       System.out.println("correcUsernameandincorrectPasswor");
       WebElement errormsg= driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]"));
       String msg= errormsg.getText();
       System.out.println(msg);
       driver.close();
   }

   static void IncorrectUsernameandCorrectpassword()
   {
       ChromeDriver driver = new ChromeDriver();
       driver.get("https://www.saucedemo.com");
       driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standarduser");
       driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
       driver.findElement(By.id("login-button")).click();
       System.out.println();
       System.out.println("IncorrectUsernameandCorrectpassword");
       WebElement errormsg= driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]"));
       String msg= errormsg.getText();
       System.out.println(msg);
       driver.close();

   }
        static void IncorrectusernameandIncorrectpassword()
        {
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standaruser");
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secet_sauce");
            driver.findElement(By.id("login-button")).click();
            System.out.println();
            System.out.println("IncorrectusernameandIncorrectpassword");
            WebElement errormsg=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]"));
            //WebElement errormsg= driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]"));
            String msg= errormsg.getText();
            System.out.println(msg);
            driver.close();
        }

        static void correctusernameNoPassword()
        {

                ChromeDriver driver = new ChromeDriver();
                driver.get("https://www.saucedemo.com");
                driver.findElement(By.id("user-name")).sendKeys("standard-user");
                driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
                driver.findElement(By.id("login-button")).click();
                System.out.println();
                System.out.println("correctusernameNoPassword");
                WebElement error=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]"));
                String msg1= error.getText();
                System.out.println(msg1);
                driver.close();

        }

        static void Nousernameandcorrectpassword()
        {
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("");
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            System.out.println();
            System.out.println("Nousernameandcorrectpassword");
           WebElement error1=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]"));
            String msg2= error1.getText();
            System.out.println(msg2);
            driver.close();
        }

        static void NousernameNoPassword()
        {
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com");
            driver.findElement(By.id("user-name")).sendKeys("");
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
            driver.findElement(By.id("login-button")).click();
            System.out.println();
            System.out.println("NousernameNoPassword");
            WebElement error2=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]"));
            String msg3= error2.getText();
            System.out.println(msg3);
            driver.close();
        }
    }
