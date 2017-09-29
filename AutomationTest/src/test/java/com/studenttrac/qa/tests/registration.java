package com.studenttrac.qa.tests;

import java.util.concurrent.TimeUnit;
import com.studenttrac.qa.webpages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import static org.junit.Assert.*;
import org.junit.*;

public class registration {
    WebDriver selenium;

    private void loadCreateAccountPage() {
        selenium.get("https://stage.studenttrac.com/#/registration/create/21");
    }

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "browser//chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        selenium = new ChromeDriver(chromeOptions);
        loadCreateAccountPage();
        selenium.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

//    @After
//    public void tearDown() throws Exception {
//        selenium.quit();
//    }

    @Test
    public void startRegistration() throws Exception {

        // Step 1) Go to the login page and click create account
        loginPage login = new loginPage(selenium);
        login.clickCreateAccountButton();

        // Step 2) Create an account
        accountCreationPage createAccount = new accountCreationPage(selenium);
        createAccount.fillOutCreateAccountForm();
        createAccount.isCreateAccountButtonPresent();
        createAccount.clickCreateAccountButton();
        System.out.println("Student Account Creation Confirmed");

        // Step 3) Validate the account is created on Landing Page
        landingPage landing = new landingPage(selenium);
        landing.clickLetsGetStartButton();
        System.out.println("Landing Page Confirmed");
//        WebElement getStartedText = selenium.findElement(By.className("getStarted"));
//        assertTrue(getStartedText != null);

        // Step 4) Add a Guardian
        addGuardianPage guardian = new addGuardianPage(selenium);
        guardian.clickAddGuardianButton();
        guardian.fillOutGuardianInfo();
        guardian.clickSaveButton();
        guardian.clickDoneButton();
        System.out.println("Guardian Added Confirmed");

        // Step 5) Select Enrollment Period
        enrollmentPage enrollment = new enrollmentPage(selenium);
        enrollment.clickRegisterButton();
        System.out.println("Registration Started Confirmed");

        // Step 6) Fill Out Registration Forms
        registrationFormPage registration = new registrationFormPage(selenium);
        registration.fillOutStudentApplicationForm();
        registration.fillOutHouseHoldInfoForm();

    }

    @Test
    public void createAccountDuplicateException() throws Exception {

        // Step 1) Go to the login page and click create account
        loginPage login = new loginPage(selenium);
        login.clickCreateAccountButton();

        // Step 2) Create an account
        accountCreationPage createAccount = new accountCreationPage(selenium);
        createAccount.fillOutCreateAccountForm();
        createAccount.isCreateAccountButtonPresent();
        createAccount.clickCreateAccountButton();

        // Step 3) Assert Username UNQ Exception
        WebElement usernameTakenText = selenium.findElement(By.id("dialogContent_131"));
        assertTrue(usernameTakenText != null);
        System.out.println("Student Account Creation Duplication Exception");
    }



}
