package tests;

import org.junit.Assert;
import org.junit.Test;
import webpages.Pages;

public class ReportTests extends TestBase {

    @Test
    public void canViewOnlineAssessmentDetailReport(){
        //login somehow
        Pages.login().goTo();
        Assert.assertTrue(Pages.login().IsAt());

        //go to report page

        //check if link is there

        //click link
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
