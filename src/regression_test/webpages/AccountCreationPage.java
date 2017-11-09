package webpages;

import generators.GeneralMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

import static generators.GeneralMethods.ENV;

public class AccountCreationPage {
    WebDriver selenium;

    // Home Page URL
    private static String ACCOUNT_CREATION_PAGE = "https://" + ENV +".studenttrac.com/#/registration/create/21";
    public static String time_Stamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

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

    // Constructor
    public AccountCreationPage(WebDriver selenium) {
        this.selenium = selenium;
        PageFactory.initElements(selenium, this);
        if (!"CreateAccount".equalsIgnoreCase(this.selenium.getTitle())){
            selenium.get(ACCOUNT_CREATION_PAGE);
        }
    }

    public void clickCreateAccountButton() throws Exception {
        GeneralMethods general = new GeneralMethods(selenium);
        general.scrollDownToElement();
        createAccountBtn.click();
        Thread.sleep(3000);
    }

    public boolean isCreateAccountButtonPresent() {
        return createAccountBtn != null;
    }

    public void fillOutCreateAccountForm() {
        firstName.sendKeys("Selenium");
        lastName.sendKeys("Test_" + time_Stamp.toString());
        email.sendKeys("cufomuhe@kekita.com");
        phone.sendKeys("(333)333-3333");
        birthdate.sendKeys("10/10/1998");
        username.sendKeys("Sel_Test_" + time_Stamp.toString());
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

}
