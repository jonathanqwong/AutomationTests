package tests;

import objects.Report;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ReportTests {

    WebDriver selenium;
    //TODO pull out of class to a general location
    String environment = "qa";

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "browser//chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        selenium = new ChromeDriver(chromeOptions);
        selenium.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void canViewOnlineAssessmentDetailReport(){
        //login somehow

        //go to report page

        //check if link is there

        //click link
        Report testReport = new Report( 10, "Curriculum Reports", "Online Assessment - Detail Report", "Returns the STudent's Test Assignment Test Information");
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
