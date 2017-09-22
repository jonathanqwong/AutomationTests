package com.studenttrac.qa.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.text.SimpleDateFormat;
import java.util.Date;

public class accountCreationPage {
    WebDriver selenium;

    // Home Page URL
    private static String ACCOUNT_CREATION_PAGE = "https://qa.studenttrac.com/#/registration/create/21";
    static String time_Stamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

    // Constructor
    public accountCreationPage(WebDriver selenium) {
        this.selenium = selenium;
        if (!"CreateAccount".equalsIgnoreCase(this.selenium.getTitle())){
            selenium.get(ACCOUNT_CREATION_PAGE);
        }
    }

    public void fillOutCreateAccountForm() {
        selenium.findElement(By.id("input_3")).sendKeys("Selenium");
        selenium.findElement(By.id("input_5")).sendKeys("Test_" + time_Stamp.toString());
        selenium.findElement(By.id("input_6")).sendKeys("cufomuhe@kekita.com");
        selenium.findElement(By.id("input_7")).sendKeys("(333)333-3333");
        selenium.findElement(By.id("input_8")).sendKeys("10/10/2010");
        selenium.findElement(By.id("input_9")).sendKeys("Sel_Test_" + time_Stamp.toString());
        selenium.findElement(By.id("input_10")).sendKeys("edi");
        selenium.findElement(By.id("input_11")).sendKeys("edi");
    }

    public void clickCreateAccountButton() {
        selenium.findElement(By.id("createAccount")).click();
    }

    public boolean isCreateAccountButtonPresent() {
        return selenium.findElement(By.id("createAccount")) != null;
    }

}
