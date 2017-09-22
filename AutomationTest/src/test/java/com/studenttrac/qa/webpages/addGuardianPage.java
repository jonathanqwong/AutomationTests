package com.studenttrac.qa.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class addGuardianPage {
    WebDriver selenium;

    // Landing Page URL
    //String personid;
    //private static String LANDING_PAGE = "https://qa.studenttrac.com/" + personid +"/registration/student/landing";

    // Locators
    @FindBy(how = How.CLASS_NAME, using = "addGuardian")
    WebElement addGuardianBtn;
    @FindBy(how = How.CLASS_NAME, using = "save")
    WebElement saveBtn;
    @FindBy(how = How.XPATH, using = "//*[@id='guardiansList']/div[3]/div[2]/button")
    WebElement doneBtn;
    @FindBy(how = How.ID, using = "input_31")
    WebElement guardianFirstName;
    @FindBy(how = How.ID, using = "input_32")
    WebElement guardianLastName;
    @FindBy(how = How.ID, using = "input_33")
    WebElement guardianEmail;
    @FindBy(how = How.ID, using = "input_34")
    WebElement guardianPhone;
    @FindBy(how = How.XPATH, using = "//*[@id=\'select_35\']")
    WebElement relationshipSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\'select_option_40\']")
    WebElement relationshipId;
    @FindBy(how = How.ID, using = "input_37")
    WebElement guardianDateOfBirth;

    // Constructor
    public addGuardianPage(WebDriver selenium) {
        this.selenium = selenium;
        PageFactory.initElements(selenium, this);
    }

    public void clickAddGuardianButton() {
        addGuardianBtn.click();
    }

    public void clickSaveButton() {
        saveBtn.click();
    }

    public void clickDoneButton() {
        doneBtn.click();
    }

    public void fillOutGuardianInfo() {
        guardianFirstName.sendKeys("Dad");
        guardianLastName.sendKeys("Test_" + accountCreationPage.time_Stamp.toString());
        guardianEmail.sendKeys("cufomuhe@kekita.com");
        guardianPhone.sendKeys("(333)333-3333");
        relationshipSelect.click();
        relationshipId.click();
        guardianDateOfBirth.sendKeys("10/10/2010");
    }


}
