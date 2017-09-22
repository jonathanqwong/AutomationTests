package com.studenttrac.qa.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class accountCreationPage {
    WebDriver selenium;

    // Home Page URL
    private static String ACCOUNT_CREATION_PAGE = "https://qa.studenttrac.com/#/registration/create/21";

    // Locators
    @FindBy(how = How.ID, using = "submit")
    private WebElement createAccount;

    public accountCreationPage(WebDriver selenium) {
        this.selenium = selenium;
        if (!"Chapter 2".equalsIgnoreCase(this.selenium.getTitle())){
            selenium.get(ACCOUNT_CREATION_PAGE);
        }
    }

    public boolean isCreateAccountButtonPresent(String btnTitle) {
        return selenium.findElement(By.id(btnTitle)) != null;
    }

    public void clickButton(String btnTitle) {
        selenium.findElement(By.id(btnTitle)).click();
    }
}
