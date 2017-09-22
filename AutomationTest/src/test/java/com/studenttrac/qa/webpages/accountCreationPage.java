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
    static String time_Stamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

    // Locators
    @FindBy(how = How.ID, using = "createAccount")
    private WebElement createAccountBtn;
    @FindBy(how = How.ID, using = "input_3")
    private WebElement firstName;
    @FindBy(how = How.ID, using = "input_5")
    private WebElement lastName;
    @FindBy(how = How.ID, using = "input_6")
    private WebElement email;
    @FindBy(how = How.ID, using = "input_7")
    private WebElement phone;
    @FindBy(how = How.ID, using = "input_8")
    private WebElement birthdate;
    @FindBy(how = How.ID, using = "input_9")
    private WebElement username;
    @FindBy(how = How.ID, using = "input_10")
    private WebElement password;
    @FindBy(how = How.ID, using = "input_11")
    private WebElement password_confirmation;

    // Constructor
    public accountCreationPage(WebDriver selenium) {
        this.selenium = selenium;
        if (!"CreateAccount".equalsIgnoreCase(this.selenium.getTitle())){
            selenium.get(ACCOUNT_CREATION_PAGE);
        }
    }

    public void fillOutCreateAccoutnForm() {
        firstName.sendKeys("Selenium");
        lastName.sendKeys("Test_" + time_Stamp.toString());
        email.sendKeys("cufomuhe@kekita.com");
        phone.sendKeys("(333)333-3333");
        birthdate.sendKeys("10/10/2010");
        username.sendKeys("Sel_Test_" + time_Stamp.toString());
        password.sendKeys("edi");
        password_confirmation.sendKeys("edi");
    }

    public void clickCreateAccountButton() {
        createAccountBtn.click();
    }

    public boolean isCreateAccountButtonPresent() {
        return createAccountBtn != null;
    }

}
