import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import pages.LoginPage;

public class FirstTest {
    WebDriver driver = new ChromeDriver();
    ElementsHelper elements = new ElementsHelper(driver);
    LoginPage loginPage = new LoginPage();

    @Test(priority = 1)
    public void logInPageTest() {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();

        driver.get("https://github.com/login");
        driver.manage().window().maximize();

        elements.isElementPresence(loginPage.loginField, 10);
        driver.findElement(loginPage.loginField).sendKeys("volovykandrey@gmail.com");
        driver.findElement(loginPage.passwordField).sendKeys("KPIrttrv81kpi");
        driver.findElement(loginPage.signInButton).click();

        boolean pullRequestsIsDisplayed = driver.findElement(By.cssSelector("[aria-label='Global'] [aria-label='Pull requests you created']"))
                .isDisplayed();

        Assert.assertTrue(pullRequestsIsDisplayed,
                "Pull Requests tab should be displayed, but it returns false for the isDisplayed method");

    }

    @Test(priority = 2)
    public void headerTabsTest() {
        //Tests for header TAbs
    }

    @Test(priority = 3)
    public void yourProfilePage() {
        //Tests for header TAbs
        driver.quit();
    }



}
