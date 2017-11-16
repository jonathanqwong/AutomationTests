package webpages;

import objects.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static objects.Browser.selenium;

public class RegistrationFormPage {

    // Locators
    @FindBy(how = How.CLASS_NAME, using = "instanceSaveBtn")
    WebElement SaveNContinueBtn;
    @FindBy(how = How.CLASS_NAME, using = "finalize-submit-btn")
    WebElement finalizeNSubmitBtn;
    @FindBy(how = How.ID, using = "backToMainUrl")
    WebElement gotItBtn;

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
    @FindBy(how = How.CLASS_NAME, using = "addEmail")
    WebElement addEmailWidgetBtn;
    @FindBy(how = How.NAME, using = "Title")
    WebElement emailLabel;
    @FindBy(how = How.NAME, using = "EmailAddress")
    WebElement emailInput;

    // Signatures
    @FindBy(how = How.CLASS_NAME, using = "canvas")
    WebElement signatureWidget;
    @FindBy(how = How.CLASS_NAME, using = "saveSignatureBtn")
    WebElement saveSignature;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_5\"]/form-section/div/div/div/div[2]/widget-signature/div/div/div[4]/div[2]/span/input")
    WebElement signatureNameInStudentApplication;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_5\"]/form-section/div/div/div/div[2]/widget-signature/div/div/div[4]/div[2]/span/input")
    WebElement studentSignatureNameInEmergencyHealth;
    @FindBy(how = How.XPATH, using = "//*[@id=\"instanceBody\"]/form-section[3]/div/div/div/div[2]/widget-signature/div/div/div[4]/div[2]/span/input")
    WebElement studentSignatureNameInPhotographicConsent;
    @FindBy(how = How.XPATH, using = "//*[@id=\"instanceBody\"]/form-section[3]/div/div/div/div[2]/widget-signature/div/div/div[4]/div[2]/span/input")
    WebElement studentSignatureNameInternetAccessPolicy;
    @FindBy(how = How.XPATH, using = "//*[@id=\"instanceBody\"]/form-section[3]/div/div/div/div[2]/widget-signature/div/div/div[4]/div[2]/span/input")
    WebElement studentSignatureNamePhysicalEducationConsent;
    @FindBy(how = How.XPATH, using = "//*[@id=\"instanceBody\"]/form-section[3]/div/div/div/div[2]/widget-signature/div/div/div[4]/div[2]/span/input")
    WebElement studentSignatureNameTransportationConsent;
    @FindBy(how = How.XPATH, using = "//*[@id=\"instanceBody\"]/form-section[2]/div/div/div/div[2]/widget-signature/div/div/div[4]/div[2]/span/input")
    WebElement studentSignatureNameAffidavitConsent;
    @FindBy(how = How.XPATH, using = "//*[@id=\"instanceBody\"]/form-section[4]/div/div/div/div[2]/widget-signature/div/div/div[4]/div[2]/span/input")
    WebElement studentSignatureNameMA;
    // Not In-Use Guaridan Signatures
//    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_3\"]/form-section/div/div/div/div[2]/widget-signature/div/div/div[4]/div[2]/span/input")
//    WebElement guardianSignatureNameInHouseholdInfo;
//    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_6\"]/form-section/div/div/div/div[2]/widget-signature/div/div/div[4]/div[2]/span/input")
//    WebElement guardianSignatureNameInEmergencyHealth;
//    @FindBy(how = How.XPATH, using = "//*[@id=\"instanceBody\"]/form-section[4]/div/div/div/div[2]/widget-signature/div/div/div[4]/div[2]/span/input")
//    WebElement guardianSignatureNameInPhotographicConsent;
//    @FindBy(how = How.XPATH, using = "//*[@id=\"instanceBody\"]/form-section[3]/div/div/div/div[2]/widget-signature/div/div/div[4]/div[2]/span/input")
//    WebElement guardianSignatureNameInternetAccessPolicy;
//    @FindBy(how = How.XPATH, using = "//*[@id=\"instanceBody\"]/form-section[4]/div/div/div/div[2]/widget-signature/div/div/div[4]/div[2]/span/input")
//    WebElement guardianSignatureNamePhysicalEducationConsent;
//    @FindBy(how = How.XPATH, using = "//*[@id=\"instanceBody\"]/form-section[3]/div/div/div/div[2]/widget-signature/div/div/div[4]/div[2]/span/input")
//    WebElement guardianSignatureNameTransportationConsent;
//    @FindBy(how = How.XPATH, using = "//*[@id=\"instanceBody\"]/form-section[4]/div/div/div/div[2]/widget-signature/div/div/div[4]/div[2]/span/input")
//    WebElement guardianSignatureNameAffidavitConsent;
//    @FindBy(how = How.XPATH, using = "//*[@id=\"instanceBody\"]/form-section[5]/div/div/div/div[2]/widget-signature/div/div/div[4]/div[2]/span/input")
//    WebElement guardianSignatureNameMA;

    // Student Info
    @FindBy(how = How.ID, using = "radio_16")
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
    @FindBy(how = How.ID, using = "radio_38")
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
    @FindBy(how = How.ID, using = "radio_241")
    WebElement releaseQuestion1;
    @FindBy(how = How.ID, using = "radio_242")
    WebElement releaseQuestion2;
    @FindBy(how = How.ID, using = "radio_247")
    WebElement healthQuestion1;
    @FindBy(how = How.ID, using = "radio_275")
    WebElement medicalQuestion1;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_4\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td/div/div/magic-field/div/div/div/md-input-container/div/div/md-checkbox/div[1]")
    WebElement medicalQuestion2;
    @FindBy(how = How.ID, using = "radio_278")
    WebElement medicalQuestion3;

    // Photographic Consent
    @FindBy(how = How.ID, using = "radio_301")
    WebElement photographicConsent;

    // Internet Access
    @FindBy(how = How.XPATH, using = "//*[@id=\"instanceBody\"]/form-section[2]/div/div/div/div[2]/form-grid/div/table/tbody/tr/td/div/div/magic-field/div/div/div/md-input-container/div/div/md-checkbox/div[1]")
    WebElement internetAccessConsent;

    // Physical Education
    @FindBy(how = How.ID, using = "radio_325")
    WebElement physicalEducationConsent;

    // Transportation Consent
    @FindBy(how = How.ID, using = "radio_339")
    WebElement transportationConsent;

    // Affidavit of Non-Attendance
    @FindBy(how = How.XPATH, using = "//*[@id=\"instanceBody\"]/form-section[1]/div/div/div/div[2]/form-grid[3]/div/table/tbody/tr[2]/td/div/div/magic-field/div/div/div/md-input-container/div/div/md-checkbox/div[1]")
    WebElement affidavitConsent;

    // Master Agreement
    @FindBy(how = How.ID, using = "input_385")
    WebElement MAInput;
    @FindBy(how = How.XPATH, using = "//*[@id=\"instanceBody\"]/form-section[3]/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td/div/div/magic-field/div/div/div/md-input-container/div/div/md-checkbox")
    WebElement MAAgreement;

    public void getRegistrationFormsPage() throws Exception {
        // Add Guardian Page URL (EX: https://qa.studenttrac.com/#/registration/student/#/guardians)
        Thread.sleep(5000);
        Browser.getURL();
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

    public void signGuardianSignature() {
        Actions builder = new Actions(selenium);
        Action SignGuardianSignature = builder.clickAndHold(signatureWidget)
                .moveByOffset(-200, -200)
                .moveByOffset(150, 150)
                .moveByOffset(300, 150)
                .release(signatureWidget)
                .build();

        SignGuardianSignature.perform();
    }

    public void clickFinalizeNSubmitButton() throws Exception {
        finalizeNSubmitBtn.click();
        Thread.sleep(3000);
    }

    public void clickGotItButton() throws Exception {
        gotItBtn.click();
        Thread.sleep(3000);
    }

    public void fillOutStudentApplicationForm() throws Exception {

        // Student Information Tabular
        Browser.scrollDownToElement();
        gender.click();
        birthStateSelect.click();
        birthStateOption.click();
        SaveNContinueBtn.click();
        Thread.sleep(2000);

        // Contact Tabular
        Browser.scrollDownToElement();
        addAddressWidgetBtn.click();
        Thread.sleep(2000);
        addressLabel.sendKeys("Home");
        addressInput.sendKeys("3400 E Foothill Blvd.");
        addressCity.sendKeys("Pasadena");
        addressStateSelect.click();
        studentAddressStateOption.click();
        addressPostalCode.sendKeys("91107");
        validateBtn.click();
        Thread.sleep(2000);
        looksGoodBtn.click();
        Thread.sleep(4000);
        Browser.scrollDownToElement();
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
        signatureNameInStudentApplication.sendKeys("Test Signature");
        saveSignature.click();
        Thread.sleep(3000);
        SaveNContinueBtn.click();
        Thread.sleep(2000);
    }

    public void fillOutHouseHoldInfoForm() throws Exception {

        // Parents/Guardians/Emergency Contact
        Browser.scrollDownToElement();
        addAddressWidgetBtn.click();
        Thread.sleep(2000);
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
        Browser.scrollDownToElement();
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

        // Guardian Signature
//        signSignature();
//        guardianSignatureNameInHouseholdInfo.sendKeys("Guardian Test Signature");
//        saveSignature.click();
//        Thread.sleep(3000);
//        SaveNContinueBtn.click();
//        Thread.sleep(2000);
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

        // Medication
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
        studentSignatureNameInEmergencyHealth.sendKeys("Test Signature");
        signSignature();
        saveSignature.click();
        Thread.sleep(3000);
        SaveNContinueBtn.click();
        Thread.sleep(3000);

        // Guardian Signature
//        guardianSignatureNameInEmergencyHealth.sendKeys("Guardian Test Signature");
//        signGuardianSignature();
//        Thread.sleep(3000);
//        saveSignature.click();
        Thread.sleep(3000);
        SaveNContinueBtn.click();
        Thread.sleep(3000);
    }

    public void fillOutPhotographicConsent() throws Exception {
        Browser.scrollDownToElement();
        photographicConsent.click();
        signSignature();
        studentSignatureNameInPhotographicConsent.sendKeys("Test Signature ");
        saveSignature.click();
        SaveNContinueBtn.click();
        Thread.sleep(3000);
    }

    public void fillOutInternetAccessConsent() throws Exception {
        Browser.scrollDownToElement();
        internetAccessConsent.click();
        signSignature();
        studentSignatureNameInternetAccessPolicy.sendKeys("Test Signature   ");
        saveSignature.click();
        SaveNContinueBtn.click();
        Thread.sleep(3000);
    }

    public void fillOutPhysicalEducationConsent() throws Exception {
        Browser.scrollDownToElement();
        physicalEducationConsent.click();
        signSignature();
        studentSignatureNamePhysicalEducationConsent.sendKeys(" Test Signature");
        saveSignature.click();
        SaveNContinueBtn.click();
        Thread.sleep(3000);
    }

    public void fillOutTransportationConsent() throws Exception {
        Browser.scrollDownToElement();
        transportationConsent.click();
        signSignature();
        studentSignatureNameTransportationConsent.sendKeys("Test Signature");
        saveSignature.click();
        SaveNContinueBtn.click();
        Thread.sleep(3000);
    }

    public void fillOutAffidavitConsent() throws Exception {
        Browser.scrollDownToElement();
        Thread.sleep(3000);
        affidavitConsent.click();
        signSignature();
        studentSignatureNameAffidavitConsent.sendKeys("Test Signature  ");
        saveSignature.click();
        SaveNContinueBtn.click();
        Thread.sleep(3000);
    }

    public void fillOutMAConsent() throws Exception {
//        MAInput.sendKeys("Dad");
        Browser.scrollDownToElement();
        Thread.sleep(3000);
        MAAgreement.click();
        signSignature();
        studentSignatureNameMA.sendKeys("Test Signature");
        saveSignature.click();
        SaveNContinueBtn.click();
        Thread.sleep(3000);
    }

}
