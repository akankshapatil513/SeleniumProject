package PageObjectModel;

import org.openqa.selenium.By;

public  class LoginPageLocator extends LoginBaseClass {

  public static By username = By.xpath("//*[@id=\"user-name\"]");
  public static By password = By.xpath("//*[@id=\"password\"]");
  public static By loginbtn = By.id("login-button");
  public static By errormsg = By.xpath("  //*[@id=\"login_button_container\"]/div/form/div[3]");


}