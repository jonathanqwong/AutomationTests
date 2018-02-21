package webpages;

import objects.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationFormPage {

    WebElement selenium;

    // Locators
    @FindBy(how = How.CLASS_NAME, using = "instanceSaveBtn")
    WebElement SaveNContinueBtn;
    @FindBy(how = How.CLASS_NAME, using = "finalize-submit-btn")
    WebElement finalizeNSubmitBtn;
    @FindBy(how = How.ID, using = "backToMainUrl")
    WebElement gotItBtn;
    @FindBy(how = How.CLASS_NAME, using = "tabularBlock")
    WebElement formContainers;

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
    @FindBy(how = How.XPATH, using = "/html/body/div[5]/md-dialog/form/md-dialog-actions/button")
    WebElement validateBtn;
    @FindBy(how = How.XPATH, using = "/html/body/div[5]/md-dialog/form/md-dialog-actions/button[2]")
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
    @FindBy(how = How.ID, using = "radio_38")
    WebElement gender;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_0\"]/form-section/div/div/div/div[2]/form-grid[2]/div/table/tbody/tr[5]/td[2]/div/div/magic-field/div/div/div/div/div/md-input-container/select")
    WebElement birthStateSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_0\"]/form-section/div/div/div/div[2]/form-grid[2]/div/table/tbody/tr[5]/td[2]/div/div/magic-field/div/div/div/div/div/md-input-container/select/option[7]")
    WebElement birthStateOption;

    // Contact
    //@FindBy(how = How.XPATH, using = "//*[@id=\"dialogContent_77\"]/div/div/md-input-container[2]/select/option[6]")
    //WebElement studentAddressStateOption;
    @FindBy(how = How.ID, using = "radio_42")
    WebElement studentNighttimeResidency;

    // Language
    @FindBy(how = How.ID, using = "radio_51")
    WebElement languageOtherThanEnglishAtHome;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[1]/td[2]/div/div/magic-field/div/div/div/div/div/md-input-container/select")
    WebElement homeLanguageSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[1]/td[2]/div/div/magic-field/div/div/div/div/div/md-input-container/select/option[2]")
    WebElement homeLanguageOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td[1]/div/div/magic-field/div/div/div/div/div/md-input-container/select")
    WebElement firstLanguageSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td[1]/div/div/magic-field/div/div/div/div/div/md-input-container/select/option[2]")
    WebElement firstLanguageOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td[2]/div/div/magic-field/div/div/div/div/div/md-input-container/select")
    WebElement preferredLanguageSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td[2]/div/div/magic-field/div/div/div/div/div/md-input-container/select/option[2]")
    WebElement preferredLanguageOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[3]/td[1]/div/div/magic-field/div/div/div/div/div/md-input-container/select")
    WebElement parentLanguageSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[3]/td[1]/div/div/magic-field/div/div/div/div/div/md-input-container/select/option[2]")
    WebElement parentLanguageOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[3]/td[2]/div/div/magic-field/div/div/div/div/div/md-input-container/select")
    WebElement preferredCommunicationLanguageSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[3]/td[2]/div/div/magic-field/div/div/div/div/div/md-input-container/select/option[2]")
    WebElement preferredCommunicationLanguageOption;

    // Education
    @FindBy(how = How.ID, using = "radio_55")
    WebElement previousSchool;
    @FindBy(how = How.ID, using = "input_29")
    WebElement lastSchoolAttended;

    // Guardian Contact Info
    //@FindBy(how = How.XPATH, using = "//*[@id=\"dialogContent_206\"]/div/div/md-input-container[2]/select/option[6]")
    //WebElement guardianAddressStateOption;

    // Parent Guardian Profile
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr/td[1]/div/div/magic-field/div/div/div/div/div/md-input-container/select")
    WebElement guardianEducationLevelSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr/td[1]/div/div/magic-field/div/div/div/div/div/md-input-container/select/option[2]")
    WebElement guardianEducationLevelOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr/td[2]/div/div/magic-field/div/div/div/div/md-input-container/div/div[1]/md-checkbox/div[1]")
    WebElement guardianEducationMilitaryStatus;

    // Emergency/Health
    @FindBy(how = How.ID, using = "radio_247")
    WebElement releaseQuestion1;
    @FindBy(how = How.ID, using = "radio_249")
    WebElement releaseQuestion2;
    @FindBy(how = How.ID, using = "radio_255")
    WebElement healthQuestion1;
    @FindBy(how = How.ID, using = "radio_280")
    WebElement medicalQuestion1;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabular_section_4\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td/div/div/magic-field/div/div/div/div/md-input-container/div/div/md-checkbox/div[1]")
    WebElement medicalQuestion2;
    @FindBy(how = How.ID, using = "radio_283")
    WebElement medicalQuestion3;

    // Photographic Consent
    @FindBy(how = How.ID, using = "radio_308")
    WebElement photographicConsent;

    // Internet Access
    @FindBy(how = How.XPATH, using = "//*[@id=\"instanceBody\"]/form-section[2]/div/div/div/div[2]/form-grid/div/table/tbody/tr/td/div/div/magic-field/div/div/div/div/md-input-container/div/div/md-checkbox/div[1]")
    WebElement internetAccessConsent;

    // Physical Education
    @FindBy(how = How.ID, using = "radio_332")
    WebElement physicalEducationConsent;

    // Transportation Consent
    @FindBy(how = How.ID, using = "radio_345")
    WebElement transportationConsent;

    // Affidavit of Non-Attendance
    @FindBy(how = How.XPATH, using = "//*[@id=\"instanceBody\"]/form-section[1]/div/div/div/div[2]/form-grid[3]/div/table/tbody/tr[2]/td/div/div/magic-field/div/div/div/div/md-input-container/div/div/md-checkbox")
    WebElement affidavitConsent;

    // Master Agreement
    @FindBy(how = How.ID, using = "input_383")
    WebElement MAInput;
    @FindBy(how = How.XPATH, using = "//*[@id=\"instanceBody\"]/form-section[3]/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td/div/div/magic-field/div/div/div/div/md-input-container/div/div/md-checkbox/div[1]")
    WebElement MAAgreement;

    public void getRegistrationFormsPage() throws Exception {
        // Add Guardian Page URL (EX: https://qa.studenttrac.com/#/registration/student/#/guardians)
        Thread.sleep(3000);
        Browser.waitUntilElementIsVisible( By.className( "tabularBlock"));
        Browser.getURL();
    }

    public void signSignature() {
        Actions builder = new Actions(Browser.getDriver());
        Action SignSignature = builder.clickAndHold(signatureWidget)
                .moveByOffset(-100, -100)
                .moveByOffset(20, 20)
                .moveByOffset(100, 150)
                .release(signatureWidget)
                .build();

        SignSignature.perform();
    }

    public void signGuardianSignature() {
        Actions builder = new Actions(Browser.getDriver());
        Action SignGuardianSignature = builder.clickAndHold(signatureWidget)
                .moveByOffset(-200, -200)
                .moveByOffset(150, 150)
                .moveByOffset(300, 150)
                .release(signatureWidget)
                .build();

        SignGuardianSignature.perform();
    }

    public void clickSaveNContinueButton() throws Exception {
        Browser.waitForElement( By.className("instanceSaveBtn"));
        SaveNContinueBtn.click();
        Thread.sleep(2000);
    }

    public void clickFinalizeNSubmitButton() {
        Browser.waitForElement( By.className("finalize-submit-btn"));
        finalizeNSubmitBtn.click();
    }

    public void clickGotItButton() {
        Browser.waitForElement( By.id("backToMainUrl"));
        gotItBtn.click();
    }

    public void fillOutStudentApplicationForm() throws Exception {

        // Student Information Tabular
        Browser.scrollDownToElement();
        Browser.waitUntilElementIsVisible(By.id("radio_39"));
        gender.click();
        birthStateSelect.click();
        birthStateOption.click();
        clickSaveNContinueButton();

        // Contact Tabular
        Browser.scrollDownToElement();
        Browser.waitUntilElementIsVisible(By.className("addAddress"));
        addAddressWidgetBtn.click();
        Thread.sleep(3000);
        Browser.waitUntilElementIsVisible(By.name("Title"));
        Browser.waitForElement( By.name("Title"));
        addressLabel.sendKeys("Home");
        addressInput.sendKeys("3400 E Foothill Blvd.");
        addressCity.sendKeys("Pasadena");
        Pages.general().selectOptionInDropDown(addressStateSelect, "California");
        addressPostalCode.sendKeys("91107");
        validateBtn.click();
        Browser.waitForElement( By.xpath("/html/body/div[5]/md-dialog/form/md-dialog-actions/button[2]"));
        looksGoodBtn.click();
        Thread.sleep(3000);
        Browser.scrollDownToElement();
        Browser.waitUntilElementIsVisible( By.id("radio_42"));
        Browser.waitForElement( By.id("radio_42"));
        studentNighttimeResidency.click();
        clickSaveNContinueButton();

        // Education Tabular
        Browser.waitUntilElementIsVisible( By.id("radio_51"));
        languageOtherThanEnglishAtHome.click();
        homeLanguageSelect.click();
        homeLanguageOption.click();
        Browser.waitForElement( By.xpath("//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td[1]/div/div/magic-field/div/div/div/div/div/md-input-container/select/option[2]"));
        firstLanguageSelect.click();
        firstLanguageOption.click();
        Browser.waitForElement(By.xpath("//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td[2]/div/div/magic-field/div/div/div/div/div/md-input-container/select/option[2]"));
        preferredLanguageSelect.click();
        preferredLanguageOption.click();
        Browser.waitForElement(By.xpath("//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[3]/td[1]/div/div/magic-field/div/div/div/div/div/md-input-container/select/option[2]"));
        parentLanguageSelect.click();
        parentLanguageOption.click();
        Browser.waitForElement( By.xpath("//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[3]/td[2]/div/div/magic-field/div/div/div/div/div/md-input-container/select/option[2]"));
        preferredCommunicationLanguageSelect.click();
        preferredCommunicationLanguageOption.click();
        clickSaveNContinueButton();

        // Previous School Tabular
        Browser.waitUntilElementIsVisible( By.id("radio_55"));
        previousSchool.click();
        lastSchoolAttended.sendKeys("Home School");
        clickSaveNContinueButton();

        // Other Information (skip)
        Browser.waitUntilElementIsVisible( By.className("instanceSaveBtn"));
        clickSaveNContinueButton();

        // Signature Tabular
        Browser.waitUntilElementIsVisible( By.className("canvas"));
        signSignature();
        signatureNameInStudentApplication.sendKeys("Test Signature");
        saveSignature.click();
        Browser.waitForElement( By.className("instanceSaveBtn"));
        clickSaveNContinueButton();
    }

    public void fillOutHouseHoldInfoForm() throws Exception {

        // Parents/Guardians/Emergency Contact
        Browser.scrollDownToElement();
        Browser.waitUntilElementIsVisible( By.className("addAddress"));
        addAddressWidgetBtn.click();
        Thread.sleep(3000);
        Browser.waitUntilElementIsVisible( By.name("Title"));
        Browser.waitForElement( By.name("Title"));
        addressLabel.sendKeys("Home");
        addressInput.sendKeys("3400 E Foothill Blvd.");
        addressCity.sendKeys("Pasadena");
        Pages.general().selectOptionInDropDown(addressStateSelect, "California");
        addressPostalCode.sendKeys("91107");
        validateBtn.click();
        Browser.waitForElement( By.xpath("/html/body/div[5]/md-dialog/form/md-dialog-actions/button[2]"));
        looksGoodBtn.click();
        Thread.sleep(3000);
        Browser.scrollDownToElement();
        Browser.waitUntilElementIsVisible( By.className("addEmail"));
        Browser.waitForElement( By.className("addEmail"));
        addEmailWidgetBtn.click();
        Browser.waitForElement( By.name("Title"));
        emailLabel.sendKeys("Main");
        emailInput.sendKeys("test@edudyn.com");
        Browser.scrollDownToElement();
        clickSaveNContinueButton();

        // Survey
        Browser.waitUntilElementIsVisible( By.className("instanceSaveBtn"));
        clickSaveNContinueButton();

        // Parent/Guardian Profile
        Browser.waitUntilElementIsVisible( By.xpath("//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr/td[1]/div/div/magic-field/div/div/div/div/div/md-input-container/select"));
        guardianEducationLevelSelect.click();
        guardianEducationLevelOption.click();
        Browser.waitForElement( By.xpath("//*[@id=\"tabular_section_2\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr/td[2]/div/div/magic-field/div/div/div/div/md-input-container/div/div[1]/md-checkbox/div[1]"));
        guardianEducationMilitaryStatus.click();
        clickSaveNContinueButton();

        // Guardian Signature
//        signSignature();
//        guardianSignatureNameInHouseholdInfo.sendKeys("Guardian Test Signature");
//        saveSignature.click();
//        Thread.sleep(3000);
//        clickSaveNContinueButton();
//        Thread.sleep(2000);
    }

    public void fillOutEmergencyHealthForm() throws Exception {
        // Release Authorization
        Browser.waitUntilElementIsVisible( By.id("radio_247"));
        releaseQuestion1.click();
        Browser.scrollDownToElement();
        releaseQuestion2.click();
        clickSaveNContinueButton();

        // Health Information
        Browser.waitUntilElementIsVisible( By.id("radio_255"));
        healthQuestion1.click();
        clickSaveNContinueButton();

        // Medication
        Browser.waitUntilElementIsVisible( By.className("instanceSaveBtn"));
        clickSaveNContinueButton();

        // Medical Authorization
        Browser.waitUntilElementIsVisible( By.id("radio_280"));
        medicalQuestion1.click();
        clickSaveNContinueButton();

        // Emergency Treatment Authorization
        Browser.waitUntilElementIsVisible( By.xpath("//*[@id=\"tabular_section_4\"]/form-section/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td/div/div/magic-field/div/div/div/div/md-input-container/div/div/md-checkbox/div[1]"));
        medicalQuestion2.click();
        medicalQuestion3.click();
        clickSaveNContinueButton();

        // Student Signature
        Browser.waitUntilElementIsVisible( By.className("canvas"));
        signSignature();
        studentSignatureNameInEmergencyHealth.sendKeys("Test Signature");
        saveSignature.click();
        Browser.waitUntilElementIsVisible( By.className("instanceSaveBtn"));
        clickSaveNContinueButton();

        // Guardian Signature
//        guardianSignatureNameInEmergencyHealth.sendKeys("Guardian Test Signature");
//        signGuardianSignature();
//        Thread.sleep(3000);
//        saveSignature.click();
        Browser.waitUntilElementIsVisible( By.className("instanceSaveBtn"));
        clickSaveNContinueButton();
    }

    public void fillOutPhotographicConsent() throws Exception {
        Browser.scrollDownToElement();
        Browser.waitUntilElementIsVisible( By.id("radio_308"));
        photographicConsent.click();
        signSignature();
        studentSignatureNameInPhotographicConsent.sendKeys("Test Signature ");
        saveSignature.click();
        clickSaveNContinueButton();
    }

    public void fillOutInternetAccessConsent() throws Exception {
        Browser.scrollDownToElement();
        Browser.waitUntilElementIsVisible( By.xpath("//*[@id=\"instanceBody\"]/form-section[2]/div/div/div/div[2]/form-grid/div/table/tbody/tr/td/div/div/magic-field/div/div/div/div/md-input-container/div/div/md-checkbox/div[1]"));
        internetAccessConsent.click();
        signSignature();
        studentSignatureNameInternetAccessPolicy.sendKeys("Test Signature   ");
        saveSignature.click();
        clickSaveNContinueButton();
    }

    public void fillOutPhysicalEducationConsent() throws Exception {
        Browser.scrollDownToElement();
        Browser.waitUntilElementIsVisible( By.id("radio_332"));
        physicalEducationConsent.click();
        signSignature();
        studentSignatureNamePhysicalEducationConsent.sendKeys(" Test Signature");
        saveSignature.click();
        clickSaveNContinueButton();
    }

    public void fillOutTransportationConsent() throws Exception {
        Browser.scrollDownToElement();
        Browser.waitUntilElementIsVisible( By.id("radio_345"));
        transportationConsent.click();
        signSignature();
        studentSignatureNameTransportationConsent.sendKeys("Test Signature");
        saveSignature.click();
        clickSaveNContinueButton();
    }

    public void fillOutAffidavitConsent() throws Exception {
        Browser.scrollDownToElement();
        Browser.waitUntilElementIsVisible( By.xpath("//*[@id=\"instanceBody\"]/form-section[1]/div/div/div/div[2]/form-grid[3]/div/table/tbody/tr[2]/td/div/div/magic-field/div/div/div/div/md-input-container/div/div/md-checkbox"));
        affidavitConsent.click();
        signSignature();
        studentSignatureNameAffidavitConsent.sendKeys("Test Signature  ");
        saveSignature.click();
        clickSaveNContinueButton();
    }

    public void fillOutMAConsent() throws Exception {
        //MAInput.sendKeys("Dad");
        Browser.scrollDownToElement();
        Browser.waitUntilElementIsVisible( By.xpath("//*[@id=\"instanceBody\"]/form-section[3]/div/div/div/div[2]/form-grid/div/table/tbody/tr[2]/td/div/div/magic-field/div/div/div/div/md-input-container/div/div/md-checkbox/div[1]"));
        MAAgreement.click();
        signSignature();
        studentSignatureNameMA.sendKeys("Test Signature");
        saveSignature.click();
        clickSaveNContinueButton();
    }

}
