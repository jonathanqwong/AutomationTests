package webpages;

import objects.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static objects.Browser.getDriver;

public class StudentInfoPage {

    // Locators
    @FindBy(how = How.CLASS_NAME, using = "save")
    WebElement saveWidgetButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"studDetail\"]/div[1]/button[1]")
    WebElement goBackButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"studDetail\"]/div[1]/button[2]")
    WebElement saveButton;
    // Locators in Student Info Form
    @FindBy(how = How.ID, using = "input_37")
    public static WebElement studentInfoFirstName;
    @FindBy(how = How.ID, using = "input_39")
    public static WebElement studentInfoLastName;
    @FindBy(how = How.CLASS_NAME, using = "md-datepicker-input")
    public static WebElement studentInfoDateOfBirth;
    @FindBy(how = How.XPATH, using = "//*[@id=\"44966\"]/td[4]/div/button[1]")
    public static WebElement editButtonEmailWidget;
    @FindBy(how = How.ID, using = "input_63")
    public static WebElement emailInputEmailWidget;
    @FindBy(how = How.XPATH, using = "//*[@id=\"91481\"]/td[5]/div/button[1]")
    public static WebElement editButtonPhoneWidget;
    @FindBy(how = How.ID, using = "input_69")
    public static WebElement phoneInputPhoneWidget;
    // Locators in Household / Contacts Form
    @FindBy(how = How.XPATH, using = "//*[@id=\"studDetail\"]/div[2]/div[1]/div/div[3]/div[2]/button")
    public static WebElement householdContactForm;
    @FindBy(how = How.ID, using = "input_92")
    public static WebElement householdContactGuardianFirstName;
    @FindBy(how = How.ID, using = "input_94")
    public static WebElement householdContactGuardianLastName;
    @FindBy(how = How.ID, using = "select_96")
    public static WebElement householdContactGuardianRelationship;
    @FindBy(how = How.ID, using = "select_option_125")
    public static WebElement householdContactGuardianRelationshipSelectOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"31938\"]/td[5]/div/button[1]")
    public static WebElement editButtonGuaridanEmailWidget;
    @FindBy(how = How.ID, using = "input_170")
    public static WebElement guardianEmailInputEmailWidget;
    @FindBy(how = How.XPATH, using = "//*[@id=\"6722\"]/td[4]/div/button[1]")
    public static WebElement editButtonGuaridanPhoneWidget;
    @FindBy(how = How.ID, using = "input_173")
    public static WebElement guardianPhoneInputPhoneWidget;

    public void clickSaveWidgetButton() {
        Browser.waitUntilElementIsVisible(By.className("save"));
        saveWidgetButton.click();
    }

    public void clickBackStudentInfoButton() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"studDetail\"]/div[1]/button[1]"));
        goBackButton.click();
    }

    public void clickSaveStudentInfoButton() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"studDetail\"]/div[1]/button[2]"));
        saveButton.click();
    }

    public enum widget_element {
        EMAIL_WIDGET,
        PHONE_WIDGET,
        GUARDIAN_EMAIL_WIDGET,
        GUARDIAN_PHONE_WIDGET
    }

    public void updateInfo(WebElement student_info_element, String updated_value) {
        Browser.waitUntilElementIsVisible(By.className("panel-heading"));
        student_info_element.click();
        student_info_element.clear();
        student_info_element.sendKeys(updated_value);
    }

    public void updateWidgetInfo(Enum widget_element, String updated_value) {
        Browser.scrollDownToElement();
        if (widget_element.toString() == "EMAIL_WIDGET") {
            editButtonEmailWidget.click();
            emailInputEmailWidget.clear();
            emailInputEmailWidget.sendKeys(updated_value);
        } else if (widget_element.toString() == "PHONE_WIDGET") {
            editButtonPhoneWidget.click();
            phoneInputPhoneWidget.clear();
            phoneInputPhoneWidget.sendKeys(updated_value);
        } else if (widget_element.toString() == "GUARDIAN_EMAIL_WIDGET") {
            editButtonGuaridanEmailWidget.click();
            guardianEmailInputEmailWidget.clear();
            guardianEmailInputEmailWidget.sendKeys(updated_value);
        } else if (widget_element.toString() == "GUARDIAN_EMAIL_WIDGET") {
            editButtonGuaridanPhoneWidget.click();
            guardianPhoneInputPhoneWidget.clear();
            guardianPhoneInputPhoneWidget.sendKeys(updated_value);
        } else {
            System.out.println("Unable to find element to update widget");
            throw new NullPointerException();
        }
        saveWidgetButton.click();
    }

    public void clickHouseholdContactForm() {
        Browser.waitUntilElementIsVisible(By.className("leftPanelContainer"));
        householdContactForm.click();
    }

    public void updateGuardianRelationship() {
        householdContactGuardianRelationship.click();
        Browser.scrollDownToElement();
        householdContactGuardianRelationshipSelectOption.click();
    }
}
