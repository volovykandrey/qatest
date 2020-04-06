import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    WebDriver driver;

    @Test(priority = 1)
    public void firstTest() {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
