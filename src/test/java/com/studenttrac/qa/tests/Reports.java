package com.studenttrac.qa.tests;

import com.studenttrac.qa.objects.Report;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class Reports {

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
    public void testOnlineAssessmentDetailReport(){

    }

    @Test
    public void testOnlineAssessmentSummaryReport(){

    }

    @Test
    public void testFolderLabels(){

    }

    @Test
    public void testHomeLanguageSurvey(){

    }

    @Test
    public void testTruancyLetter(){

    }

    @Test
    public void testWithdrawal(){

    }

    @Test
    public void test20andOlderReport(){

    }

    @Test
    public void testApexAddandDelete(){

    }

    @Test
    public void testCumulativeStudentRoster() {

    }

    @Test
    public void testDigitalRegistration(){

    }

    @Test
    public void testELT(){

    }

    @Test
    public void testUtilization(){

    }

    @Test
    public void testRCE(){

    }

    @Test
    public void testRWA(){

    }

    @Test
    public void testTranscriptOfRecord(){

    }

}
