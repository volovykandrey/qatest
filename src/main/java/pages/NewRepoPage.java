package pages;

import org.openqa.selenium.By;

public class NewRepoPage {
    public By subheadHeading = By.cssSelector("[class='Subhead-heading']");
    public By subheadDescription = By.xpath("//p[@class='Subhead-description']");
    public By repoNameInputFiled = By.cssSelector("[id='repository_name']");

    //[aria-label='Global'] [href='/explore']
    //h2[@class='Subhead-heading']
}
