package webpages;

import objects.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static generators.CreateAccountGenerator.TIME_STAMP;

public class AddGuardianPage {

    // Locators
    @FindBy(how = How.CLASS_NAME, using = "addGuardian")
    WebElement addGuardianBtn;
    @FindBy(how = How.CLASS_NAME, using = "save")
    WebElement saveBtn;
    @FindBy(how = How.XPATH, using = "//*[@id='guardiansList']/div[3]/div[2]/button")
    WebElement doneBtn;
    @FindBy(how = How.ID, using = "input_4")
    WebElement guardianFirstName;
    @FindBy(how = How.ID, using = "input_5")
    WebElement guardianLastName;
    @FindBy(how = How.ID, using = "input_6")
    WebElement guardianEmail;
    @FindBy(how = How.ID, using = "input_7")
    WebElement guardianPhone;
    @FindBy(how = How.XPATH, using = "//*[@id=\'select_8\']")
    WebElement relationshipSelect;
    @FindBy(how = How.XPATH, using = "//*[@id=\'select_option_14\']")
    WebElement relationshipId;
    @FindBy(how = How.ID, using = "input_10")
    WebElement guardianDateOfBirth;
    @FindBy(how = How.NAME, using = "IsPrimary")
    WebElement guardianPrimary;
    @FindBy(how = How.NAME, using = "IsEmergency")
    WebElement guardianEmergency;

    public void getAddGuardianPage() throws Exception {
        // Add Guardian Page URL (EX: https://qa.studenttrac.com/#/registration/student/#/guardians)
        Thread.sleep(2000);
        Browser.getURL();
    }

    public void clickAddGuardianButton() throws Exception {
        Thread.sleep(2000);
        addGuardianBtn.click();
    }

    public void clickSaveButton() throws Exception {
        saveBtn.click();
        Thread.sleep(5000);
    }

    public void clickDoneButton() throws Exception {
        doneBtn.click();
        Thread.sleep(5000);
    }

    public void fillOutGuardianInfo() {
        guardianFirstName.sendKeys("Dad");
        guardianLastName.sendKeys("Test_" + TIME_STAMP);
        guardianEmail.sendKeys("cufomuhe@kekita.com");
        guardianPhone.sendKeys("(333)333-3333");
        relationshipSelect.click();
        relationshipId.click();
        guardianDateOfBirth.sendKeys("10/10/1970");
    }

    public void fillOutGuardianInfoConstructor(String GuardianFirstName, String GuardianLastName, String GuardianEmail, String GuardianPhone, String GuardianDateOfBirth) {
        guardianFirstName.sendKeys(GuardianFirstName);
        guardianLastName.sendKeys(GuardianLastName);
        guardianEmail.sendKeys(GuardianEmail);
        guardianPhone.sendKeys(GuardianPhone);
        relationshipSelect.click();
        relationshipId.click();
        guardianDateOfBirth.sendKeys(GuardianDateOfBirth);
    }

    public void clickPrimaryCheckbox() throws Exception {
        guardianPrimary.click();
        Thread.sleep(1000);
    }

    public void clickEmergencyCheckbox() throws Exception {
        guardianEmergency.click();
        Thread.sleep(1000);
    }

}
