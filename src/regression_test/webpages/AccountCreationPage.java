package webpages;

import objects.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static generators.CreateAccountGenerator.TIME_STAMP;

public class AccountCreationPage {
    // Home Page URL
    public static String ACCOUNT_CREATION_PAGE = "/registration/create/21";

    // Locators
    @FindBy(how = How.ID, using = "createAccount")
    WebElement createAccountBtn;
    @FindBy(how = How.ID, using = "input_3")
    WebElement firstName;
    @FindBy(how = How.ID, using = "input_5")
    WebElement lastName;
    @FindBy(how = How.ID, using = "input_6")
    WebElement email;
    @FindBy(how = How.ID, using = "input_7")
    WebElement phone;
    @FindBy(how = How.ID, using = "input_8")
    WebElement birthdate;
    @FindBy(how = How.ID, using = "input_9")
    WebElement username;
    @FindBy(how = How.ID, using = "input_10")
    WebElement password;
    @FindBy(how = How.ID, using = "input_11")
    WebElement password_confirmation;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/form/div[6]/div[1]/div[5]/md-checkbox")
    WebElement showPassword;

    public void clickCreateAccountButton() throws Exception {
        Browser.scrollDownToElement();
        createAccountBtn.click();
        Thread.sleep(3000);
    }

    public void clickShowPasswordCheckbox() throws Exception {
        Browser.scrollDownToElement();
        showPassword.click();
        Thread.sleep(3000);
    }

    public void assertCreateAccountButtonNotClickable(String message) {
        Browser.scrollDownToElement();
        boolean buttonStatus = createAccountBtn.isEnabled();
        if (buttonStatus == false) {
            System.out.println(createAccountBtn + "is disabled/" + buttonStatus + " because '" + message + "'");
        }
    }

    public void fillOutCreateAccountForm() {
        firstName.sendKeys("Selenium");
        lastName.sendKeys("Test_" + TIME_STAMP);
        email.sendKeys("cufomuhe@kekita.com");
        phone.sendKeys("(333)333-3333");
        birthdate.sendKeys("10/10/1998");
        username.sendKeys("Sel_Test_" + TIME_STAMP);
        password.sendKeys("edi");
        password_confirmation.sendKeys("edi");
    }

    public void fillOutCreateAccountFormConstructor(String FirstName, String LastName, String Email, String Phone, String Birthdate, String Username, String Password, String PasswordConfirmation) {
        firstName.sendKeys(FirstName);
        lastName.sendKeys(LastName);
        email.sendKeys(Email);
        phone.sendKeys(Phone);
        birthdate.sendKeys(Birthdate);
        username.sendKeys(Username);
        password.sendKeys(Password);
        password_confirmation.sendKeys(PasswordConfirmation);
    }

    public void changeCreateAccountPasswordConstructor(String Password, String PasswordConfirmation) {
        password.clear();
        password.sendKeys(Password);
        password_confirmation.clear();
        password_confirmation.sendKeys(PasswordConfirmation);
    }

}
