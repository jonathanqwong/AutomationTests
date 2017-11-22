package tests;

import objects.Browser;
import org.junit.Test;
import webpages.*;

import static generators.CreateAccountGenerator.TIME_STAMP;
import static webpages.AccountCreationPage.ACCOUNT_CREATION_PAGE;
import static webpages.LoginPage.HOMEPAGE_URL;

public class GuidesTests extends TestBase {

    @Test
    public void testGuidesFunction() throws Exception {
        
        // Step 1) Go to the login page and click create account
        Pages.login().inputLoginCredentials("jonathan", "edi");
        Pages.login().clickLoginButton();

        // Step 2) Navigate to Guides App
        Pages.topNavigation().clickHamburgerButton();
        Pages.topNavigation().clickGuidesButton();
        Pages.topNavigation().clickHomeButton();
    }


}
