package tests;

import org.junit.Test;
import webpages.*;

public class GuidesTests extends TestBase {

    /**
     * Simple Guide Validations
     * @throws Exception
     */
    @Test
    public void testGuidesFunction() throws Exception {
        
        // Step 1) Go to the login page and click create account
        Pages.login().inputLoginCredentials("jonathan", "edi");
        Pages.login().clickLoginButton();

        // Step 2) Navigate to Guides App
        Pages.topNavigation().clickHamburgerButton();
        Pages.topNavigation().clickGuidesButton();

        // Step 3)


    }


}
