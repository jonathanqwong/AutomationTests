package webpages;

import generators.CreateAccountGenerator;
import generators.GeneralMethods;
import objects.Browser;
import org.openqa.selenium.support.PageFactory;

/**
  * Purpose: Page class allows access to all web pages and their functions and selenium web driver elements
 **/

public class Pages {
    /*private static <T> T GetPage(Class<T> pageClass) throws IllegalAccessException, InstantiationException {
        T page = pageClass.newInstance();
        PageFactory.initElements( Browser.getDriver(), page );
        return page;
    }*/

    public static AccountCreationPage accountCreation(){
        AccountCreationPage page = new AccountCreationPage();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static AddGuardianPage addGuardian(){
        AddGuardianPage page = new AddGuardianPage();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static EnrollmentPage enrollment (){
        EnrollmentPage page = new EnrollmentPage();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static LandingPage landing (){
        LandingPage page = new LandingPage();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static LoginPage login(){
        LoginPage page = new LoginPage();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static RegistrationFormPage registrationForm(){
        RegistrationFormPage page = new RegistrationFormPage();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static ReportPage report(){
        ReportPage page = new ReportPage();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static GeneralMethods general(){
        GeneralMethods page = new GeneralMethods();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }

    public static CreateAccountGenerator createAccount(){
        CreateAccountGenerator page = new CreateAccountGenerator();
        PageFactory.initElements(Browser.getDriver(), page );
        return page;
    }
}
