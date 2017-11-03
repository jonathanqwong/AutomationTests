package com.studenttrac.qa.webpages;

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
    @FindBy(how = How.NAME, using = "Title")
    WebElement emailLabel;
    @FindBy(how = How.NAME, using = "EmailAddress")
    WebElement emailInput;

    // Student Info
    @FindBy(how = How.ID, using = "radio_17")
    WebElement gender;
    @FindBy(how = How.XPATH, using = "//*[@id=\'tabular_section_0\']/form-section/div/div/div/div[2]/form-grid[2]/div/table/tbody/tr[5]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select")
    WebElement birthStateSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\'tabular_section_0\']/form-section/div/div/div/div[2]/form-grid[2]/div/table/tbody/tr[5]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select/option[7]")
    WebElement birthStateOption;

    // Contact
    @FindBy(how = How.XPATH, using = "//*[@id=\"dialogContent_72\"]/div/div/md-input-container[2]/select/option[6]")
    WebElement studentAddressStateOption;
    @FindBy(how = How.ID, using = "radio_20")
    WebElement studentNighttimeResidency;

    // Language
    @FindBy(how = How.ID, using = "radio_32")
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
    @FindBy(how = How.ID, using = "radio_37")
    WebElement previousSchool;
    @FindBy(how = How.ID, using = "input_39")
    WebElement lastSchoolAttended;

    // Guardian Contact Info
    @FindBy(how = How.XPATH, using = "//*[@id=\"dialogContent_199\"]/div/div/md-input-container[2]/select/option[6]")
    WebElement guardianAddressStateOption;

    // Parent Guardian Profile
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr/td[1]/div/div/magic-field/div/div/div/div/md-input-container/select")
    WebElement guardianEducationLevelSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr/td[1]/div/div/magic-field/div/div/div/div/md-input-container/select/option[3]")
    WebElement guardianEducationLevelOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr/td[2]/div/div/magic-field/div/div/div/md-input-container/div/div[1]/md-checkbox/div[1]")
    WebElement guardianEducationMilitaryStatus;

    // Emergency/Health
    @FindBy(how = How.ID, using = "radio_259")
    WebElement releaseQuestion1;
    @FindBy(how = How.ID, using = "radio_261")
    WebElement releaseQuestion2;
    @FindBy(how = How.ID, using = "radio_266")
    WebElement healthQuestion1;
    @FindBy(how = How.ID, using = "radio_294")
    WebElement medicalQuestion1;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_4\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td/div/div/magic-field/div/div/div/md-input-container/div/div/md-checkbox/div[1]")
    WebElement medicalQuestion2;
    @FindBy(how = How.ID, using = "radio_297")
    WebElement medicalQuestion3;

    // Photographic Consent
    @FindBy(how = How.ID, using = "radio_275")
    WebElement photographicConsent;

    // Internet Access
    @FindBy(how = How.ID, using = "//*[@id=\"instanceBody\"]/form-section[2]/div/div/div/div[2]/form-grid/div/table/tbody/tr/td/div/div/magic-field/div/div/div/md-input-container/div/div/md-checkbox/div[1]/div[1]")
    WebElement internetAccessConsent;

    // Physical Education

    // Transportation Consent

    // Affidavit of Non-Attendance

    // Master Agreement

    // Constructor
    public registrationFormPage(WebDriver selenium) throws Exception {
        this.selenium = selenium;
        PageFactory.initElements(selenium, this);
        REGISTRATION_FORM_PAGE = selenium.getCurrentUrl();
        if (!"Registration".equalsIgnoreCase(this.selenium.getTitle())){
            Thread.sleep(2000);
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
        Thread.sleep(2000);
        addEmailWidgetBtn.click();
        Thread.sleep(2000);
        scrollDownToElement();
        SaveNContinueBtn.click();
        Thread.sleep(2000);

        // Survey
        SaveNContinueBtn.click();
        Thread.sleep(2000);

        // Parent/Guardian Profile
        guardianEducationLevelSelect.click();
        guardianEducationLevelOption.click();
        Thread.sleep(1000);
        guardianEducationMilitaryStatus.click();
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

    public void fillOutEmergencyHealthForm() throws Exception {
        // Release Authorization
        releaseQuestion1.click();
        releaseQuestion2.click();
        SaveNContinueBtn.click();
        Thread.sleep(2000);

        // Health Information
        healthQuestion1.click();
        SaveNContinueBtn.click();
        Thread.sleep(2000);

        // Medical Authorization
        medicalQuestion1.click();
        SaveNContinueBtn.click();
        Thread.sleep(2000);

        // Emergency Treatment Authorization
        medicalQuestion2.click();
        medicalQuestion3.click();
        SaveNContinueBtn.click();
        Thread.sleep(2000);

        // Student Signature
        signSignature();
        signatureName.sendKeys("Test Signature");
        saveSignature.click();
        Thread.sleep(3000);
        SaveNContinueBtn.click();
        Thread.sleep(2000);

        // Guardian Signature
        signSignature();
        signatureName.sendKeys("Test Signature");
        saveSignature.click();
        Thread.sleep(3000);
        SaveNContinueBtn.click();
        Thread.sleep(2000);
    }

    public void fillOutPhotoConsent() throws Exception {
        photographicConsent.click();
        scrollDownToElement();
        signSignature();
        signatureName.sendKeys("Test Signature");
        saveSignature.click();
        SaveNContinueBtn.click();
        Thread.sleep(2000);

    }


}
