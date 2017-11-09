package tests;

import generators.GeneralMethods;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import webpages.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class RegistrationTests {
    WebDriver selenium;
    public static String time_Stamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "browser//chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        selenium = new ChromeDriver(chromeOptions);
        selenium.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {
        selenium.quit();
    }

    @Test
    public void startRegistration() throws Exception {

        // Step 1) Go to the login page and click create account
        LoginPage login = new LoginPage(selenium);
        login.clickCreateAccountButton();

        // Step 2) Create an account
        AccountCreationPage createAccount = new AccountCreationPage(selenium);
        createAccount.fillOutCreateAccountForm();
        createAccount.isCreateAccountButtonPresent();
        createAccount.clickCreateAccountButton();
        System.out.println("Student Account Creation Confirmed");

        // Step 3) Validate the account is created on Landing Page
        LandingPage landing = new LandingPage(selenium);
        landing.clickLetsGetStartButton();
        System.out.println("Landing Page Confirmed");

        // Step 4) Add a Guardian
        AddGuardianPage guardian = new AddGuardianPage(selenium);
        guardian.clickAddGuardianButton();
        guardian.fillOutGuardianInfo();
        guardian.clickSaveButton();
        guardian.clickDoneButton();
        System.out.println("Guardian Added Confirmed");

        // Step 5) Select Enrollment Period
        EnrollmentPage enrollment = new EnrollmentPage(selenium);
        enrollment.clickRegisterButton();
        System.out.println("Registration Started Confirmed");

        // Step 6) Fill Out Registration Forms
        RegistrationFormPage registration = new RegistrationFormPage(selenium);
        registration.fillOutStudentApplicationForm();
        registration.fillOutHouseHoldInfoForm();
        registration.fillOutEmergencyHealthForm();
        registration.fillOutPhotographicConsent();
        registration.fillOutInternetAccessConsent();
        registration.fillOutPhysicalEducationConsent();
        registration.fillOutTransportationConsent();
        registration.fillOutAffidavitConsent();
        registration.fillOutMAConsent();
        registration.clickFinalizeNSubmitButton();
        registration.clickGotItButton();
    }

    @Test
    public void createAccountFirstNameREQ() throws Exception {
        // Step 1) Go to the login page and click create account
        LoginPage login = new LoginPage(selenium);
        login.clickCreateAccountButton();

        // Step 2) Create an account
        AccountCreationPage createAccount = new AccountCreationPage(selenium);
        createAccount.fillOutCreateAccountFormConstructor("", "Test_" + time_Stamp.toString(), "cufomuhe@kekita.com","(333)333-3333","10/10/1998","Sel_Test_" + time_Stamp.toString(),"edi","edi");
        createAccount.clickCreateAccountButton();

        // Step 3) Verify FirstName REQ Error
        GeneralMethods general = new GeneralMethods(selenium);
        general.assertErrorDialogMessage("FirstName\nThe FirstName field is required.");
    }

    @Test
    public void createAccountLastNameREQ() throws Exception {
        // Step 1) Go to the login page and click create account
        LoginPage login = new LoginPage(selenium);
        login.clickCreateAccountButton();

        // Step 2) Create an account
        AccountCreationPage createAccount = new AccountCreationPage(selenium);
        createAccount.fillOutCreateAccountFormConstructor("Selenium", "", "cufomuhe@kekita.com","(333)333-3333","10/10/1998","Sel_Test_" + time_Stamp.toString(),"edi","edi");
        createAccount.clickCreateAccountButton();

        // Step 3) Verify LastName REQ Error
        GeneralMethods general = new GeneralMethods(selenium);
        general.assertErrorDialogMessage("LastName\nThe LastName field is required.");
    }

    @Test
    public void createAccountDuplicateException() throws Exception {

        // Step 1) Go to the login page and click create account
        LoginPage login = new LoginPage(selenium);
        login.clickCreateAccountButton();

        // Step 2) Create an account
        AccountCreationPage createAccount = new AccountCreationPage(selenium);
        createAccount.fillOutCreateAccountForm();
        createAccount.isCreateAccountButtonPresent();
        createAccount.clickCreateAccountButton();

        // Step 3) Assert Username UNQ Exception
        WebElement usernameTakenText = selenium.findElement(By.id("dialogContent_131"));
        assertTrue(usernameTakenText != null);
        System.out.println("Student Account Creation Duplication Exception");
    }

}
