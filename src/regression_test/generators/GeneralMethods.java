package generators;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class GeneralMethods {
    WebDriver selenium;

//     This Class was made for general variables, methods, or generators for preconditions
//     1) Constant to specify environment
//     2) Scrolling

//    TO-DO
//    create test account using API
//    implicit and explicit waits (conditions, elements)
//    use assertions

    public static final String ENV = "stage";

    public void scrollDownToElement() {
        JavascriptExecutor jse = (JavascriptExecutor) selenium;
        jse.executeScript("window.scrollBy(0,600)", "");
        // For some reason, unable to instantiate in other classes.
    }

}
