package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Purpose: To manage a browser and simulate actions a browser can do
 *
 * @author  Ricardo Montes
 * @version 1.7
 * @since   2017-11-09
 */
public class Browser {


    public static Enviroment testEnviroment = Enviroment.QA;
    private static String baseUrl = "http://" + testEnviroment + "." + "studenttrac.com";
    private static WebDriver seleniumWebDriver = new ChromeDriver();

    /**
     * Used to Initialize browser
     */
    public static void initialize(){
        goTo("");
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


