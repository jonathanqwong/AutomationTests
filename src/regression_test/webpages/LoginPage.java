package webpages;

import objects.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    // Home Page URL
    public static String HOMEPAGE_URL = "/registration/21";

    // Locators
    @FindBy(how = How.ID, using = "submit")
    WebElement loginBtn;
    @FindBy(how = How.ID, using = "createAccount")
    WebElement createAccountBtn;
    @FindBy(how = How.ID, using = "username")
    WebElement username;
    @FindBy(how = How.ID, using = "password")
    WebElement password;

    public void clickCreateAccountButton() {
        Browser.waitForElementWithID("createAccount");
        createAccountBtn.click();
    }

    public void clickLoginButton() {
        Browser.waitForElementWithID("submit");
        loginBtn.click();
    }

    public void inputLoginCredentials(String Username, String Password) {
        username.sendKeys(Username);
        password.sendKeys(Password);
    }

    /**
     * Take us to the Login Page
     */
    public void goTo(){
        //Browser.goTo("");
    }

    public boolean IsAt(){
       //return Browser.Title().contains("");
        return true;
    }

}
