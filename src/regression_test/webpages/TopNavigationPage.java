package webpages;

import objects.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TopNavigationPage {

    @FindBy(how = How.CLASS_NAME, using = "")
    WebElement topNavigationToggleLink;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-bar\"]/div/span/button")
    WebElement hamburger;
    @FindBy(how = How.XPATH, using = "//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[1]")
    WebElement home;
    @FindBy(how = How.XPATH, using = "//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[2]")
    WebElement studentInfo;
    @FindBy(how = How.XPATH, using = "//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[3]")
    WebElement guides;
    @FindBy(how = How.XPATH, using = "//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[4]")
    WebElement extAsmt;
    @FindBy(how = How.XPATH, using = "//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[5]")
    WebElement studentFiles;
    @FindBy(how = How.XPATH, using = "//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[6]")
    WebElement calendar;
    @FindBy(how = How.XPATH, using = "//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[7]")
    WebElement reports;
    @FindBy(how = How.XPATH, using = "//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[8]")
    WebElement history;
    @FindBy(how = How.XPATH, using = "//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[9]")
    WebElement registration;
    @FindBy(how = How.XPATH, using = "//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[10]")
    WebElement classroom;

    @FindBy(how = How.CLASS_NAME, using = "")
    WebElement reportLink;

    public void topNavigation(){
        topNavigationToggleLink.click();
    }

    public void clickHamburgerButton() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"header-bar\"]/div/span/button"));
        hamburger.click();
    }

    public void clickHomeButton() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[1]"));
        home.click();
    }

    public void clickStudentInfoButton() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[2]"));
        studentInfo.click();
    }

    public void clickGuidesButton() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[3]"));
        guides.click();
    }

    public void clickExtAsmtButton() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[4]"));
        extAsmt.click();
    }

    public void clickStudentFilesButton() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[5]"));
        studentFiles.click();
    }

    public void clickCalendarButton() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[6]"));
        calendar.click();
    }

    public void clickReportsButton() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[7]"));
        reports.click();
    }

    public void clickHistoryButton() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[8]"));
        history.click();
    }

    public void clickRegistrationButton() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[9]"));
        registration.click();
    }

    public void clickClassroomButton() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[10]"));
        classroom.click();
    }

    public void reports(){
        reportLink.click();
    }


}
