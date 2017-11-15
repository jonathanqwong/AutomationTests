package generators;

import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import java.text.SimpleDateFormat;
import java.util.*;
import static io.restassured.RestAssured.given;

/**
    This Class was made for general variables, methods, or generators for preconditions
    1) Constant to specify environment
    2) Constant to create username
    3) Constant to specify temporary email address
    4) Constructor
    5) Scrolling
    6) Error Dialog Assertion
    7) Toast Assertion
    8) Nav Bar Title Assertion
    9) Nav Bar Title Assertion

    // TO-DO
    // implicit and explicit waits (conditions, elements)

    API Calls will be separated into comment sections for the service that it is in (we can reorganize this if it gets huge)
    Authentication Service,Authorization Service, Address Service, Calendar Service, Client Service, Application Service, DigitalFile Service, Assessment Service, Curriculum Service, Person Service
**/

public class GeneralMethods {
    WebDriver selenium;
    public static final String ENV = "stage";
    public static final String TIME_STAMP = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    public static final String TEMP_EMAIL = "";
    public static String username = "Sel_Test_" + TIME_STAMP;
    public static String password = "edi";

    @FindBy(how = How.CLASS_NAME, using = "md-list-item-text")
    WebElement error_Dialog;
    @FindBy(how = How.CLASS_NAME, using = "md-toast-content")
    WebElement toast;
    @FindBy(how = How.CLASS_NAME, using = "appTitle")
    WebElement title;
    @FindBy(how = How.CLASS_NAME, using = "md-input-message-animation")
    WebElement redUnderlineError;

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
        System.out.println("Assert Error is: " + errorDialog);
        Assert.assertEquals(expected_message, errorDialog);
    }

    public void assertToastMessage(String expected_message) {
        String toastContent = toast.getText();
        System.out.println("Assert Toast is: " + toastContent);
        Assert.assertEquals(expected_message, toastContent);
    }

    public void assertNavBarTitle (String expected_title) {
        String titleContent = title.getText();
        System.out.println("Assert Title is: " + titleContent);
        Assert.assertEquals(expected_title, titleContent);
    }

    public void assertRedUnderlineErrorMessage (String expected_title) {
        String inputError = redUnderlineError.getText();
        System.out.println("Assert Red Underline Error is: " + inputError);
        Assert.assertEquals(expected_title, inputError);
    }

    /** ======================= Authentication Service ======================= **/
    public void createAccountGenerator(){
        Map<String,String> person = new HashMap();
        person.put("Username",  username);
        person.put("Password", password);
        person.put("FirstName", "Selenium");
        person.put("LastName", TIME_STAMP);
        person.put("Email", "lodiguvac@ether123.net");
        person.put("Phone", "(333)333-3333");
        person.put("DateOfBirth", "10/11/1999");
        person.put("RoleId", "2");
        person.put("ClientId", "21");

        Response response =
                given()
                        .contentType("application/json")
                        .body(person)
                .when()
                        .post("http://stage-authentication-srv.edudyn.com/account")
                .then()
                        .assertThat().statusCode(200)
                .extract()
                        .response();

        String result = response.asString();
        System.out.println("Request Body:" + person);
        System.out.println("Response Body:" + result);
    }

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
