package com.studenttrac.stage.tests;

import com.studenttrac.stage.webpages_v1_6.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class registration_v1_6 {

    WebDriver selenium;
    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "browser//chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        selenium = new ChromeDriver(chromeOptions);
        selenium.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

//    @After
//    public void tearDown() throws Exception {
//        selenium.quit();
//    }

    @Test
    public void startRegistration() throws Exception {

        // Step 1) Go to the login page and click create account
        loginPage_v1_6 login = new loginPage_v1_6(selenium);
        login.clickCreateAccountButton();

        // Step 2) Create an account
        accountCreationPage_v1_6 createAccount = new accountCreationPage_v1_6(selenium);
        createAccount.fillOutCreateAccountForm();
        createAccount.isCreateAccountButtonPresent();
        createAccount.clickCreateAccountButton();
        System.out.println("Student Account Creation Confirmed");

        // Step 3) Validate the account is created on Landing Page
        landingPage_v1_6 landing = new landingPage_v1_6(selenium);
        landing.clickLetsGetStartButton();
        System.out.println("Landing Page Confirmed");

        // Step 4) Add a Guardian
        addGuardianPage_v1_6 guardian = new addGuardianPage_v1_6(selenium);
        guardian.clickAddGuardianButton();
        guardian.fillOutGuardianInfo();
        guardian.clickSaveButton();
        guardian.clickDoneButton();
        System.out.println("Guardian Added Confirmed");

        // Step 5) Select Enrollment Period
        enrollmentPage_v1_6 enrollment = new enrollmentPage_v1_6(selenium);
        enrollment.clickRegisterButton();
        System.out.println("Registration Started Confirmed");

        // Step 6) Fill Out Registration Forms
        registrationFormPage_v1_6 registration = new registrationFormPage_v1_6(selenium);
        registration.fillOutStudentApplicationForm();
        registration.fillOutHouseHoldInfoForm();
        registration.fillOutEmergencyHealthForm();
        registration.fillOutPhotographicConsent();
        registration.fillOutInternetAccessConsent();
        registration.fillOutPhysicalEducationConsent();
        registration.fillOutTransportationConsent();
        registration.fillOutAffidavitConsent();
        registration.fillOutMAConsent();
    }

    @Test
    public void createAccountDuplicateException() throws Exception {

        // Step 1) Go to the login page and click create account
        loginPage_v1_6 login = new loginPage_v1_6(selenium);
        login.clickCreateAccountButton();

        // Step 2) Create an account
        accountCreationPage_v1_6 createAccount = new accountCreationPage_v1_6(selenium);
        createAccount.fillOutCreateAccountForm();
        createAccount.isCreateAccountButtonPresent();
        createAccount.clickCreateAccountButton();

        // Step 3) Assert Username UNQ Exception
        WebElement usernameTakenText = selenium.findElement(By.id("dialogContent_131"));
        assertTrue(usernameTakenText != null);
        System.out.println("Student Account Creation Duplication Exception");
    }



}
