package tests;
import objects.Browser;


import org.junit.Test;
import webpages.Pages;

import static org.junit.Assert.assertTrue;

public class ReportTests extends TestBase{

    @Test
    public void canViewReportPage(){
        Pages.login().inputLoginCredentials( "Ricardo", "EDI12");
        Pages.login().clickLoginButton();
        Pages.reports().goTo();
    }

    @Test
    public void canViewOnlineAssessmentSummaryReport(){

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
