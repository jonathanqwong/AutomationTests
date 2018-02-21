package objects;

import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import static java.util.concurrent.TimeUnit.SECONDS;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Purpose: To manage a browser and simulate actions a browser can do
 */

public final class Browser {

    public static Environment ENV = Environment.QA;
    public static Domain DOMAIN = Domain.EDUDYN;
    private static String baseUrl = "https://" + ENV.toString().toLowerCase() + "." + "studenttrac.com/#";
    public static WebDriver selenium;
    public static int maxWaitTime = 30;
    public static int pollingTime = 5;
    private static FluentWait wait;

    /**
     * Used to Initialize browser
     */
    public static void initialize()throws Exception {
        setBrowserOptions();
        goTo("");
    }

    /**
     * Set options for Webdriver
     * 1) Find chrome driver exe file
     * 2) Instantiate web browser options
     * 3) Make web browser maximized window size
     * 4) Start web driver
     */
    private static void setBrowserOptions(){
        System.setProperty("webdriver.chrome.driver", "browser//chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        selenium = new ChromeDriver(chromeOptions);
        selenium.manage().timeouts().implicitlyWait(10, SECONDS);
    }

    /**
     *  Web Driver navigates to url within baseUrl
     *  @param url the url you want to visit
     */
    public static void goTo( String url ) throws Exception {
        // Added a temporary sleep so browser loads.
        Thread.sleep(3000);
        selenium.get( baseUrl + url );
        Thread.sleep(3000);
        System.out.println(baseUrl + url);
    }

    /**
     * Refresh Browser
     */
    public static void refreshPage() throws Exception {
        Thread.sleep(5000);
        selenium.navigate().refresh();
    }

    /**
     * GET URL of dynamic pages you might not know i.e. reg forms
     */
    public static void getURL() throws Exception {
        // Added a temporary sleep so browser loads.
        Thread.sleep(3000);
        String url = selenium.getCurrentUrl();
        selenium.get(url);
        Thread.sleep(3000);
        System.out.println(url);
    }

    /**
     * Gets base url page
     * @return return title string
     */
    public static String getBaseUrl(){
        return baseUrl;
    }

    /**
     * Used to get reference to Browsers WebDriver.
     * @return Browser's WebDriver
     */
    public static WebDriver getDriver(){ return selenium; }

    /**
     *  Close browser
     */
    public static void close(){
        selenium.close();
    }

    /**
     * Used to see if an element exist
     * @param locator used to find element
     * @return boolean
     */
    public static boolean exists( By locator ){
        System.out.println(selenium.findElements( locator ).size() != 0);
        return selenium.findElements( locator ).size() != 0;
    }

    /**
     * Used to Represent Testing Environment Options
     */
    public enum Environment {
        DEV,
        QA,
        STAGE,
        DEMO
    }

    /**
     * Used to Represent Testing Service Domain Names Options
     */
    public enum Domain {
        EDUDYN,
        STUDENTTRAC
    }

    /**
     *  Scroll function is related to a browser actions - scroll a height of 750
     */
    public static void scrollDownToElement() {
        JavascriptExecutor jse = (JavascriptExecutor) selenium;
        jse.executeScript("window.scrollBy(0,750)", "");
    }

    /**
     * Fluent Wait - Each FluentWait instance defines the maximum amount of time to wait for a condition,
     * as well as the frequency with which to check the condition. Furthermore,
     * the user may configure the wait to ignore specific types of exceptions whilst waiting,
     * such as NoSuchElementExceptions when searching for an element on the page.
     */
    public static void waitForElement( By locateElement ) {

        Wait<WebDriver> wait = new FluentWait(selenium)
                .withTimeout(maxWaitTime, SECONDS)
                .pollingEvery(pollingTime, SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement elementToWaitFor = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) { return driver.findElement(locateElement); }
        });
    }

    /**
     * Explciit Wait allows you to define to wait for a certain condition to occur before proceeding
     * @param locateElement
     */
    public static void waitUntilElementIsVisible( By locateElement ){
        WebDriverWait wait = new WebDriverWait(selenium, maxWaitTime);
        WebElement elementToWaitFor = wait.until(ExpectedConditions.visibilityOfElementLocated(locateElement));
    }

    /**
     * Will wait until the url matches desired url before proceeding
     */
    public static void waitUntilUrlMatches( String urlToBe ){
        new WebDriverWait(selenium, maxWaitTime).until(ExpectedConditions.urlMatches(urlToBe));
    }

    /**
     * Will wait until the url contains fragment string desired before proceeding
     */
    public static void waitUntilUrlContains( String urlFragment ){
        new WebDriverWait(selenium, maxWaitTime).until(ExpectedConditions.urlContains(urlFragment));
    }
}

