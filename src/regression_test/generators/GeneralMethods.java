package generators;

import objects.Browser;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

/**
 * Purpose - Made for general variables and methods
 * Overview:
 * 1) Error Dialog Assertion
 * 2) Toast Assertion
 * 3) Nav Bar Title Assertion
 * 4) RedLine Error Assertion
 * 5) Choose Select Option by Title
 * 6) Choose md-select /md-option by Title
**/

public class GeneralMethods {

    public static WebDriver selenium;
    public static int maxWaitTime = 30;
    public static int pollingTime = 5;
    private static FluentWait wait;


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

    public void selectOptionInDropDown (WebElement select_element, String select_visible_text) {
        // DOES NOT WORK FOR ANGULAR md-select-menu
        Select dropdown = new Select(select_element);
        dropdown.selectByVisibleText(select_visible_text);
    }

    public void selectOptionInMdSelect (WebElement mdSelectId, String textToSelect) {
        //Does Not Work
        Select contents = new Select(mdSelectId);
        contents.getFirstSelectedOption();
        contents.selectByVisibleText(textToSelect);

//        try {
//            final WebDriverWait wait = new WebDriverWait(selenium, 30);
//            wait.until(ExpectedConditions.visibilityOf(mdSelectId));
//            mdSelectId.click();
//            //Thread.sleep(1000);
//
//            final WebElement options = mdContent;
//            wait.until(ExpectedConditions.visibilityOf(options));
//            WebElement select = seleniummdSelectId;
//            wait.until(ExpectedConditions.visibilityOfAllElements(optionsToSelect));
//
//            List<WebElement> options = contents.findElements(By.className("md-option"));
//            System.out.println(options);
//
//            for (WebElement option : options) {
//                if (option.getText().equals(textToSelect)) {
//                    System.out.print("Trying to select text: " + textToSelect);
//                    option.click();
//                    break;
//                }
//            }
//        } catch (final Exception e) {
//            System.out.println("Can't work with auto complete");
//        }
    }

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
