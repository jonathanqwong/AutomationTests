package webpages;

import objects.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TopNavigationPage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"header-bar\"]/div/span/button")
    WebElement hamburger;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-bar\"]/div/div[1]")
    WebElement homeLogo;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-bar\"]/div/div[2]/md-menu/button")
    WebElement profileButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"user-menu-content\"]/md-menu-item[1]/button")
    WebElement profileSelectOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"user-menu-content\"]/md-menu-item[2]/button")
    WebElement switchClientSelectOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"user-menu-content\"]/md-menu-item[3]/button")
    WebElement changePasswordSelectOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"user-menu-content\"]/md-menu-item[4]/button")
    WebElement changeLanguageSelectOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"user-menu-content\"]/md-menu-item[5]/button")
    WebElement logOutSelectOption;
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


    public void clickHamburgerButton() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"header-bar\"]/div/span/button"));
        hamburger.click();
    }

    public void clickLogoButton() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"header-bar\"]/div/div[1]"));
        homeLogo.click();
    }

    public void clickProfileButton() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"header-bar\"]/div/div[2]/md-menu/button"));
        profileButton.click();
    }

    public void clickProfileSelectOption() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"user-menu-content\"]/md-menu-item[1]/button"));
        profileSelectOption.click();
    }

    public void clickSwitchClientSelectOption() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"user-menu-content\"]/md-menu-item[2]/button"));
        switchClientSelectOption.click();
    }

    public void clickChangePasswordSelectOption() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"user-menu-content\"]/md-menu-item[3]/button"));
        changePasswordSelectOption.click();
    }

    public void clickChangeLanguageSelectOption() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"user-menu-content\"]/md-menu-item[4]/button"));
        changeLanguageSelectOption.click();
    }

    public void clickLogOutSelectOption() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"user-menu-content\"]/md-menu-item[5]/button"));
        logOutSelectOption.click();
    }

    public void clickHomeButton() {
        openSideNav();
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[1]"));
        home.click();
    }

    public void clickStudentInfoButton() {
        openSideNav();
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[2]"));
        studentInfo.click();
    }

    public void clickGuidesButton() {
        openSideNav();
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[3]"));
        guides.click();
    }

    public void clickExtAsmtButton() {
        openSideNav();
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[4]"));
        extAsmt.click();
    }

    public void clickStudentFilesButton() {
        openSideNav();
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[5]"));
        studentFiles.click();
    }

    public void clickCalendarButton() {
        openSideNav();
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[6]"));
        calendar.click();
    }

    public void clickReportsButton() {
        openSideNav();
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[7]"));
        reports.click();
    }

    public void clickHistoryButton() {
        openSideNav();
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[8]"));
        history.click();
    }

    public void clickRegistrationButton() {
        openSideNav();
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[9]"));
        registration.click();
    }

    public void clickClassroomButton() {
        openSideNav();
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"applications\"]/div[1]/md-sidenav/md-content/md-list/md-list-item[10]"));
        classroom.click();
    }

    /**
     * Will open side navigation if its not already opened
     */
    //TODO this may not work if there are 2 classes on same page with class name "expand"
    public void openSideNav(){
        if( Browser.exists( By.className( "expand")) == false ){
            clickHamburgerButton();
        }
    }

    /**
     * Will close side navigation if its not already closed
     */
    //TODO this may not work if there are 2 classes on same page with class name "expand"
    public void closeSideNav(){
        if( Browser.exists( By.className( "expand"))){
            clickHamburgerButton();
        }
    }

}