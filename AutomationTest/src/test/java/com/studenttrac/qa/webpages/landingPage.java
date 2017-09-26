package com.studenttrac.qa.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class landingPage {
    WebDriver selenium;

    // Landing Page URL
    private static String LANDING_PAGE = "https://qa.studenttrac.com/#/registration/student/landing";

    // Locators
    @FindBy(how = How.ID, using = "getStarted")
    WebElement getStartedBtn;

    // Constructor
    public landingPage(WebDriver selenium) {
        this.selenium = selenium;
        PageFactory.initElements(selenium, this);
        if (!"LandingPage".equalsIgnoreCase(this.selenium.getTitle())){
            selenium.get(LANDING_PAGE);
        }
    }

    public void clickLetsGetStartButton() throws Exception {
        getStartedBtn.click();
        Thread.sleep(3000);
    }



}
