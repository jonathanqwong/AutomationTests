package com.studenttrac.qa.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.text.SimpleDateFormat;
import java.util.Date;

public class accountCreationPage {
    WebDriver selenium;

    // Home Page URL
    private static String ACCOUNT_CREATION_PAGE = "https://qa.studenttrac.com/#/registration/create/21";
    static String time_Stamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

    // Locators
    @FindBy(how = How.ID, using = "createAccount")
    WebElement createAccountBtn;
    @FindBy(how = How.ID, using = "input_3")
    WebElement firstName;
    @FindBy(how = How.ID, using = "input_5")
    WebElement lastName;
    @FindBy(how = How.ID, using = "input_6")
    WebElement email;
    @FindBy(how = How.ID, using = "input_7")
    WebElement phone;
    @FindBy(how = How.ID, using = "input_8")
    WebElement birthdate;
    @FindBy(how = How.ID, using = "input_9")
    WebElement username;
    @FindBy(how = How.ID, using = "input_10")
    WebElement password;
    @FindBy(how = How.ID, using = "input_11")
    public WebElement password_confirmation;

    // Constructor
    public accountCreationPage(WebDriver selenium) {
        this.selenium = selenium;
        PageFactory.initElements(selenium, this);
        if (!"CreateAccount".equalsIgnoreCase(this.selenium.getTitle())){
            selenium.get(ACCOUNT_CREATION_PAGE);
        }
    }

    public void fillOutCreateAccountForm() {
        firstName.sendKeys("Selenium");
        lastName.sendKeys("Test_" + time_Stamp.toString());
        email.sendKeys("cufomuhe@kekita.com");
        phone.sendKeys("(333)333-3333");
        birthdate.sendKeys("10/10/2010");
        username.sendKeys("Sel_Test_" + time_Stamp.toString());
        password.sendKeys("edi");
        password_confirmation.sendKeys("edi");

//        selenium.findElement(By.id("input_3")).sendKeys("Selenium");
//        selenium.findElement(By.id("input_5")).sendKeys("Test_" + time_Stamp.toString());
//        selenium.findElement(By.id("input_6")).sendKeys("cufomuhe@kekita.com");
//        selenium.findElement(By.id("input_7")).sendKeys("(333)333-3333");
//        selenium.findElement(By.id("input_8")).sendKeys("10/10/2010");
//        selenium.findElement(By.id("input_9")).sendKeys("Sel_Test_" + time_Stamp.toString());
//        selenium.findElement(By.id("input_10")).sendKeys("edi");
//        selenium.findElement(By.id("input_11")).sendKeys("edi");
    }

    public void clickCreateAccountButton() throws Exception {
        createAccountBtn.click();
        Thread.sleep(3000);
    }

    public boolean isCreateAccountButtonPresent() {
        return createAccountBtn != null;
    }

}
