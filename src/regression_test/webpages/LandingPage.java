package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static generators.GeneralMethods.ENV;

public class LandingPage {
    WebDriver selenium;
    //WebDriverWait wait = new WebDriverWait(selenium, 10);

    // Landing Page URL
    private static String LANDING_PAGE = "https://" + ENV + ".studenttrac.com/#/registration/student/landing";

    // Locators
    @FindBy(how = How.ID, using = "getStarted")
    WebElement getStartedBtn;

    // Constructor
    public LandingPage(WebDriver selenium) throws Exception {
        this.selenium = selenium;
        PageFactory.initElements(selenium, this);
        if (!"LandingPage".equalsIgnoreCase(this.selenium.getTitle())){
            selenium.get(LANDING_PAGE);
            Thread.sleep(1000);
        }
    }

    public void clickLetsGetStartButton() throws Exception {
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("getStarted")));
        getStartedBtn.click();
        Thread.sleep(3000);
    }



}