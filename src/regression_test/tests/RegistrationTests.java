package tests;

import generators.GeneralMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import webpages.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


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
        GeneralMethods general = new GeneralMethods(selenium);

        // Step 1) Go to the login page and click create account
        LoginPage login = new LoginPage(selenium);
        login.clickCreateAccountButton();

        // Step 2) Create an account
        AccountCreationPage createAccount = new AccountCreationPage(selenium);
        createAccount.fillOutCreateAccountForm();
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
    public void createAccountFirstNameREQException() throws Exception {
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
    public void createAccountLastNameREQException() throws Exception {
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
    public void createAccountEmailREQException() throws Exception {
        // Step 1) Go to the login page and click create account
        LoginPage login = new LoginPage(selenium);
        login.clickCreateAccountButton();

        // Step 2) Create an account
        AccountCreationPage createAccount = new AccountCreationPage(selenium);
        createAccount.fillOutCreateAccountFormConstructor("Selenium", "Test_" + time_Stamp.toString(), "","(333)333-3333","10/10/1998","Sel_Test_" + time_Stamp.toString(),"edi","edi");
        createAccount.clickCreateAccountButton();

        // Step 3) Verify Email REQ Error
        GeneralMethods general = new GeneralMethods(selenium);
        general.assertErrorDialogMessage("Email\nThe Email field is required.");
    }

    @Test
    public void createAccountEmailInvalidException() throws Exception {
        // Step 1) Go to the login page and click create account
        LoginPage login = new LoginPage(selenium);
        login.clickCreateAccountButton();

        // Step 2) Create an account
        AccountCreationPage createAccount = new AccountCreationPage(selenium);
        createAccount.fillOutCreateAccountFormConstructor("Selenium", "Test_" + time_Stamp.toString(), "cufomuhe@kekita","(333)333-3333","10/10/1998","Sel_Test_" + time_Stamp.toString(),"edi","edi");
        createAccount.clickCreateAccountButton();

        // Step 3) Verify Email Invalid Error
        GeneralMethods general = new GeneralMethods(selenium);
        general.assertErrorDialogMessage("Email\nThe Email field is not a valid e-mail address.");
    }

    @Test
    public void createAccountPhoneInvalidException() throws Exception {
        // Step 1) Go to the login page and click create account
        LoginPage login = new LoginPage(selenium);
        login.clickCreateAccountButton();

        // Step 2) Create an account
        AccountCreationPage createAccount = new AccountCreationPage(selenium);
        createAccount.fillOutCreateAccountFormConstructor("Selenium", "Test_" + time_Stamp.toString(), "cufomuhe@kekita.com","","10/10/1998","Sel_Test_" + time_Stamp.toString(),"edi","edi");
        createAccount.clickCreateAccountButton();

        // Step 3) Verify Email REQ Error
        GeneralMethods general = new GeneralMethods(selenium);
        general.assertErrorDialogMessage("Phone\nThe Phone field is required.");
    }

    @Test
    public void createAccountDOBBefore1900InvalidException() throws Exception {
        // Step 1) Go to the login page and click create account
        LoginPage login = new LoginPage(selenium);
        login.clickCreateAccountButton();

        // Step 2) Create an account
        AccountCreationPage createAccount = new AccountCreationPage(selenium);
        createAccount.fillOutCreateAccountFormConstructor("Selenium", "Test_" + time_Stamp.toString(), "cufomuhe@kekita.com","(333)333-3333","10/10/1899","Sel_Test_" + time_Stamp.toString(),"edi","edi");
        createAccount.clickCreateAccountButton();

        // Step 3) Verify DOB Invalid Error
        GeneralMethods general = new GeneralMethods(selenium);
        general.assertErrorDialogMessage("DateOfBirth\nInvalid Date of Birth");
    }

    @Test
    public void createAccountDOBFutureInvalidException() throws Exception {
        // Step 1) Go to the login page and click create account
        LoginPage login = new LoginPage(selenium);
        login.clickCreateAccountButton();

        // Step 2) Create an account
        AccountCreationPage createAccount = new AccountCreationPage(selenium);
        createAccount.fillOutCreateAccountFormConstructor("Selenium", "Test_" + time_Stamp.toString(), "cufomuhe@kekita.com","(333)333-3333","10/10/2050","Sel_Test_" + time_Stamp.toString(),"edi","edi");
        createAccount.clickCreateAccountButton();

        // Step 3) Verify DOB Invalid Error
        GeneralMethods general = new GeneralMethods(selenium);
        general.assertErrorDialogMessage("DateOfBirth\nInvalid Date of Birth");
    }

    @Test
    public void createAccountUsernameREQException() throws Exception {
        // Step 1) Go to the login page and click create account
        LoginPage login = new LoginPage(selenium);
        login.clickCreateAccountButton();

        // Step 2) Create an account
        AccountCreationPage createAccount = new AccountCreationPage(selenium);
        createAccount.fillOutCreateAccountFormConstructor("Selenium", "Test_" + time_Stamp.toString(), "cufomuhe@kekita.com","(333)333-3333","10/10/2050","","edi","edi");
        createAccount.clickCreateAccountButton();

        // Step 3) Verify Username REQ Error
        GeneralMethods general = new GeneralMethods(selenium);
        general.assertToastMessage("Current form is invalid, please input correct data");
    }

    @Test
    public void createAccountUsernameUNQException() throws Exception {
        // Step 1) Go to the login page and click create account
        LoginPage login = new LoginPage(selenium);
        login.clickCreateAccountButton();

        // Step 2) Create an account
        AccountCreationPage createAccount = new AccountCreationPage(selenium);
        createAccount.fillOutCreateAccountFormConstructor("Selenium", "Test_" + time_Stamp.toString(), "cufomuhe@kekita.com","(333)333-3333","10/10/1998","Jonathan","edi","edi");
        createAccount.clickCreateAccountButton();

        // Step 3) Verify Username Not Unique Error
        GeneralMethods general = new GeneralMethods(selenium);
        general.assertErrorDialogMessage("Message\nThe UserName = Jonathan has been taken");
    }

//    @Test
//    public void createAccountDuplicateException() throws Exception {
//
//        // Step 1) Go to the login page and click create account
//        LoginPage login = new LoginPage(selenium);
//        login.clickCreateAccountButton();
//
//        // Step 2) Create an account
//        AccountCreationPage createAccount = new AccountCreationPage(selenium);
//        createAccount.fillOutCreateAccountForm();
//        // Do duplication check for student with same name, dob, AND email OR phone
//    }

    @Test
    public void createAccountPasswordRequirementsException() throws Exception {
        // Step 1) Go to the login page and click create account
        LoginPage login = new LoginPage(selenium);
        login.clickCreateAccountButton();

        // Step 2) Password does not contain lower case requirement
        AccountCreationPage createAccount = new AccountCreationPage(selenium);
        createAccount.fillOutCreateAccountFormConstructor("Selenium", "Test_" + time_Stamp.toString(), "cufomuhe@kekita.com","(333)333-3333","10/10/1998","Sel_Test_" + time_Stamp.toString(),"EDI","EDI");
        createAccount.clickShowPasswordCheckbox();

        // Step 3) Verify Password Requirement Error (Password does not contain a lowercase)
        createAccount.assertCreateAccountButtonNotClickable("Password does not contain a lowercase");

        // Step 2) Password does not contain at least 3 characters
        createAccount.changeCreateAccountPasswordConstructor("ed","ed");

        // Step 3) Verify Password Requirement Error (Password is not 3 characters long)
        createAccount.assertCreateAccountButtonNotClickable("Password is not 3 characters long");

        // Step 2) Password contains more than 50 characters
        createAccount.changeCreateAccountPasswordConstructor("Over 50 Characters Over 50 Characters Over 50 Characters","Over 50 Characters Over 50 Characters Over 50 Characters");

        // Step 3) Verify Password Requirement Error (Password contains more than 50 characters)
        createAccount.assertCreateAccountButtonNotClickable("Password is more than 50 characters long");

        // Step 2) Password contains username
        createAccount.changeCreateAccountPasswordConstructor("Sel_Test_" + time_Stamp.toString(), "Sel_Test_" + time_Stamp.toString());

        // Step 3) Verify Password Requirement Error (Password contains username)
        createAccount.assertCreateAccountButtonNotClickable("Password contains username");

        // Step 2) Password does not match
        createAccount.changeCreateAccountPasswordConstructor("Sel_Test_" + time_Stamp.toString(), "Sel_Test_" + time_Stamp.toString());

        // Step 3) Verify Password Requirement Error (Password does not match)
        createAccount.assertCreateAccountButtonNotClickable("Password does not match");
    }

}
