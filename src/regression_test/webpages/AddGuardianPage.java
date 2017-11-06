package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddGuardianPage {
    WebDriver selenium;

    // Add Guardian Page URL (EX: https://qa.studenttrac.com/#/registration/student/#/guardians)
    private static String GUARDIAN_PAGE = null;

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

    // Constructor
    public AddGuardianPage(WebDriver selenium) throws Exception {
        this.selenium = selenium;
        PageFactory.initElements(selenium, this);
        if (!"Parent / Legal Guardians / Emergency Contacts".equalsIgnoreCase(this.selenium.getTitle())){
            GUARDIAN_PAGE = selenium.getCurrentUrl();
            selenium.get(GUARDIAN_PAGE);
            Thread.sleep(2000);
        }
    }

    public void clickAddGuardianButton() throws Exception {
        addGuardianBtn.click();
        Thread.sleep(2000);
    }

    public void clickSaveButton() throws Exception {
        saveBtn.click();
        Thread.sleep(4000);
    }

    public void clickDoneButton() throws Exception {
        doneBtn.click();
        Thread.sleep(3500);
    }

    public void fillOutGuardianInfo() {
        guardianFirstName.sendKeys("Dad");
        guardianLastName.sendKeys("Test_" + AccountCreationPage.time_Stamp.toString());
        guardianEmail.sendKeys("cufomuhe@kekita.com");
        guardianPhone.sendKeys("(333)333-3333");
        relationshipSelect.click();
        relationshipId.click();
        guardianDateOfBirth.sendKeys("10/10/1970");
    }


}
