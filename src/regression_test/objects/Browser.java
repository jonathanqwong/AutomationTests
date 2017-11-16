package objects;

import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Purpose: To manage a browser and simulate actions a browser can do
 * @author  Ricardo Montes
 * @version 1.7
 * @since   2017-11-09
 */

public final class Browser {

    public static Environment ENV = Environment.STAGE;
    private static String baseUrl = "http://" + ENV + "." + "studenttrac.com/#";
    public static WebDriver selenium;
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
        Thread.sleep(1500);
        selenium.get( baseUrl + url );
        System.out.println(baseUrl + url);
    }

    /**
     * Gets title of page
     * @return return title string
     */
    public static String Title(){ return selenium.getTitle(); }

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
     * Used to Represent Testing Environment Options
     */
    public enum Environment {
        DEV,
        QA,
        STAGE,
        DEMO
    }

    /**
     *  Scroll function is related to a browser actions - scroll a height of 600px
     */
    public static void scrollDownToElement() {
        JavascriptExecutor jse = (JavascriptExecutor) selenium;
        jse.executeScript("window.scrollBy(0,600)", "");
    }

    /**
     * GET URL of dynamic pages you might not know i.e. reg forms
     */
    public static void getURL() throws Exception {
        String url = selenium.getCurrentUrl();
        // Added a temporary sleep so browser loads.
        Thread.sleep(2000);
        selenium.get(url);
        Thread.sleep(4000);
        System.out.println(url);
    }

    /**
     * Fluent Wait - Each FluentWait instance defines the maximum amount of time to wait for a condition,
     * as well as the frequency with which to check the condition. Furthermore,
     * the user may configure the wait to ignore specific types of exceptions whilst waiting,
     * such as NoSuchElementExceptions when searching for an element on the page.
     */
    public static void waitFor(String element) {

        Wait<WebDriver> wait = new FluentWait(selenium)
                .withTimeout(30, SECONDS)
                .pollingEvery(5, SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement elementToWaitFor = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id(""));
            }
        });
    }
}


