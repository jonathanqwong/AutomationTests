package webpages;

import generators.*;
import objects.Browser;
import org.openqa.selenium.support.PageFactory;

/**
  * Purpose: Page class allows access to all web pages, their functions, and selenium web driver elements through PageFactory
 **/

public class Pages {
    /*private static <T> T GetPage(Class<T> pageClass) throws IllegalAccessException, InstantiationException {
        T page = pageClass.newInstance();
        PageFactory.initElements( Browser.getDriver(), page );
        return page;
    }*/

    public static AccountCreationPage accountCreation() {
        AccountCreationPage page = new AccountCreationPage();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static AddGuardianGenerator addGuardianGenerator() {
        AddGuardianGenerator page = new AddGuardianGenerator();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }


    public static AddGuardianPage addGuardian() {
        AddGuardianPage page = new AddGuardianPage();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static CreateAccountGenerator createAccount() {
        CreateAccountGenerator page = new CreateAccountGenerator();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static EnrollmentPage enrollment() {
        EnrollmentPage page = new EnrollmentPage();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static GeneralMethods general() {
        GeneralMethods page = new GeneralMethods();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static TokenGenerator getTokens() {
        TokenGenerator page = new TokenGenerator();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static GuidesPage guides() {
        GuidesPage page = new GuidesPage();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static HomePage home() {
        HomePage page = new HomePage();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static LandingPage landing() {
        LandingPage page = new LandingPage();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static LoginPage login() {
        LoginPage page = new LoginPage();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static OverridePreferenceGenerator overridePref() {
        OverridePreferenceGenerator page = new OverridePreferenceGenerator();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static ReportPage reports() {
        ReportPage page = new ReportPage();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static RegistrationFormPage registrationForm() {
        RegistrationFormPage page = new RegistrationFormPage();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static SwitchClient switchClient() {
        SwitchClient page = new SwitchClient();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static StudentFilesPage studentFiles() {
        StudentFilesPage page = new StudentFilesPage();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static StudentInfoPage studentInfo() {
        StudentInfoPage page = new StudentInfoPage();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static TopNavigationPage topNavigation() {
        TopNavigationPage page = new TopNavigationPage();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

}
