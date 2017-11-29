package webpages;
import objects.Browser;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ReportPage {

    /**
     * All Report Labels Elements
     */
    @FindBy(how = How.LINK_TEXT, using = "Curriculum Reports")
    WebElement curriculumReports;
    @FindBy(how = How.LINK_TEXT, using = "Letters & Labels")
    WebElement lettersAndLabels;
    @FindBy(how = How.LINK_TEXT, using = "School Reports")
    WebElement schoolReports;
    @FindBy(how = How.LINK_TEXT, using = "Student Reports")
    WebElement studentReports;


    /**
     * All the Report Name Element Links
     */
    @FindBy(how = How.LINK_TEXT, using = "Online Assessment - Detail Report")
    WebElement onlineAssessmentDetailReport;
    @FindBy(how = How.LINK_TEXT, using = "Transcript of Record")
    WebElement transcriptOfRecord;


    public static String baseReportUrl = Browser.getBaseUrl() + "/reports";

    /**
     * Takes you report page
     */
    public void goTo(){
        Pages.topNavigation().clickReportsButton();
    }

    /**
     * Checks to see if you are on report page
     */
    public void isAt(){
        Browser.waitUntilUrlMatches(baseReportUrl);
    }

    public void clickCurriculumReports(){
        curriculumReports.click();
    }

    public void clickLettersAndLabels(){
        lettersAndLabels.click();
    }

    public void clickSchoolReports(){
        schoolReports.click();
    }

    public void clickStudentReports(){
        studentReports.click();
    }

    public void clickOnlineAssessmentDetailReport(){
        Browser.waitUntilElementIsVisible(By.linkText(onlineAssessmentDetailReport.getText()));
        onlineAssessmentDetailReport.click();
        //isAtReportViewer( onlineAssessmentDetailReport.getAttribute("href"));
    }

    public void clickTranscriptOfRecord(){
        Browser.waitUntilElementIsVisible(By.linkText(transcriptOfRecord.getText()));
        transcriptOfRecord.click();
        //isAtReportViewer( transcriptOfRecord.getAttribute("href"));
    }

    private void isAtReportViewer( String reportLink ){
        //need to switch to new window
        Browser.waitUntilUrlMatches( reportLink );
    }


}