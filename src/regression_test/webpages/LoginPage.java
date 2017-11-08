package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static generators.GeneralMethods.ENV;

public class LoginPage {
    WebDriver selenium;

    // Home Page URL
    private static String HOMEPAGE_URL = "https://" + ENV + ".studenttrac.com/#/registration/21";

    // Locators
    @FindBy(how = How.ID, using = "submit")
    WebElement loginBtn;
    @FindBy(how = How.ID, using = "createAccount")
    WebElement createAccountBtn;

    // Constructor
    public LoginPage(WebDriver selenium) {
        this.selenium = selenium;
        selenium.get(HOMEPAGE_URL);
        PageFactory.initElements(selenium, this);
    }

    public void clickCreateAccountButton() {
        createAccountBtn.click();
    }

    public void clickLoginButton() {
        loginBtn.click();
    }

}