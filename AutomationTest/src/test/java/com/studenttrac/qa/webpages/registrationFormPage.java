package com.studenttrac.qa.webpages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class registrationFormPage {
    WebDriver selenium;

    // Registration Form Page URL
    private static String REGISTRATION_FORM_PAGE = null;

    // Locators
    @FindBy(how = How.CLASS_NAME, using = "instanceSaveBtn")
    WebElement SaveNContinueBtn ;
    @FindBy(how = How.ID, using = "radio_18")
    WebElement gender;
    @FindBy(how = How.XPATH, using = "//*[@id=\'tabular_section_0\']/form-section/div/div/div/div[2]/form-grid[2]/div/table/tbody/tr[5]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select")
    WebElement birthStateSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\'tabular_section_0\']/form-section/div/div/div/div[2]/form-grid[2]/div/table/tbody/tr[5]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select/option[7]")
    WebElement birthStateOption;
    @FindBy(how = How.CLASS_NAME, using = "addAddress")
    WebElement addAddressWidgetBtn;
    @FindBy(how = How.ID, using = "input_90")
    WebElement addressLabel;
    @FindBy(how = How.ID, using = "input_91")
    WebElement addressInput;
    @FindBy(how = How.ID, using = "input_94")
    WebElement addressCity;
    @FindBy(how = How.NAME, using = "RegionCode")
    WebElement addressStateSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"dialogContent_89\"]/div/div/md-input-container[2]/select/option[6]")
    WebElement addressStateOption;
    @FindBy(how = How.ID, using = "input_95")
    WebElement addressPostalCode;
    @FindBy(how = How.XPATH, using = "/html/body/div[4]/md-dialog/form/md-dialog-actions/button")
    WebElement validateBtn;
    @FindBy(how = How.XPATH, using = "/html/body/div[4]/md-dialog/form/md-dialog-actions/button[2]")
    WebElement looksGoodBtn;

    // Constructor
    public registrationFormPage(WebDriver selenium) {
        this.selenium = selenium;
        PageFactory.initElements(selenium, this);
        REGISTRATION_FORM_PAGE = selenium.getCurrentUrl();
        if (!"Registration".equalsIgnoreCase(this.selenium.getTitle())){
            selenium.get(REGISTRATION_FORM_PAGE);
        }
    }

    public void scrollDownToElement() {
        ((JavascriptExecutor)selenium).executeScript("window.scrollTo(0,document.body.scr‌​ollHeight);");
    }

    public void fillOutStudentApplicationForm() throws Exception {

        // Student Information Tabular
        scrollDownToElement();
        gender.click();
        birthStateSelect.click();
        birthStateOption.click();
        SaveNContinueBtn.click();
        Thread.sleep(3000);

        // Contact Tabular
        scrollDownToElement();
        addAddressWidgetBtn.click();
        addressLabel.sendKeys("Home");
        addressInput.sendKeys("3400 E Foothill Blvd.");
        addressCity.sendKeys("Pasadena");
        addressStateSelect.click();
        addressStateOption.click();
        addressPostalCode.sendKeys("91107");
        validateBtn.click();
        Thread.sleep(2000);
        looksGoodBtn.click();
        scrollDownToElement();


    }


}
