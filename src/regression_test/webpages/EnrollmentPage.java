package webpages;

import objects.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EnrollmentPage {

    // Locators
    @FindBy(how = How.XPATH, using = "//*[@id=\"StudentEnrollmentsController\"]/div/md-content/section[1]/div[2]/div[1]/md-list/md-list-item/div[1]/button")
    WebElement registerBtn;

    public void getEnrollmentPage() throws Exception {
        // Add Guardian Page URL (EX: https://qa.studenttrac.com/#/registration/student/#/guardians)
        Browser.getURL();
    }

    public void clickRegisterButton() throws Exception {
        Browser.waitForElement(By.xpath("//*[@id=\"StudentEnrollmentsController\"]/div/md-content/section[1]/div[2]/div[1]/md-list/md-list-item/div[1]/button"));
        registerBtn.click();
    }
}
