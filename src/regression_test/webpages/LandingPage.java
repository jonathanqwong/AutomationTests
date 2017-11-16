package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPage {
    //WebDriverWait wait = new WebDriverWait(selenium, 10);

    // Landing Page URL
    public static String LANDING_PAGE = "/registration/student/landing";

    // Locators
    @FindBy(how = How.ID, using = "getStarted")
    WebElement getStartedBtn;

    public void clickLetsGetStartButton() throws Exception {
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("getStarted")));
        Thread.sleep(2000);
        getStartedBtn.click();

    }

}
