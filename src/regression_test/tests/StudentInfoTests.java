package tests;

import generators.CreateAccountGenerator;
import objects.Browser;
import org.junit.Test;
import webpages.Pages;
import webpages.StudentInfoPage;

import static generators.CreateAccountGenerator.TEMP_EMAIL;
import static generators.CreateAccountGenerator.TEMP_PHONE;
import static generators.CreateAccountGenerator.TIME_STAMP;
import static webpages.LoginPage.HOMEPAGE_URL;
import static webpages.Pages.studentInfo;
import static webpages.StudentInfoPage.widget_element.*;

public class StudentInfoTests extends TestBase {

    @Test
    public void updateStudentLiveData() throws Exception {
        // Scenario 1.1
        // Precondition: Switch Client to PIE-Illinois and Make Person Preference On Card View and First Name First Display
        Pages.switchClient().switchClientId("21");
        Pages.overridePref().overridePersonPrefer(34827, 48, "card");
        Pages.overridePref().overridePersonPrefer(34827, 49, "first");

        // Precondition: Generate an Inactive Student Account
        String username  = "StudentInfoTest_" + TIME_STAMP;
        String firstname = "Student Info Test ";
        String lastname  = TIME_STAMP;
        Pages.createAccount().createCustomAccountGenerator(username, "edi", firstname, lastname, TEMP_EMAIL, TEMP_PHONE, "10/10/1999", "2", "21" );

        // Step 1 - Log in
        Pages.login().inputLoginCredentials("Jonathan", "edi");
        Pages.login().clickLoginButton();

        // Step 2 - Go to student's Student Info App
        Pages.home().clickShowInactivesCheckbox();
        Browser.refreshPage();
        CreateAccountGenerator account = new CreateAccountGenerator();
        Pages.home().searchForStudent(account.GeneratedPersonId +"\n");
        Pages.home().clickEyeButtonOnCard();

        // Step 3 - Update Student's Name, DOB, Email, and Phone in Student Info Form
        Browser.refreshPage();
        StudentInfoPage s = new StudentInfoPage();
        studentInfo().updateInfo(s.studentInfoFirstName, "Update");
        studentInfo().updateInfo(s.studentInfoLastName, "Student Info Test");
        studentInfo().updateInfo(s.studentInfoDateOfBirth,"02/02/2002");
        //studentInfo().updateWidgetInfo(GUARDIAN_EMAIL_WIDGET,"updated_email_address@edudyn.com");
        //studentInfo().updateWidgetInfo(GUARDIAN_PHONE_WIDGET,"0000000000");
        studentInfo().clickSaveStudentInfoButton();
    }

    @Test
    public void updateGuardianLiveData() throws Exception {
        // Scenario 1.2
        // Step 1 - Log in
        Browser.goTo(HOMEPAGE_URL);
        Pages.login().inputLoginCredentials("Jonathan", "edi");
        Pages.login().clickLoginButton();

        // Precondition: Generate an Inactive Student Account
        String username  = "StudentInfoTest_" + TIME_STAMP;
        String firstname = "Student Info Test ";
        String lastname  = TIME_STAMP;
        Pages.createAccount().createCustomAccountGenerator(username, "edi", firstname, lastname, TEMP_EMAIL, TEMP_PHONE, "10/10/1999", "2", "21" );
        Pages.addGuardianGenerator().addGuardianToGeneratedStudent();

        // Step 1 - Log in
        Pages.login().inputLoginCredentials("Jonathan", "edi");
        Pages.login().clickLoginButton();

        // Step 2 - Go to student's Student Info App
        Pages.home().clickShowInactivesCheckbox();
        Browser.refreshPage();
        CreateAccountGenerator account = new CreateAccountGenerator();
        Pages.home().searchForStudent(account.GeneratedPersonId +"\n");
        Pages.home().clickEyeButtonOnCard();

        // Step 3 - Update Student's Guardian's Name, DOB, Email, and Phone in Student Info Form
        Browser.refreshPage();
        StudentInfoPage s = new StudentInfoPage();
        studentInfo().updateInfo(s.householdContactGuardianFirstName, "Update");
        studentInfo().updateInfo(s.householdContactGuardianFirstName, "Guardian Student Info Test");
        studentInfo().updateGuardianRelationship();
        studentInfo().updateWidgetInfo(GUARDIAN_EMAIL_WIDGET,"updated_guardian_email_address@edudyn.com");
        studentInfo().updateWidgetInfo(GUARDIAN_PHONE_WIDGET,"1111111111");
        studentInfo().clickSaveStudentInfoButton();

        // Step 4 - Verify updated info in Student Info and Card
        Pages.topNavigation().clickLogoButton();
        Browser.refreshPage();
        Pages.home().clickIButton();
        System.out.println("Updated Student Info From Live Data:");
        Pages.home().assertStudentSearchResultOnCard_FirstNameDisplay("Updated Student Info Test");
        Pages.home().assertInfoBackOfCard("email", "updated_email_address@edudyn.com");
        Pages.home().assertInfoBackOfCard("phone", "0000000000");

    }
}
