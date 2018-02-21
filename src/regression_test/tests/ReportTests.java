package tests;
import objects.Browser;


import org.junit.Test;
import webpages.Pages;

import static org.junit.Assert.assertTrue;

public class ReportTests extends TestBase{

    @Test
    public void viewReportPage(){
        Pages.login().inputLoginCredentials( "Ricardo", "EDI12");
        Pages.login().clickLoginButton();
        Pages.reports().goTo();
        Pages.reports().isAt();
    }

    @Test
    public void viewOnlineAssessmentDetailReport() throws InterruptedException {
        viewReportPage();
        Pages.reports().clickCurriculumReports();
        Pages.reports().clickOnlineAssessmentDetailReport();
    }

//    @Test
//    public void viewOnlineAssessmentSummaryReport(){
//        Pages.reports().clickCurriculumReports();
//    }
//
//    @Test
//    public void viewFolderLabels(){
//
//    }
//
//    @Test
//    public void viewHomeLanguageSurvey(){
//
//    }
//
//    @Test
//    public void viewTruancyLetter(){
//
//    }
//
//    @Test
//    public void viewWithdrawal(){
//
//    }
//
//    @Test
//    public void view20andOlderReport(){
//
//    }
//
//    @Test
//    public void viewApexAddandDelete(){
//
//    }
//
//    @Test
//    public void viewCumulativeStudentRoster() {
//
//    }
//
//    @Test
//    public void viewDigitalRegistration(){
//
//    }
//
//    @Test
//    public void viewELT(){
//
//    }
//
//    @Test
//    public void viewUtilization(){
//
//    }
//
//    @Test
//    public void viewRCE(){
//
//    }
//
//    @Test
//    public void viewRWA(){
//
//    }

    @Test
    public void viewTranscriptOfRecord(){
        viewReportPage();
        Pages.reports().clickStudentReports();
        Pages.reports().clickTranscriptOfRecord();
    }

}
