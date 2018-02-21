package tests;

import generators.CreateAccountGenerator;
import objects.Browser;
import org.junit.Test;
import webpages.Pages;
import static generators.CreateAccountGenerator.TEMP_EMAIL;
import static generators.CreateAccountGenerator.TEMP_PHONE;
import static generators.CreateAccountGenerator.TIME_STAMP;

public class ShellTests extends TestBase {

    @Test
    public void changeClientSelectorTest() throws Exception {
        // Scenario 1.1
        // Precondition: Switch Clients to PIE-Illinois and Make Person Preference On Card View and First Name First Display
        Pages.switchClient().switchClientId("4");
        Pages.overridePref().overridePersonPrefer(34827, 48, "card");
        Pages.overridePref().overridePersonPrefer(34827, 49, "first");

        // Step 1 - Log in
        Pages.login().inputLoginCredentials("Jonathan", "edi");
        Pages.login().clickLoginButton();

        // Step 2 - Change Client to Ashburn and Assert Client
        Browser.refreshPage();
        Pages.home().clearStudentSelector();
        Pages.home().selectAshburnClient();
        Pages.home().assertUserClient("Ashburn");

        // Step 3 - Change Client back to PIE-Illinois
        Browser.refreshPage();
        Pages.home().clearStudentSelector();
        Pages.home().selectPieIlClient();
    }


//    @Test
//    public void changeFilterSelectorTest() throws Exception {
//        //Scenario 1.2
//        // Precondition: Make sure 'Use Groups, Classes, Programs' Preference is on
//        Pages.overridePref().overrideClientPref(0, 50, "1");
//        Pages.overridePref().overrideClientPref(0, 51, "1");
//        Pages.overridePref().overrideClientPref(0, 52, "1");
//
//        // Step 1 - Log in
//        Pages.login().inputLoginCredentials("Jonathan", "edi");
//        Pages.login().clickLoginButton();
//
//        // Step 2 - Select Teacher Filter and Assert Teacher Results
//        Browser.refreshPage();
//        Pages.home().clickFilterSelector();
//        Pages.home().selectTeacherFilter();
//        Pages.home().selectTeacherBrianPervan();
//        Pages.home().assertStudentResultTeachers("Brian Pervan");
//        Pages.home().selectAllTeachers();
//
//        // Step 3 - Select Group Filter
////        Browser.refreshPage();
////        Pages.home().clickFilterSelector();
////        Pages.home().selectGroupFilter();
//
//    }


    @Test
    public void searchStudentTest() throws Exception {
        // Scenario 1.3
        // Precondition: Switch Client to PIE-Illinois and Make Person Preference On Card View and First Name First Display
        Pages.switchClient().switchClientId("4");
        Pages.overridePref().overridePersonPrefer(34827, 48, "card");
        Pages.overridePref().overridePersonPrefer(34827, 49, "first");

        // Step 1 - Log in
        Pages.login().inputLoginCredentials("Jonathan", "edi");
        Pages.login().clickLoginButton();

        // Step 2 - Search for a student and assert student result
        Browser.refreshPage();
        Pages.home().searchForStudent("Santoyo\n");
        Pages.home().assertStudentSearchResultOnCard_FirstNameDisplay("Abel Santoyo");

        // Step 3 - Search for a student with an apostrophe
        Pages.home().searchForStudent("La'Quia\n");
        Pages.home().assertStudentSearchResultOnCard_FirstNameDisplay("La'Quia Lee");

        // Step 4 - Search or multiple students with student ids
        // To-Do

        // Step 5 - Search for a non-existing student
        Pages.home().searchForStudent("ffffffff\n");
        Pages.home().assertNoStudentSearchResult("There doesn't seem to be any results for this client and teachers.");

    }


    @Test
    public void searchInactiveStudentsTest() throws Exception {
        // Scenario 1.4
        // Precondition: Switch Client to PIE-Illinois and Make Person Preference On Card View and First Name First Display
        Pages.switchClient().switchClientId("4");
        Pages.overridePref().overridePersonPrefer(34827, 48, "card");
        Pages.overridePref().overridePersonPrefer(34827, 49, "first");

        // Precondition: Generate an Inactive Student Account
        String username  = "Inactive_Test_" + TIME_STAMP;
        String firstname = "Inactive";
        String lastname  = "Test_" + TIME_STAMP;
        Pages.createAccount().createCustomAccountGenerator(username, "edi", firstname, lastname, TEMP_EMAIL, "(333)333-3333", "10/10/1999", "2", "21" );

        // Step 1 - Log in
        Pages.login().inputLoginCredentials("Jonathan", "edi");
        Pages.login().clickLoginButton();

        // Step 2 - Search for inactive student
        Browser.refreshPage();
        Pages.home().clickShowInactivesCheckbox();
        Pages.home().searchForStudent(firstname + " " + lastname + "\n");
        Pages.home().assertStudentSearchResultOnCard_FirstNameDisplay(firstname + " " + lastname);
    }


    @Test
    public void changeDisplayAsFilterTest() throws Exception {
        // Scenario 1.5
        // Precondition: Switch Client to PIE-Illinois and Make Person Preference On Card View and First Name First Display
        Pages.switchClient().switchClientId("4");
        Pages.overridePref().overridePersonPrefer(34827, 48, "card");
        Pages.overridePref().overridePersonPrefer(34827, 49, "first");

        // Step 1 - Log in
        Pages.login().inputLoginCredentials("Jonathan", "edi");
        Pages.login().clickLoginButton();

        // Step 2 - Change Display As Filter
        Browser.refreshPage();
        Pages.home().clickDisplayAsSelector();
        Pages.home().clickLastNameSelectOption();

        // Step 3 - Assert Last Name First in First Card
        Pages.home().searchForStudent("Abundio\n");
        Pages.home().assertStudentSearchResultOnCard_LastNameDisplay("Abundio, Andrew");
    }


    @Test
    public void changeSelectedViewTest () throws Exception {
        // Scenario 1.6
        // Precondition: Switch Client to PIE-Illinois and Make Person Preference On Card View and First Name First Display
        Pages.switchClient().switchClientId("4");
        Pages.overridePref().overridePersonPrefer(34827, 48, "card");
        Pages.overridePref().overridePersonPrefer(34827, 49, "first");

        // Step 1 - Log in
        Pages.login().inputLoginCredentials("Jonathan", "edi");
        Pages.login().clickLoginButton();

        // Step 2 - Go to Grid View
        Browser.refreshPage();
        Pages.home().clickGridViewButton();

        // Step 3 - Assert Student in Grid View
        Pages.home().searchForStudent("Santoyo\n");
        Pages.home().assertStudentInGridViewDiplay("Abel Santoyo");
    }


    @Test
    public void appRedirectionTestOnCard() throws Exception {
        // Scenario 1.7
        // Precondition: Switch Client to PIE-Illinois and Make Person Preference On Card View and First Name First Display
        Pages.switchClient().switchClientId("4");
        Pages.overridePref().overridePersonPrefer(34827, 48, "card");
        Pages.overridePref().overridePersonPrefer(34827, 49, "first");

        // Step 1 - Log in
        Pages.login().inputLoginCredentials("Jonathan", "edi");
        Pages.login().clickLoginButton();

        // Step 2 - Search for a student
        Browser.refreshPage();
        Pages.home().searchForStudent("Santoyo\n");
        System.out.println("Starting Application Assertion from Card View:\n");

        // Step 3 - Test app redirection from card view
        Pages.home().clickThreeDotsButtonOnCard();
        Pages.home().clickAppIconOnCard("Guides");
        Pages.home().assertAppPage("Guides");

        Pages.topNavigation().clickLogoButton();
        Pages.home().clickThreeDotsButtonOnCard();
        Pages.home().clickAppIconOnCard("Ext. Asmt.");
        Pages.home().assertAppPage("Ext. Asmt.");

        Pages.topNavigation().clickLogoButton();
        Pages.home().clickThreeDotsButtonOnCard();
        Pages.home().clickAppIconOnCard("Student Files");
        Pages.home().assertAppPage("Student Files");

        Pages.topNavigation().clickLogoButton();
        Pages.home().clickThreeDotsButtonOnCard();
        Pages.home().clickAppIconOnCard("Calendar");
        Pages.home().assertAppPage("Calendar");

        //Pages.topNavigation().clickLogoButton();
        //Pages.home().clickThreeDotsButtonOnCard();
        //Pages.home().clickAppIconOnCard("Reports");
        //Pages.home().assertAppPage("Reports");

        Pages.topNavigation().clickLogoButton();
        Pages.home().clickThreeDotsButtonOnCard();
        Pages.home().clickAppIconOnCard("History");
        Pages.home().assertAppPage("History");

        Pages.topNavigation().clickLogoButton();
        Pages.home().clickThreeDotsButtonOnCard();
        Pages.home().clickAppIconOnCard("Registration");
        Pages.home().assertAppPage("Registration");

        //Pages.topNavigation().clickLogoButton();
        //Pages.home().clickThreeDotsButtonOnCard();
        //Pages.home().clickAppIconOnCard("Classroom");
        //Pages.home().assertAppPage("Classroom");

        Pages.topNavigation().clickLogoButton();
        Pages.home().clickThreeDotsButtonOnCard();
        Pages.home().clickAppIconOnCard("Student Forms");
        Pages.home().assertAppPage("Student Forms");
    }


    @Test
    public void appRedirectionTestOnGrid() throws Exception {
        // Scenario 1.8
        // Precondition: Switch Client to PIE-Illinois and  Make Person Preference On Grid View and First Name First Display
        Pages.switchClient().switchClientId("4");
        Pages.overridePref().overridePersonPrefer(34827, 48, "grid");
        Pages.overridePref().overridePersonPrefer(34827, 49, "first");

        // Step 1 - Log in
        Pages.login().inputLoginCredentials("Jonathan", "edi");
        Pages.login().clickLoginButton();

        // Step 2 - Search for a student
        Browser.refreshPage();
        Pages.home().searchForStudent("Santoyo\n");
        System.out.println("Starting Application Assertion from Grid View:\n");

        // Step 3 - Test app redirection from grid view
        Browser.refreshPage();
        Pages.home().clickThreeDotsButtonOnGrid();
        Pages.home().clickAppIconOnGrid("Guides");
        Pages.home().assertAppPage("Guides");

        Pages.topNavigation().clickLogoButton();
        Pages.home().clickThreeDotsButtonOnGrid();
        Pages.home().clickAppIconOnGrid("Ext. Asmt.");
        Pages.home().assertAppPage("Ext. Asmt.");

        Pages.topNavigation().clickLogoButton();
        Pages.home().clickThreeDotsButtonOnGrid();
        Pages.home().clickAppIconOnGrid("Student Files");
        Pages.home().assertAppPage("Student Files");

        Pages.topNavigation().clickLogoButton();
        Pages.home().clickThreeDotsButtonOnGrid();
        Pages.home().clickAppIconOnGrid("Calendar");
        Pages.home().assertAppPage("Calendar");

        //Pages.topNavigation().clickLogoButton();
        //Pages.home().clickThreeDotsButtonOnGrid();
        //Pages.home().clickAppIconOnGrid("Reports");
        //Pages.home().assertAppPage("Reports");

        Pages.topNavigation().clickLogoButton();
        Pages.home().clickThreeDotsButtonOnGrid();
        Pages.home().clickAppIconOnGrid("History");
        Pages.home().assertAppPage("History");

        Pages.topNavigation().clickLogoButton();
        Pages.home().clickThreeDotsButtonOnGrid();
        Pages.home().clickAppIconOnGrid("Registration");
        Pages.home().assertAppPage("Registration");

        //Pages.topNavigation().clickLogoButton();
        //Pages.home().clickThreeDotsButtonOnGrid();
        //Pages.home().clickAppIconOnGrid("Classroom");
        //Pages.home().assertAppPage("Classroom");

        Pages.topNavigation().clickLogoButton();
        Pages.home().clickThreeDotsButtonOnGrid();
        Pages.home().clickAppIconOnGrid("Student Forms");
        Pages.home().assertAppPage("Student Forms");
    }


    @Test
    public void eyeRedirectionTest() throws Exception {
        // Scenario 1.9
        // Precondition: Switch Client to PIE-Illinois and  Make Person Preference On Grid View and First Name First Display
        Pages.switchClient().switchClientId("4");
        Pages.overridePref().overridePersonPrefer(34827, 48, "card");
        Pages.overridePref().overridePersonPrefer(34827, 49, "first");

        // Step 1 - Log in
        Pages.login().inputLoginCredentials("Jonathan", "edi");
        Pages.login().clickLoginButton();

        // Step 2 - Search for a student
        Browser.refreshPage();
        Pages.home().searchForStudent("Santoyo\n");

        // Step 3 - Test student info app redirection from card view
        System.out.println("Starting Student Info Redirection from Card View:");
        Pages.home().clickEyeButtonOnCard();
        Pages.home().assertAppPage("Student Info.");
        Pages.topNavigation().clickLogoButton();

        // Step 4 - Test student info app redirection from grid view
        Browser.refreshPage();
        Pages.home().clickGridViewButton();

        Browser.refreshPage();
        System.out.println("Starting Student Info Redirection from Grid View:");
        Pages.home().clickEyeButtonOnGrid();
        Pages.home().assertAppPage("Student Info.");
    }


    @Test
    public void iButtonFunctionalTest() throws Exception {
        // Scenario 1.10
        // Precondition: Switch Client to PIE-Illinois and  Make Person Preference On Grid View and First Name First Display
        Pages.switchClient().switchClientId("4");
        Pages.overridePref().overridePersonPrefer(34827, 48, "card");
        Pages.overridePref().overridePersonPrefer(34827, 49, "first");

        // Precondition: Generate an Inactive Student Account
        String username  = "iBtn_Test_" + TIME_STAMP;
        String firstname = "iBtn";
        String lastname  = "Test_" + TIME_STAMP;
        Pages.createAccount().createCustomAccountGenerator(username, "edi", firstname, lastname, TEMP_EMAIL, TEMP_PHONE, "10/10/1999", "2", "21" );

        // Step 1 - Log in
        Pages.login().inputLoginCredentials("Jonathan", "edi");
        Pages.login().clickLoginButton();

        // Step 2 - Search for generated student
        Browser.refreshPage();
        Pages.home().clickShowInactivesCheckbox();
        CreateAccountGenerator account = new CreateAccountGenerator();
        Pages.home().searchForStudent(account.GeneratedPersonId + "\n");

        // Step 3 - Click "i" for back of card and assert contents
        Pages.home().clickIButton();
        Pages.home().assertStudentSearchResultOnCard_FirstNameDisplay( "IBtn " + lastname); //First characters are capitalized
        Pages.home().assertInfoBackOfCard("username", username);
        Pages.home().assertInfoBackOfCard("email", TEMP_EMAIL);
        Pages.home().assertInfoBackOfCard("phone", TEMP_PHONE);
        Pages.home().assertInfoBackOfCard("set-temporary-password", "Set Temporary Password");
        Pages.home().assertInfoBackOfCard("guardiansContact",
                "Name:\n" +
                        "Relationship:\n" +
                        "No Email\n" +
                        "No Phone");

        // Step 4 - Add Guardian to generated student
        Pages.home().clickEditGuardianFromCardViewButton();
        Browser.refreshPage();
        Pages.addGuardian().clickAddGuardianButton();
        Pages.addGuardian().fillOutGuardianInfoConstructor("Dad", lastname, TEMP_EMAIL, TEMP_PHONE, "");
        Pages.addGuardian().clickPrimaryCheckbox();
        Pages.addGuardian().clickEmergencyCheckbox();
        Pages.addGuardian().clickSaveButton();
        Pages.addGuardian().clickDoneButton();
        Pages.topNavigation().clickLogoButton();

        // Step 5 - Assert added guardian to the generated student
        Browser.refreshPage();
        Pages.home().clickIButton();
        Pages.home().assertInfoBackOfCard("guardiansContact",
                "Name: Dad " + lastname + "\n" +
                        "Relationship: Aunt\n" +
                        TEMP_EMAIL + "\n" +
                        "(333) 333-3333");

        // Step 6 - Reset password in generated account
        Pages.home().clickResetPasswordLink();
        Pages.home().clickSetPasswordButton();
        Pages.home().clickOkBtnInTempPwDialog();
        Pages.home().clickBackToFrontOfCardButton();

        // Step 7 - Log out of admin account
        Pages.topNavigation().clickProfileButton();
        Pages.topNavigation().clickLogOutSelectOption();

        // Step 8 - Log in generated account with temporary password
        Pages.login().inputLoginCredentials(username, "Password1");
        Pages.login().clickLoginButton();
        Pages.home().assertChangePasswordDialog("Change Password");
    }
}
