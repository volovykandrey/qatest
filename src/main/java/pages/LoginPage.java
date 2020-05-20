package pages;

import org.openqa.selenium.By;

public class LoginPage {
    public By loginField = By.cssSelector("[id='login_field']");
    public By passwordField = By.cssSelector("[name='password']");
    public By signInButton = By.cssSelector("[value='Sign in']");

}
