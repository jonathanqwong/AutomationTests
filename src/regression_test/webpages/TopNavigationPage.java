package webpages;

import objects.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TopNavigationPage {

    @FindBy(how = How.CLASS_NAME, using = "")
    WebElement topNavigationToggleLink;
    @FindBy(how = How.CLASS_NAME, using = "md-icon-button")
    WebElement hamburger;
    @FindBy(how = How.LINK_TEXT, using = "Home")
    WebElement home;
    @FindBy(how = How.LINK_TEXT, using = "Student Info.")
    WebElement studentInfo;
    @FindBy(how = How.LINK_TEXT, using = "Guides")
    WebElement guides;
    @FindBy(how = How.LINK_TEXT, using = "Ext. Asmt.")
    WebElement extAsmt;
    @FindBy(how = How.LINK_TEXT, using = "Calendar")
    WebElement calendar;
    @FindBy(how = How.LINK_TEXT, using = "Reports")
    WebElement reports;
    @FindBy(how = How.LINK_TEXT, using = "History")
    WebElement history;
    @FindBy(how = How.LINK_TEXT, using = "Registration")
    WebElement registration;
    @FindBy(how = How.LINK_TEXT, using = "Classroom")
    WebElement classroom;

    @FindBy(how = How.CLASS_NAME, using = "")
    WebElement reportLink;

    public void topNavigation(){
        topNavigationToggleLink.click();
    }

    public void clickHamburgerButton() {
        Browser.waitUntilElementIsVisible(By. className("md-icon-button"));
        hamburger.click();
    }

    public void clickHomeButton() {
        Browser.waitUntilElementIsVisible(By.linkText("Home"));
        home.click();
    }

    public void clickGuidesButton() {
        Browser.waitUntilElementIsVisible(By.linkText("Guides"));
        guides.click();
    }

    public void reports(){
        reportLink.click();
    }


}
