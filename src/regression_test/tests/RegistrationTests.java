package tests;

import objects.Browser;
import org.junit.Test;
import webpages.*;
import static generators.CreateAccountGenerator.TIME_STAMP;
import static generators.CreateAccountGenerator.password;
import static generators.CreateAccountGenerator.username;
import static webpages.LoginPage.HOMEPAGE_URL;
import static webpages.LandingPage.LANDING_PAGE;
import static webpages.AccountCreationPage.ACCOUNT_CREATION_PAGE;

public class RegistrationTests extends TestBase {

    @Test
    public void startRegistration() throws Exception {

        // Step 1) Go to the login page and click create account
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().clickCreateAccountButton();

        // Step 2) Create an account
        Browser.goTo(ACCOUNT_CREATION_PAGE);
        Pages.accountCreation().fillOutCreateAccountForm();
        Pages.accountCreation().clickCreateAccountButton();
        System.out.println("Student Account Creation Confirmed");

        // Step 3) Validate the account is created on Landing Page
        Browser.goTo(LANDING_PAGE);
        Pages.landing().clickLetsGetStartButton();
        System.out.println("Landing Page Confirmed");

        // Step 4) Add a Guardian
        Pages.addGuardian().getAddGuardianPage();
        Pages.addGuardian().clickAddGuardianButton();
        Pages.addGuardian().fillOutGuardianInfo();
        Pages.addGuardian().clickPrimaryCheckbox();
        Pages.addGuardian().clickEmergencyCheckbox();
        Pages.addGuardian().clickSaveButton();
        Pages.addGuardian().clickDoneButton();
        System.out.println("Guardian Added Confirmed");

        // Step 5) Select Enrollment Period
        Pages.enrollment().getEnrollmentPage();
        Pages.enrollment().clickRegisterButton();
        System.out.println("Registration Started Confirmed");

        // Step 6) Fill Out Registration Forms
        Pages.registrationForm().getRegistrationFormsPage();
        Pages.registrationForm().fillOutStudentApplicationForm();
        Pages.registrationForm().fillOutHouseHoldInfoForm();
        Pages.registrationForm().fillOutEmergencyHealthForm();
        Pages.registrationForm().fillOutPhotographicConsent();
        Pages.registrationForm().fillOutInternetAccessConsent();
        Pages.registrationForm().fillOutPhysicalEducationConsent();
        Pages.registrationForm().fillOutTransportationConsent();
        Pages.registrationForm().fillOutAffidavitConsent();
        Pages.registrationForm().fillOutMAConsent();
        Pages.registrationForm().clickFinalizeNSubmitButton();
        Pages.registrationForm().clickGotItButton();
    }

    @Test
    public void createAccountFirstNameREQException() throws Exception {
        // Step 1) Go to the login page and click create account
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().clickCreateAccountButton();

        // Step 2) Create an account
        Browser.goTo(ACCOUNT_CREATION_PAGE);
        Pages.accountCreation().fillOutCreateAccountFormConstructor("", "Test_" + TIME_STAMP, "cufomuhe@kekita.com","(333)333-3333","10/10/1998","Sel_Test_" + TIME_STAMP,"edi","edi");
        Pages.accountCreation().clickCreateAccountButton();

        // Step 3) Verify FirstName REQ Error
        Pages.general().assertErrorDialogMessage("FirstName\nThe FirstName field is required.");
    }

    @Test
    public void createAccountLastNameREQException() throws Exception {
        // Step 1) Go to the login page and click create account
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().clickCreateAccountButton();

        // Step 2) Create an account
        Browser.goTo(ACCOUNT_CREATION_PAGE);
        Pages.accountCreation().fillOutCreateAccountFormConstructor("Selenium", "", "cufomuhe@kekita.com","(333)333-3333","10/10/1998","Sel_Test_" + TIME_STAMP,"edi","edi");
        Pages.accountCreation().clickCreateAccountButton();

        // Step 3) Verify LastName REQ Error
        Pages.general().assertErrorDialogMessage("LastName\nThe LastName field is required.");
    }

    @Test
    public void createAccountEmailREQException() throws Exception {
        // Step 1) Go to the login page and click create account
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().clickCreateAccountButton();

        // Step 2) Create an account
        Browser.goTo(ACCOUNT_CREATION_PAGE);
        Pages.accountCreation().fillOutCreateAccountFormConstructor("Selenium", "Test_" + TIME_STAMP, "","(333)333-3333","10/10/1998","Sel_Test_" + TIME_STAMP,"edi","edi");
        Pages.accountCreation().clickCreateAccountButton();

        // Step 3) Verify Email REQ Error
        Pages.general().assertErrorDialogMessage("Email\nThe Email field is required.");
    }

    @Test
    public void createAccountEmailInvalidException() throws Exception {
        // Step 1) Go to the login page and click create account
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().clickCreateAccountButton();

        // Step 2) Create an account
        Browser.goTo(ACCOUNT_CREATION_PAGE);
        Pages.accountCreation().fillOutCreateAccountFormConstructor("Selenium", "Test_" + TIME_STAMP, "cufomuhe@kekita","(333)333-3333","10/10/1998","Sel_Test_" + TIME_STAMP,"edi","edi");
        Pages.accountCreation().clickCreateAccountButton();

        // Step 3) Verify Email Invalid Error
        Pages.general().assertErrorDialogMessage("Email\nThe Email field is not a valid e-mail address.");
    }

    @Test
    public void createAccountPhoneInvalidException() throws Exception {
        // Step 1) Go to the login page and click create account
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().clickCreateAccountButton();

        // Step 2) Create an account
        Browser.goTo(ACCOUNT_CREATION_PAGE);
        Pages.accountCreation().fillOutCreateAccountFormConstructor("Selenium", "Test_" + TIME_STAMP, "cufomuhe@kekita.com","","10/10/1998","Sel_Test_" + TIME_STAMP,"edi","edi");
        Pages.accountCreation().clickCreateAccountButton();

        // Step 3) Verify Email REQ Error
        Pages.general().assertErrorDialogMessage("Phone\nThe Phone field is required.");
    }

    @Test
    public void createAccountDOBBefore1900InvalidException() throws Exception {
        // Step 1) Go to the login page and click create account
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().clickCreateAccountButton();

        // Step 2) Create an account
        Browser.goTo(ACCOUNT_CREATION_PAGE);
        Pages.accountCreation().fillOutCreateAccountFormConstructor("Selenium", "Test_" + TIME_STAMP, "cufomuhe@kekita.com","(333)333-3333","10/10/1899","Sel_Test_" + TIME_STAMP,"edi","edi");
        Pages.accountCreation().clickCreateAccountButton();

        // Step 3) Verify DOB Invalid Error
        Pages.general().assertErrorDialogMessage("DateOfBirth\nInvalid Date of Birth");
    }

    @Test
    public void createAccountDOBFutureInvalidException() throws Exception {
        // Step 1) Go to the login page and click create account
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().clickCreateAccountButton();

        // Step 2) Create an account
        Browser.goTo(ACCOUNT_CREATION_PAGE);
        Pages.accountCreation().fillOutCreateAccountFormConstructor("Selenium", "Test_" + TIME_STAMP, "cufomuhe@kekita.com","(333)333-3333","10/10/2050","Sel_Test_" + TIME_STAMP,"edi","edi");
        Pages.accountCreation().clickCreateAccountButton();

        // Step 3) Verify DOB Invalid Error
        Pages.general().assertErrorDialogMessage("Message\nInvalid Date of Birth");
    }

    @Test
    public void createAccountUsernameREQException() throws Exception {
        // Step 1) Go to the login page and click create account
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().clickCreateAccountButton();

        // Step 2) Create an account
        Browser.goTo(ACCOUNT_CREATION_PAGE);
        Pages.accountCreation().fillOutCreateAccountFormConstructor("Selenium", "Test_" + TIME_STAMP, "cufomuhe@kekita.com","(333)333-3333","10/10/2050","","edi","edi");
        Pages.accountCreation().clickCreateAccountButton();

        // Step 3) Verify Username REQ Error
        Pages.general().assertToastMessage("Current form is invalid, please input correct data");
    }

    @Test
    public void createAccountUsernameUNQException() throws Exception {
        // Step 1) Go to the login page and click create account
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().clickCreateAccountButton();

        // Step 2) Create an account
        Browser.goTo(ACCOUNT_CREATION_PAGE);
        Pages.accountCreation().fillOutCreateAccountFormConstructor("Selenium", "Test_" + TIME_STAMP, "cufomuhe@kekita.com","(333)333-3333","10/10/1998","Jonathan","edi","edi");
        Pages.accountCreation().clickCreateAccountButton();

        // Step 3) Verify Username Not Unique Error
        Pages.general().assertErrorDialogMessage("Message\nThe UserName = Jonathan has been taken");
    }

    @Test
    public void createAccountDuplicateException() throws Exception {
        // Step 1) Generate new test account with API
        Pages.createAccount().createAccountGenerator();

        // Step 2) Go to the login page and click create account
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().clickCreateAccountButton();

        // Step 3) Create an account
        Browser.goTo(ACCOUNT_CREATION_PAGE);
        Pages.accountCreation().fillOutCreateAccountFormConstructor("Selenium", "Test_" + TIME_STAMP, "lodiguvac@ether123.net","(333)333-3333","10/10/1999","Duplication_Test_" + TIME_STAMP,"edi","edi");
        Pages.accountCreation().clickCreateAccountButton();

        // Step 4) Verify duplication check for student with same name, dob, AND email OR phone Error
        Pages.general().assertErrorDialogMessage("Message\nAn account with this First Name, Last Name, Birth Date, and (Email or Phone) already exists.");
    }

    @Test
    public void createAccountPasswordRequirementsException() throws Exception {
        // Step 1) Go to the login page and click create account
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().clickCreateAccountButton();

        // Step 2a) Password does not contain lower case requirement
        Browser.goTo(ACCOUNT_CREATION_PAGE);
        Pages.accountCreation().fillOutCreateAccountFormConstructor("Selenium", "Test_" + TIME_STAMP, "","(333)333-3333","10/10/199","Sel_Test_" + TIME_STAMP,"EDI","EDI");
        Pages.accountCreation().clickShowPasswordCheckbox();

        // Step 3a) Verify Password Requirement Error (Password does not contain a lowercase)
        Pages.accountCreation().assertCreateAccountButtonNotClickable("Password does not contain a lowercase");

        // Step 2b) Password does not contain at least 3 characters
        Pages.accountCreation().changeCreateAccountPasswordConstructor("ed","ed");

        // Step 3b) Verify Password Requirement Error (Password is not 3 characters long)
        Pages.accountCreation().assertCreateAccountButtonNotClickable("Password is not 3 characters long");

        // Step 2c) Password contains more than 50 characters
        Pages.accountCreation().changeCreateAccountPasswordConstructor("Over 50 Characters Over 50 Characters Over 50 Characters","Over 50 Characters Over 50 Characters Over 50 Characters");

        // Step 3c) Verify Password Requirement Error (Password contains more than 50 characters)
        Pages.accountCreation().assertCreateAccountButtonNotClickable("Password is more than 50 characters long");

        // Step 2d) Password contains username
        Pages.accountCreation().changeCreateAccountPasswordConstructor("Sel_Test_" + TIME_STAMP, "Sel_Test_" + TIME_STAMP);

        // Step 3d) Verify Password Requirement Error (Password contains username)
        Pages.accountCreation().assertCreateAccountButtonNotClickable("Password contains username");

        // Step 2e) Password does not match
        Pages.accountCreation().changeCreateAccountPasswordConstructor("Sel_Test_" + TIME_STAMP, "Does_Not_Matach_" + TIME_STAMP);

        // Step 3e) Verify Password Requirement Error (Password does not match)
        Pages.accountCreation().assertCreateAccountButtonNotClickable("Password does not match");
    }

    @Test
    public void associateGuardian() throws Exception {
        // Step 1) Generate new test account with API
        Pages.createAccount().createAccountGenerator();

        // Step 2) Go to the login page and click create account
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().inputLoginCredentials(username, password);
        Pages.login().clickLoginButton();
        Pages.general().assertNavBarTitle("Registration");

        // Step 3) Successfully Associate a Guardian
        Pages.addGuardian().getAddGuardianPage();
        Pages.addGuardian().clickAddGuardianButton();
        Pages.addGuardian().fillOutGuardianInfo();
        Pages.addGuardian().clickPrimaryCheckbox();
        Pages.addGuardian().clickEmergencyCheckbox();
        Pages.addGuardian().clickSaveButton();
        Pages.addGuardian().clickDoneButton();
    }

    @Test
    public void associateGuardianFirstNameREQException() throws Exception {
        // Step 1) Generate new test account with API
        Pages.createAccount().createAccountGenerator();

        // Step 2) Go to the login page and click create account
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().inputLoginCredentials(username, password);
        Pages.login().clickLoginButton();
        Pages.general().assertNavBarTitle("Registration");

        // Step 3) Verify Guardian FirstName REQ Error
        Pages.addGuardian().getAddGuardianPage();
        Pages.addGuardian().clickAddGuardianButton();
        Pages.addGuardian().fillOutGuardianInfoConstructor("", "Test_" + TIME_STAMP,"cufomuhe@kekita.com", "(333)333-3333", "10/10/1970" );
        Pages.addGuardian().clickPrimaryCheckbox();
        Pages.addGuardian().clickEmergencyCheckbox();
        Pages.addGuardian().clickSaveButton();
        Pages.general().assertRedUnderlineErrorMessage("Required.");
    }

    @Test
    public void associateGuardianLastNameREQException() throws Exception {
        // Step 1) Generate new test account with API
        Pages.createAccount().createAccountGenerator();

        // Step 2) Go to the login page and click create account
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().inputLoginCredentials(username, password);
        Pages.login().clickLoginButton();
        Pages.general().assertNavBarTitle("Registration");

        // Step 3) Verify Guardian LastName REQ Error
        Pages.addGuardian().getAddGuardianPage();
        Pages.addGuardian().clickAddGuardianButton();
        Pages.addGuardian().fillOutGuardianInfoConstructor("Dad", "   ","cufomuhe@kekita.com", "(333)333-3333", "10/10/1970" );
        Pages.addGuardian().clickPrimaryCheckbox();
        Pages.addGuardian().clickEmergencyCheckbox();
        Pages.addGuardian().clickSaveButton();
        Pages.general().assertRedUnderlineErrorMessage("Required.");
    }

    @Test
    public void associateGuardianEmailInvalidException() throws Exception {
        // Step 1) Generate new test account with API
        Pages.createAccount().createAccountGenerator();

        // Step 2) Go to the login page and click create account
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().inputLoginCredentials(username, password);
        Pages.login().clickLoginButton();
        Pages.general().assertNavBarTitle("Registration");

        // Step 3) Verify Guardian Email Invalid Error
        Pages.addGuardian().getAddGuardianPage();
        Pages.addGuardian().clickAddGuardianButton();
        Pages.addGuardian().fillOutGuardianInfoConstructor("Dad", "Test_" + TIME_STAMP,"cufomuhe@", "(333)333-3333", "10/10/1970" );
        Pages.addGuardian().clickPrimaryCheckbox();
        Pages.addGuardian().clickEmergencyCheckbox();
        Pages.addGuardian().clickSaveButton();
        Pages.general().assertErrorDialogMessage("");
        //general.assertErrorDialogMessage("Email\nThe Email field is not a valid e-mail address."); --> Empty
    }

    @Test
    public void associateGuardianPhoneREQException() throws Exception {
        // Step 1) Generate new test account with API
        Pages.createAccount().createAccountGenerator();

        // Step 2) Go to the login page and click create account
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().inputLoginCredentials(username, password);
        Pages.login().clickLoginButton();
        Pages.general().assertNavBarTitle("Registration");

        // Step 3) Verify Guardian Phone Required Error
        Pages.addGuardian().getAddGuardianPage();
        Pages.addGuardian().clickAddGuardianButton();
        Pages.addGuardian().fillOutGuardianInfoConstructor("Dad", "Test_" + TIME_STAMP,"cufomuhe@kekita.com", "", "10/10/1970" );
        Pages.addGuardian().clickPrimaryCheckbox();
        Pages.addGuardian().clickEmergencyCheckbox();
        Pages.addGuardian().clickSaveButton();
        Pages.general().assertRedUnderlineErrorMessage("Required.");
    }

    @Test
    public void associateGuardianDOBBefore1900InvalidException() throws Exception {
        // Step 1) Generate new test account with API
        Pages.createAccount().createAccountGenerator();

        // Step 2) Go to the login page and click create account
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().inputLoginCredentials(username, password);
        Pages.login().clickLoginButton();
        Pages.general().assertNavBarTitle("Registration");

        // Step 3) Verify Guardian DOB Invalid Error
        Pages.addGuardian().getAddGuardianPage();
        Pages.addGuardian().clickAddGuardianButton();
        Pages.addGuardian().fillOutGuardianInfoConstructor("Dad", "Test_" + TIME_STAMP,"cufomuhe@kekita.com", "(333)333-3333", "10/10/1899" );
        Pages.addGuardian().clickPrimaryCheckbox();
        Pages.addGuardian().clickEmergencyCheckbox();
        Pages.addGuardian().clickSaveButton();
        Pages.general().assertRedUnderlineErrorMessage("Invalid date");
    }

    @Test
    public void associateGuardianDOBFutureInvalidException() throws Exception {
        // Step 1) Generate new test account with API
        Pages.createAccount().createAccountGenerator();

        // Step 2) Go to the login page and click create account
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().inputLoginCredentials(username, password);
        Pages.login().clickLoginButton();
        Pages.general().assertNavBarTitle("Registration");

        // Step 3) Verify Guardian DOB Invalid Error
        Pages.addGuardian().getAddGuardianPage();
        Pages.addGuardian().clickAddGuardianButton();
        Pages.addGuardian().fillOutGuardianInfoConstructor("Dad", "Test_" + TIME_STAMP,"cufomuhe@kekita.com", "(333)333-3333", "10/10/2050" );
        Pages.addGuardian().clickPrimaryCheckbox();
        Pages.addGuardian().clickEmergencyCheckbox();
        Pages.addGuardian().clickSaveButton();
        Pages.general().assertRedUnderlineErrorMessage("Invalid year");
    }

}
