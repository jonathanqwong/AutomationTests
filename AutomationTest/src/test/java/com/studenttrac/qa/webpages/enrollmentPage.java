package com.studenttrac.qa.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class enrollmentPage {
    WebDriver selenium;

    // Select Enrollment Page URL
    private static String ENROLLMENT_PAGE = null;

    // Locators
    @FindBy(how = How.XPATH, using = "//*[@id=\"StudentEnrollmentsController\"]/div/md-content/div[3]/div/md-list/md-list-item/div[1]/button")
    WebElement registerBtn;

    // Constructor
    public enrollmentPage(WebDriver selenium) throws Exception{
        this.selenium = selenium;
        PageFactory.initElements(selenium, this);
//        ENROLLMENT_PAGE = selenium.getCurrentUrl();
//        if (!"Registration".equalsIgnoreCase(this.selenium.getTitle())){
//            selenium.get(ENROLLMENT_PAGE);
//        }
    }

    public void clickRegisterButton() throws Exception {
        registerBtn.click();
        Thread.sleep(5000);
    }
}
