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
    @FindBy(how = How.ID, using = "radio_18")
    WebElement gender;
    @FindBy(how = How.XPATH, using = "//*[@id=\'tabular_section_0\']/form-section/div/div/div/div[2]/form-grid[2]/div/table/tbody/tr[5]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select")
    WebElement birthStateSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\'tabular_section_0\']/form-section/div/div/div/div[2]/form-grid[2]/div/table/tbody/tr[5]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select/option[7]")
    WebElement birthStateOption;

    @FindBy(how = How.CLASS_NAME, using = "addAddress")
    WebElement addAddressWidgetBtn;
    @FindBy(how = How.ID, using = "input_74")
    WebElement addressLabel;
    @FindBy(how = How.ID, using = "input_75")
    WebElement addressInput;
    @FindBy(how = How.ID, using = "input_78")
    WebElement addressCity;
    @FindBy(how = How.NAME, using = "RegionCode")
    WebElement addressStateSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"dialogContent_73\"]/div/div/md-input-container[2]/select/option[6]")
    WebElement addressStateOption;
    @FindBy(how = How.ID, using = "input_79")
    WebElement addressPostalCode;
    @FindBy(how = How.XPATH, using = "/html/body/div[4]/md-dialog/form/md-dialog-actions/button")
    WebElement validateBtn;
    @FindBy(how = How.XPATH, using = "/html/body/div[4]/md-dialog/form/md-dialog-actions/button[2]")
    WebElement looksGoodBtn;
    @FindBy(how = How.ID, using = "radio_21")
    WebElement studentNighttimeResidency;
    @FindBy(how = How.ID, using = "radio_33")
    WebElement languageOtherThanEnglishAtHome;

    @FindBy(how = How.XPATH, using = "//*[@id=\'tabular_section_2\']/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[1]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select")
    WebElement homeLanguageSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[1]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select/option[1]")
    WebElement homeLanguageOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td[1]/div/div/magic-field/div/div/div/div/md-input-container/select")
    WebElement firstLanguageSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td[1]/div/div/magic-field/div/div/div/div/md-input-container/select/option[1]")
    WebElement firstLanguageOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select")
    WebElement preferredLanguageSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select/option[1]")
    WebElement preferredLanguageOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[3]/td[1]/div/div/magic-field/div/div/div/div/md-input-container/select")
    WebElement parentLanguageSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[3]/td[1]/div/div/magic-field/div/div/div/div/md-input-container/select/option[1]")
    WebElement parentLanguageOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[3]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select")
    WebElement preferredCommunicationLanguageSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[3]/td[2]/div/div/magic-field/div/div/div/div/md-input-container/select/option[1]")
    WebElement preferredCommunicationLanguageOption;

    @FindBy(how = How.ID, using = "radio_38")
    WebElement previousSchool;
    @FindBy(how = How.ID, using = "radio_40")
    WebElement lastSchoolAttended;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_5\"]/form-section/div/div/div/div[2]/widget-signature/div/div/div[4]/div[2]/span/input")
    WebElement signatureName;
    @FindBy(how = How.CLASS_NAME, using = "saveSignatureBtn")
    WebElement saveSignature;

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
        jse.executeScript("window.scrollBy(0,500)", "");
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
        Thread.sleep(5000);
        looksGoodBtn.click();
        scrollDownToElement();
        studentNighttimeResidency.click();
        SaveNContinueBtn.click();
        Thread.sleep(3000);

        // Education Tabular
        languageOtherThanEnglishAtHome.click();
        homeLanguageSelect.click();
        homeLanguageOption.click();
        firstLanguageSelect.click();
        firstLanguageOption.click();
        preferredLanguageSelect.click();
        preferredLanguageOption.click();
        parentLanguageSelect.click();
        parentLanguageOption.click();
        preferredCommunicationLanguageSelect.click();
        preferredCommunicationLanguageOption.click();
        SaveNContinueBtn.click();
        Thread.sleep(3000);

        // Previous School Tabular
        previousSchool.click();
        lastSchoolAttended.sendKeys("Home School");
        SaveNContinueBtn.click();
        Thread.sleep(3000);

        // Other Information (skip)
        SaveNContinueBtn.click();
        Thread.sleep(3000);

        //Student Signature
        Actions builder = new Actions(selenium);
        WebElement canvas = selenium.findElement(By.className("canvas"));
        Action SignSignature = builder.clickAndHold(canvas)
                .moveByOffset(-40, -60)
                .moveByOffset(20, 20)
                .moveByOffset(100, 150)
                .release(canvas)
                .build();

        SignSignature.perform();
        signatureName.sendKeys("Test Signature");
        saveSignature.click();
        SaveNContinueBtn.click();
        Thread.sleep(3000);
    }


}
