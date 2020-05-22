package testcases;

import org.testng.annotations.Test;
import pages.LoginPage;
import testbase.TestBase;

public class FirstTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test(priority = 1, groups = "smoke_test")
    public void logInPageTest() {
        elements.isElementPresence(loginPage.loginField, 10);
        elements.textInputField(loginPage.loginField, 10, "volovykandrey@gmail.com");
        driver.findElement(loginPage.passwordField).sendKeys("KPIrttrv81kpi");
        driver.findElement(loginPage.signInButton).click();
        System.out.println("This is test branch, Penis");
    }
}
