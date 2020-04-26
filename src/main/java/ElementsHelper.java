import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsHelper {
    private WebDriver driver;

    public ElementsHelper(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isElementPresence(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(element));
            return true;
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Web element is not presence: " + element, e);
        }
    }

    public String getElementTextVisibilityOf(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            return driver.findElement(element).getText();
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Web element is not visible within given timeout " + element + " Time " + timeout, e);
        }
    }

    public void clickOnVisibleAndClickableElement(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            driver.findElement(element).click();
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Web element is not visible or not clickable within given timeout " + element + " Time " + timeout, e);
        }
    }

    public WebElement findElement(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            WebElement webElement = wait.until(ExpectedConditions.presenceOfElementLocated(element));
            return webElement;
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Web element is not presence: " + element, e);
        }
    }
}





