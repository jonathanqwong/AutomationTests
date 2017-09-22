package com.studenttrac.qa.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.text.SimpleDateFormat;
import java.util.Date;

public class landingPage {
    WebDriver selenium;

    // Landing Page URL
    private static String LANDING_PAGE = "https://qa.studenttrac.com/#/registration/student/landing";

    // Constructor
    public landingPage(WebDriver selenium) {
        this.selenium = selenium;
        if (!"LandingPage".equalsIgnoreCase(this.selenium.getTitle())){
            selenium.get(LANDING_PAGE);
        }
    }

    public void clickLetsGetStartButton() {
        selenium.findElement(By.id("getStarted")).click();
    }



}
