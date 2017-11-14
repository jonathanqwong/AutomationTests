package tests;
import objects.Browser;


import org.junit.Test;
import webpages.Pages;

import static org.junit.Assert.assertTrue;

public class ReportTests extends TestBase{

    @Test
    public void canViewReportPage(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //login somehow
        Pages.login().inputLoginCredentials( "Ricardo", "EDI12");
        Pages.login().clickLoginButton();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Pages.report().goTo();
        //assertTrue(Pages.report().isAt());

        //go to report page

        //check if link is there

        //click link
    }

    @Test
    public void canViewOnlineAssessmentSummaryReport() throws Exception {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Browser.goTo("#/registration/21");
    }

    @Test
    public void canViewFolderLabels(){

    }

    @Test
    public void canViewHomeLanguageSurvey(){

    }

    @Test
    public void canViewTruancyLetter(){

    }

    @Test
    public void canViewWithdrawal(){

    }

    @Test
    public void canView20andOlderReport(){

    }

    @Test
    public void canViewApexAddandDelete(){

    }

    @Test
    public void canViewCumulativeStudentRoster() {

    }

    @Test
    public void canViewDigitalRegistration(){

    }

    @Test
    public void canViewELT(){

    }

    @Test
    public void canViewUtilization(){

    }

    @Test
    public void canViewRCE(){

    }

    @Test
    public void canViewRWA(){

    }

    @Test
    public void canViewTranscriptOfRecord(){

    }

}
