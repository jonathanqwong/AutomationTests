package com.studenttrac.qa.tests;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.studenttrac.qa.webpages.accountCreationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import static org.junit.Assert.*;
import org.junit.*;


public class registration {
    WebDriver selenium;
    static String time_Stamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

    private void loadCreateAccountPage() {
        selenium.get("https://qa.studenttrac.com/#/registration/create/21");
    }

    private void fillOutCreateAccoutnForm() {
        selenium.findElement(By.id("input_3")).sendKeys("Selenium");
        selenium.findElement(By.id("input_5")).sendKeys("Test_" + time_Stamp.toString());
        selenium.findElement(By.id("input_6")).sendKeys("cufomuhe@kekita.com");
        selenium.findElement(By.id("input_7")).sendKeys("(333)333-3333");
        selenium.findElement(By.id("input_8")).sendKeys("10/10/2010");
        selenium.findElement(By.id("input_9")).sendKeys("Sel_Test_" + time_Stamp.toString());
        selenium.findElement(By.id("input_10")).sendKeys("edi");
        selenium.findElement(By.id("input_11")).sendKeys("edi");
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
    public void createAccount() {
        accountCreationPage accountCreate = new accountCreationPage(selenium);
        assertTrue(accountCreate.isCreateAccountButtonPresent("createAccount"));
        fillOutCreateAccoutnForm();
        accountCreate.clickButton("createAccount");

        WebElement getStartedText = selenium.findElement(By.className("getStarted"));
        assertTrue(getStartedText != null);
        System.out.println("Student Account Creation Confirmed");
    }

    @Test
    public void createAccountDuplicateException() throws Exception {
        accountCreationPage accountCreate = new accountCreationPage(selenium);
        assertTrue(accountCreate.isCreateAccountButtonPresent("createAccount"));
        fillOutCreateAccoutnForm();
        accountCreate.clickButton("createAccount");

        WebElement usernameTakenText = selenium.findElement(By.id("dialogContent_131"));
        assertTrue(usernameTakenText != null);
        System.out.println("Student Account Creation Duplication Exception");
    }



}
