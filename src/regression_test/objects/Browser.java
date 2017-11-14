package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * Purpose: To manage a browser and simulate actions a browser can do
 *
 * @author  Ricardo Montes
 * @version 1.7
 * @since   2017-11-09
 */
public final class Browser {

    public static Enviroment testEnviroment = Enviroment.QA;
    private static String baseUrl = "http://" + testEnviroment + "." + "studenttrac.com";
    private static WebDriver seleniumWebDriver;

    /**
     * Used to Initialize browser
     */
    public static void initialize(){
        setBrowserOptions();
        goTo("");
    }

    /**
     * Set options for Webdriver
     */
    private static void setBrowserOptions(){
        System.setProperty("webdriver.chrome.driver", "browser//chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        seleniumWebDriver = new ChromeDriver(chromeOptions);
        seleniumWebDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    /**
     *  Web Driver navigates to url within baseUrl
     *
     * @param url  the url you want to visit
     */
    public static void goTo( String url ){
        seleniumWebDriver.get( baseUrl + url );
    }

    /**
     * Gets title of page
     * @return return title string
     */
    public static String Title(){
        return seleniumWebDriver.getTitle();
    }

    /**
     * Used to get reference to Browsers WebDriver.
     *
     * @return Browser's WebDriver
     */
    public static WebDriver getDriver(){
        return seleniumWebDriver;
    }

    /**
     *  Close browser
     */
    public static void close(){
        seleniumWebDriver.close();
    }

    /**
     * Used to Represent Testing Environment Options
     */
    public enum Enviroment {
        DEV,
        QA,
        STAGE,
        DEMO
    }

}


