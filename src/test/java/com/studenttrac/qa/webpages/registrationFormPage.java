package com.studenttrac.qa.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
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

    // Widgets
    @FindBy(how = How.CLASS_NAME, using = "addAddress")
    WebElement addAddressWidgetBtn;
    @FindBy(how = How.NAME, using = "Title")
    WebElement addressLabel;
    @FindBy(how = How.NAME, using = "Address1")
    WebElement addressInput;
    @FindBy(how = How.NAME, using = "Locality")
    WebElement addressCity;
    @FindBy(how = How.NAME, using = "RegionCode")
    WebElement addressStateSelect;
    @FindBy(how = How.NAME, using = "PostalCode")
    WebElement addressPostalCode;
    @FindBy(how = How.XPATH, using = "/html/body/div[4]/md-dialog/form/md-dialog-actions/button")
    WebElement validateBtn;
    @FindBy(how = How.XPATH, using = "/html/body/div[4]/md-dialog/form/md-dialog-actions/button[2]")
    WebElement looksGoodBtn;
    @FindBy(how = How.CLASS_NAME, using = "canvas")
    WebElement signatureWidget;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_5\"]/form-section/div/div/div/div[2]/widget-signature/div/div/div[4]/div[2]/span/input")
    WebElement signatureName;
    @FindBy(how = How.CLASS_NAME, using = "saveSignatureBtn")
    WebElement saveSignature;
    @FindBy(how = How.CLASS_NAME, using = "addEmail")
    WebElement addEmailWidgetBtn;

    // Student Info
    @FindBy(how = How.ID, using = "radio_19")
    WebElement gender;
    @FindBy(how = How.XPATH, using = "//*[@id=\'tabular_section_0\']/form-section/div/div/div/div[2]/form-grid[2]/div/table/tbody/tr[5]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select")
    WebElement birthStateSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\'tabular_section_0\']/form-section/div/div/div/div[2]/form-grid[2]/div/table/tbody/tr[5]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select/option[7]")
    WebElement birthStateOption;


    // Contact
    @FindBy(how = How.XPATH, using = "//*[@id=\"dialogContent_73\"]/div/div/md-input-container[2]/select/option[6]")
    WebElement studentAddressStateOption;
    @FindBy(how = How.ID, using = "radio_23")
    WebElement studentNighttimeResidency;

    // Language
    @FindBy(how = How.ID, using = "radio_35")
    WebElement languageOtherThanEnglishAtHome;
    @FindBy(how = How.XPATH, using = "//*[@id=\'tabular_section_2\']/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[1]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select")
    WebElement homeLanguageSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[1]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select/option[2]")
    WebElement homeLanguageOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td[1]/div/div/magic-field/div/div/div/div/md-input-container/select")
    WebElement firstLanguageSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td[1]/div/div/magic-field/div/div/div/div/md-input-container/select/option[2]")
    WebElement firstLanguageOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select")
    WebElement preferredLanguageSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select/option[2]")
    WebElement preferredLanguageOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[3]/td[1]/div/div/magic-field/div/div/div/div/md-input-container/select")
    WebElement parentLanguageSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[3]/td[1]/div/div/magic-field/div/div/div/div/md-input-container/select/option[2]")
    WebElement parentLanguageOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[3]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select")
    WebElement preferredCommunicationLanguageSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[3]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select/option[2]")
    WebElement preferredCommunicationLanguageOption;

    // Education
    @FindBy(how = How.ID, using = "radio_40")
    WebElement previousSchool;
    @FindBy(how = How.ID, using = "input_42")
    WebElement lastSchoolAttended;

    // Guardian Contact Info
    @FindBy(how = How.XPATH, using = "//*[@id=\"dialogContent_201\"]/div/div/md-input-container[2]/select/option[6]")
    WebElement guardianAddressStateOption;



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
        JavascriptExecutor jse = (JavascriptExecutor)selenium;
        jse.executeScript("window.scrollBy(0,600)", "");
    }

    public void signSignature() {
        Actions builder = new Actions(selenium);
        Action SignSignature = builder.clickAndHold(signatureWidget)
                .moveByOffset(-100, -100)
                .moveByOffset(20, 20)
                .moveByOffset(100, 150)
                .release(signatureWidget)
                .build();

        SignSignature.perform();
    }

    public void fillOutStudentApplicationForm() throws Exception {

        // Student Information Tabular
        scrollDownToElement();
        gender.click();
        birthStateSelect.click();
        birthStateOption.click();
        SaveNContinueBtn.click();
        Thread.sleep(2000);

        // Contact Tabular
        scrollDownToElement();
        addAddressWidgetBtn.click();
        addressLabel.sendKeys("Home");
        addressInput.sendKeys("3400 E Foothill Blvd.");
        addressCity.sendKeys("Pasadena");
        addressStateSelect.click();
        studentAddressStateOption.click();
        addressPostalCode.sendKeys("91107");
        validateBtn.click();
        Thread.sleep(2000);
        looksGoodBtn.click();
        Thread.sleep(2000);
        scrollDownToElement();
        studentNighttimeResidency.click();
        SaveNContinueBtn.click();
        Thread.sleep(2000);

        // Education Tabular
        languageOtherThanEnglishAtHome.click();
        homeLanguageSelect.click();
        homeLanguageOption.click();
        Thread.sleep(1000);
        firstLanguageSelect.click();
        firstLanguageOption.click();
        Thread.sleep(1000);
        preferredLanguageSelect.click();
        preferredLanguageOption.click();
        Thread.sleep(1000);
        parentLanguageSelect.click();
        parentLanguageOption.click();
        Thread.sleep(1000);
        preferredCommunicationLanguageSelect.click();
        preferredCommunicationLanguageOption.click();
        Thread.sleep(1000);
        SaveNContinueBtn.click();
        Thread.sleep(1000);

        // Previous School Tabular
        previousSchool.click();
        lastSchoolAttended.sendKeys("Home School");
        SaveNContinueBtn.click();
        Thread.sleep(2000);

        // Other Information (skip)
        SaveNContinueBtn.click();
        Thread.sleep(2000);

        // Signature Tabular
        signSignature();
        signatureName.sendKeys("Test Signature");
        saveSignature.click();
        Thread.sleep(3000);
        SaveNContinueBtn.click();
        Thread.sleep(2000);
    }

    public void fillOutHouseHoldInfoForm() throws Exception {

        // Parents/Guardians/Emergency Contact
        scrollDownToElement();
        addAddressWidgetBtn.click();
        addressLabel.sendKeys("Home");
        addressInput.sendKeys("3400 E Foothill Blvd.");
        addressCity.sendKeys("Pasadena");
        addressStateSelect.click();
        guardianAddressStateOption.click();
        addressPostalCode.sendKeys("91107");
        validateBtn.click();
        Thread.sleep(2000);
        looksGoodBtn.click();
        // Left off at guardian widget, email
        addEmailWidgetBtn.click();
        Thread.sleep(2000);
        scrollDownToElement();



    }



}
