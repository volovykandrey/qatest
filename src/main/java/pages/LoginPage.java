package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPage {
    public int number = 5;
    public boolean isPresent = true;
    public By loginField = By.cssSelector("[id='login_field']");
    public By passwordField = By.cssSelector("[name='password']");
    public By signInButton = By.cssSelector("[value='Sign in']");

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();

        //loginPage.smth("бай");
    }


}
