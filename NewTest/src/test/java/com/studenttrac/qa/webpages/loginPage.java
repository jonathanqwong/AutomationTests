package com.studenttrac.qa.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage {
    WebDriver selenium;

    // Home Page URL
    private static String HOMEPAGE_URL = "https://qa.studenttrac.com/#/registration/21";

    // Locators
    @FindBy(how = How.ID, using = "submit")
    private WebElement loginBtn;

    @FindBy(how = How.ID, using = "createAccount")
    private WebElement createAccountBtn;

    // Constructor
    public loginPage(WebDriver selenium) {
        this.selenium = selenium;
        selenium.get(HOMEPAGE_URL);
    }



}
