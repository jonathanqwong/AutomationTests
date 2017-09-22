package com.studenttrac.qa.tests;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.studenttrac.qa.webpages.accountCreationPage;
import com.studenttrac.qa.webpages.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import static org.junit.Assert.*;
import org.junit.*;


public class registration {
    WebDriver selenium;

    private void loadCreateAccountPage() {
        selenium.get("https://qa.studenttrac.com/#/registration/create/21");
    }

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "browser//chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        selenium = new ChromeDriver();
        loadCreateAccountPage();
        selenium.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {
        selenium.quit();
    }

    @Test
    public void startRegistration() {

        // Step 1) Go to the login page and click create account
        loginPage login = new loginPage(selenium);
        login.clickCreateAccountButton();

        // Step 2) Create an account
        accountCreationPage createAccount = new accountCreationPage(selenium);
        createAccount.fillOutCreateAccountForm();
        createAccount.isCreateAccountButtonPresent();
        createAccount.clickCreateAccountButton();

        // Step 3) Validate the account is created
        WebElement getStartedText = selenium.findElement(By.className("getStarted"));
        assertTrue(getStartedText != null);
        System.out.println("Student Account Creation Confirmed");
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

        WebElement usernameTakenText = selenium.findElement(By.id("dialogContent_131"));
        assertTrue(usernameTakenText != null);
        System.out.println("Student Account Creation Duplication Exception");
    }



}
