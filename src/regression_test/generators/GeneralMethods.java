package generators;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//    This Class was made for general variables, methods, or generators for preconditions
//    1) Constant to specify environment
//    2) Constructor
//    3) Scrolling
//    4) Error Dialog Assertion
//    5) Toast Assertion

//    TO-DO
//    create test account using API
//    implicit and explicit waits (conditions, elements)
//

public class GeneralMethods {
    WebDriver selenium;

    public static final String ENV = "stage";

    @FindBy(how = How.CLASS_NAME, using = "md-list-item-text")
    WebElement error_Dialog;
    @FindBy(how = How.CLASS_NAME, using = "md-toast-content")
    WebElement toast;

    // Constructor
    public GeneralMethods(WebDriver selenium) {
        this.selenium = selenium;
        PageFactory.initElements(selenium, this);
        selenium.getPageSource();
    }

    public void scrollDownToElement() {
        JavascriptExecutor jse = (JavascriptExecutor) selenium;
        jse.executeScript("window.scrollBy(0,600)", "");
    }

    public void assertErrorDialogMessage(String expected_message) {
        String errorDialog = error_Dialog.getText();
        System.out.println(errorDialog);
        Assert.assertEquals(expected_message, errorDialog);
    }

    public void assertToastMessage(String expected_message) {
        String toastContent = toast.getText();
        System.out.println(toastContent);
        Assert.assertEquals(expected_message, toastContent);
    }

    public void assertPageTitle(String expected_title) {
        String titleContent = selenium.getTitle();
        System.out.println(titleContent);
        Assert.assertEquals(expected_title, titleContent);
    }
}
