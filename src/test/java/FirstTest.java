import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.GistPage;
import pages.LoginPage;

public class FirstTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test(priority = 1, groups = "marketplace_tests")
    public void logInPageTest() {
        elements.isElementPresence(loginPage.loginField, 10);
        driver.findElement(loginPage.loginField).sendKeys("volovykandrey@gmail.com");
        driver.findElement(loginPage.passwordField).sendKeys("KPIrttrv81kpi");
        driver.findElement(loginPage.signInButton).click();
    }
}
