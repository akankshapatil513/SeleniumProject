package PageObjectModel;

import org.openqa.selenium.By;

public  class LoginPage {



  public static By username= By.xpath("//*[@id=\"user-name\"]");
  public static By password=By.xpath("//*[@id=\"password\"]");
  public static By loginbtn=By.id("login-button");
  public static By errormsg=By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]");
  public static By addcardbtn=By.cssSelector("#add-to-cart-sauce-labs-backpack");
  public static By shopping_cartcontainer=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
  public static By checkout=By.xpath("//*[@id=\"checkout\"]");
  public static By firstname=By.xpath("//*[@id=\"first-name\"]");
  public static By lastname=By.id("last-name");
  public static By postcode=By.id("postal-code");
  public static By acontinue=By.xpath("//*[@id=\"continue\"]");
  public static By Finish=By.xpath("//*[@id=\"finish\"]");
}
