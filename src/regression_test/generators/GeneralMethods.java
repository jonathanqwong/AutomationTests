package generators;

import objects.Browser;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

/**
 * Purpose - Made for general variables, methods, or generators for preconditions
 * Overview:
 * 1) Error Dialog Assertion
 * 2) Toast Assertion
 * 3) Nav Bar Title Assertion
 * 4) RedLine Error Assertion

 // TO-DO
 // implicit and explicit waits (conditions, elements)
**/

public class GeneralMethods {

    @FindBy(how = How.CLASS_NAME, using = "md-list-item-text")
    WebElement error_Dialog;
    @FindBy(how = How.CLASS_NAME, using = "md-toast-content")
    WebElement toast;
    @FindBy(how = How.CLASS_NAME, using = "logo-and-name")
    WebElement title;
    @FindBy(how = How.CLASS_NAME, using = "md-input-message-animation")
    WebElement redUnderlineError;

    public void assertErrorDialogMessage(String expected_message) {
        Browser.waitForElement( By.className("md-list-item-text"));
        String errorDialog = error_Dialog.getText();
        System.out.println("Assert Error is: " + errorDialog);
        Assert.assertEquals(expected_message, errorDialog);
    }

    public void assertToastMessage(String expected_message) {
        Browser.waitForElement( By.className("md-toast-content"));
        String toastContent = toast.getText();
        System.out.println("Assert Toast is: " + toastContent);
        Assert.assertEquals(expected_message, toastContent);
    }

    public void assertNavBarTitle (String expected_title) {
        Browser.waitForElement( By.className("logo-and-name"));
        String titleContent = title.getText();
        System.out.println("Assert Title is: " + titleContent);
        Assert.assertEquals(expected_title, titleContent);
    }

    public void assertRedUnderlineErrorMessage (String expected_title) {
        Browser.waitForElement( By.className("md-input-message-animation"));
        String inputError = redUnderlineError.getText();
        System.out.println("Assert Red Underline Error is: " + inputError);
        Assert.assertEquals(expected_title, inputError);
    }

    /**
     * API Calls will be separated into comment sections for the service that it is in (we can reorganize this if it gets huge)
     **/

    /** ======================= Authentication Service ======================= **/
    /** ======================= Authorization Service  ======================= **/
    /** ======================= Address Service        ======================= **/
    /** ======================= Calendar Service       ======================= **/
    /** ======================= Client Service         ======================= **/
    /** ======================= Application Service    ======================= **/
    /** ======================= DigitalFile Service    ======================= **/
    /** ======================= Assessment Service     ======================= **/
    /** ======================= Curriculum Service     ======================= **/
    /** ======================= Person Service         ======================= **/
}
