package tests;

import driver.DriverFactory;
import models.pages.LoginPageModel02;
import org.openqa.selenium.WebDriver;

public class POMModel02Tests {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getWebDriver();
        driver.get("https://");
        LoginPageModel02 loginPage = new LoginPageModel02(driver);
        loginPage.inputUsername("Teo@sth.com");
        loginPage.inputPassword("12345678");
        loginPage.clickOnLoginBtn();
    }
}
