package tests;

import generators.CreateAccountGenerator;
import objects.Browser;
import org.junit.Test;
import webpages.Pages;

import static generators.CreateAccountGenerator.TEMP_EMAIL;
import static generators.CreateAccountGenerator.TEMP_PHONE;
import static generators.CreateAccountGenerator.TIME_STAMP;

public class StudentFilesTests {

    @Test
    public void uploadFilesTest() throws Exception {
        // Scenario 1.1
        // Precondition: Switch Client to PIE-Illinois and Make Person Preference On Card View and First Name First Display
        Pages.switchClient().switchClientId("21");
        Pages.overridePref().overridePersonPrefer(34827, 48, "card");
        Pages.overridePref().overridePersonPrefer(34827, 49, "first");

        // Precondition: Generate an Inactive Student Account
        String username  = "StudentFileTest_" + TIME_STAMP;
        String firstname = "Student File Test ";
        String lastname  = TIME_STAMP;
        Pages.createAccount().createCustomAccountGenerator(username, "edi", firstname, lastname, TEMP_EMAIL, TEMP_PHONE, "10/10/1999", "2", "21" );

        // Step 1 - Log in
        Pages.login().inputLoginCredentials("Jonathan", "edi");
        Pages.login().clickLoginButton();

        // Step 2 - Go to student's Student Files App
        Pages.home().clickShowInactivesCheckbox();
        Browser.refreshPage();
        CreateAccountGenerator account = new CreateAccountGenerator();
        Pages.home().searchForStudent(account.GeneratedPersonId +"\n");
        Pages.home().clickThreeDotsButtonOnCard();
        Pages.home().clickAppIconOnCard("Student Files");
    }
}
