package objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

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
        selenium.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /**
     *  Web Driver navigates to url within baseUrl
     *  @param url  the url you want to visit
     */
    public static void goTo( String url ) throws Exception {
        // Added a temporary sleep so browser loads.
        Thread.sleep(3000);
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
        System.out.println(url);
    }
}


