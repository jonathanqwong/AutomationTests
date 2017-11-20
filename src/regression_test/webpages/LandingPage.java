package webpages;

import objects.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPage {

    // Landing Page URL
    public static String LANDING_PAGE = "/registration/student/landing";

    // Locators
    @FindBy(how = How.ID, using = "getStarted")
    WebElement getStartedBtn;

    public void clickLetsGetStartButton() throws Exception {
        Browser.waitUntilElementIsVisible(By.id("getStarted"));
        Browser.waitForElement( By.id("getStarted"));
        getStartedBtn.click();
    }

}
