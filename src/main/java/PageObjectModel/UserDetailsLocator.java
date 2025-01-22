package PageObjectModel;

import org.openqa.selenium.By;

public class UserDetailsLocator {

    public static By firstname=By.xpath("//*[@id=\"first-name\"]");
    public static By lastname=By.id("last-name");
    public static By postcode=By.id("postal-code");
    public static By acontinue=By.xpath("//*[@id=\"continue\"]");

}
