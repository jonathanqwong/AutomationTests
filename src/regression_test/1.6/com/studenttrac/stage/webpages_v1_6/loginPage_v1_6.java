package com.studenttrac.stage.webpages_v1_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginPage_v1_6 {
    WebDriver selenium;

    // Home Page URL
    private static String HOMEPAGE_URL = "https://stage.studenttrac.com/#/registration/21";

    // Locators
    @FindBy(how = How.ID, using = "submit")
    WebElement loginBtn;
    @FindBy(how = How.ID, using = "createAccount")
    WebElement createAccountBtn;

    // Constructor
    public loginPage_v1_6(WebDriver selenium) {
        this.selenium = selenium;
        selenium.get(HOMEPAGE_URL);
        PageFactory.initElements(selenium, this);
    }

    public void clickLoginButton() {
        loginBtn.click();
    }

    public void clickCreateAccountButton() {
        createAccountBtn.click();
    }

}
