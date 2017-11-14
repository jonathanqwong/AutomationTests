package generators;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

//import static io.restassured.RestAssured.given;

//    This Class was made for general variables, methods, or generators for preconditions
//    1) Constant to specify environment
//    2) Constant to create username
//    3) Constructor
//    4) Scrolling
//    5) Error Dialog Assertion
//    6) Toast Assertion
//    7) Title Assertion
//    8) Create Account Generator

//    TO-DO
//    implicit and explicit waits (conditions, elements)

public class GeneralMethods {
    WebDriver selenium;
    public static final String ENV = "stage";
    public static final String TIME_STAMP = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    public static String username = "Sel_Test_" + TIME_STAMP;
    public static String password = "edi";

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

//        given()
//                .contentType("application/json")
//                .body(person)
//                .when().post("http://stage-authentication-srv.edudyn.com/account").then()
//                .statusCode(200);



//        // Instantiate HttpClient
//        HttpClient client = new DefaultHttpClient();
//
//        // Instantiate HttpPost with API URL
//        HttpPost post = new HttpPost("http://qa-authentication-srv.edudyn.com/account");
//
//        // Create Request Body
//        try {
//            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
//            nameValuePairs.add(new BasicNameValuePair("Username",   "Test99"));
//            nameValuePairs.add(new BasicNameValuePair("Password",   password));
//            nameValuePairs.add(new BasicNameValuePair("FirstName",  "Selenium"));
//            nameValuePairs.add(new BasicNameValuePair("LastName",          TIME_STAMP));
//            nameValuePairs.add(new BasicNameValuePair("Email",      "lodiguvac@ether123.net"));
//            nameValuePairs.add(new BasicNameValuePair("Phone",      "(333)333-3333"));
//            nameValuePairs.add(new BasicNameValuePair("DateOfBirth","10/11/1999"));
//            nameValuePairs.add(new BasicNameValuePair("RoleId",     "2"));
//            nameValuePairs.add(new BasicNameValuePair("ClientId",   "21"));
//
//            post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
//            HttpResponse response = client.execute(post);
//            BufferedReader rd = new BufferedReader(new InputStreamReader(
//                    response.getEntity().getContent()));
//
//            System.out.println(nameValuePairs);
//            System.out.println("Request Body:"  + nameValuePairs);
//            System.out.println("Response Body:" + response);
//
//
//
//            String line = "";
//            while ((line = rd.readLine()) != null) {
//                System.out.println(line);
//                if (line.startsWith("Auth=")) {
//                    String key = line.substring(5);
//                    // do something with the key
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
