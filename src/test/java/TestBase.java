import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.util.logging.Level;

public class TestBase {
    WebDriver driver;
    ElementsHelper elements;
    public String testUrl = "https://github.com/login";
    public static LoggingPreferences logPrefs;

    //@BeforeGroups(groups = {"marketplace_tests"})
    @BeforeSuite
    @Parameters("browser")
    public void setUp(Browsers browser) {
        switch (browser) {
            case CHROME:
                ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
                driver = new ChromeDriver();
                break;
            case FIREFOX:
               //FIREFOX driver
                break;
            case IE11:
                //IE11 driver
                break;
            case EDGE:
                //Edge driver
                break;
            case LOCALCHROME:
                ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
                ChromeOptions options = new ChromeOptions();
                options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
                logPrefs = new LoggingPreferences();
                logPrefs.enable(LogType.BROWSER, Level.ALL);
                options.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
                driver = new ChromeDriver(options);
                break;
            default:
                throw new RuntimeException("Invalid specified browser: " + browser + ", expected one of 'CHROME', 'HEADLESS', 'FIREFOX', 'EDGE', 'IE11' or SAFARI");
        }

        elements = new ElementsHelper(driver);
        driver.get(testUrl);
        driver.manage().window().maximize();
    }

    //@AfterGroups(groups = {"marketplace_tests"})
    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

}
