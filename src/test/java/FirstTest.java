import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;

public class FirstTest {
    WebDriver driver;

    @Test(priority = 1)
    public void firstTest() {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();

        driver = new ChromeDriver();
        driver.get("https://github.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("[id='login_field']")).sendKeys("Оля молодец");

        driver.quit();

    }

    //@Test(priority = 2)
    public void secondTest() {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        driver.get("https://gitlab.com/");
        driver.manage().window().maximize();

        driver.quit();

    }
}
