package testbase;

import helpers.ElementsHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestBase {
    public WebDriver driver; //Firefox
    public ElementsHelper elements;
    public String testUrl = "https://github.com/login";

    @BeforeGroups(groups = "smoke_test")
    @Parameters("browser")
    public void setUp(Browsers browser) {
        switch (browser) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case IE11:
                //IE11 driver
                break;
            case EDGE:
                //Edge driver
                break;
            default:
                throw new RuntimeException("Invalid specified browser: " + browser + ", expected one of 'CHROME', 'FIREFOX', 'EDGE', 'IE11'");
        }
        //driver = Firefox;

        elements = new ElementsHelper(driver); //driver -> Firefox
        driver.get(testUrl);
        driver.manage().window().maximize();
    }

    @AfterGroups(groups = "smoke_test")
    public void tearDown() {
        driver.quit();
    }

}
