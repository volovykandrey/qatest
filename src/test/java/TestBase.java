import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class TestBase {
    WebDriver driver;
    ElementsHelper elements;
    public String testUrl = "https://github.com/login";

    @BeforeSuite
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

        elements = new ElementsHelper(driver);
        driver.get(testUrl);
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

}
