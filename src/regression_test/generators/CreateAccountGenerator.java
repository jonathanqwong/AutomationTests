package generators;

import io.restassured.response.Response;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class CreateAccountGenerator {

    public static final String TIME_STAMP = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    public static final String TEMP_EMAIL = "";
    public static String username = "Sel_Test_" + TIME_STAMP;
    public static String password = "edi";

    public void createAccountGenerator(){
        Map<String,String> person = new HashMap();
        person.put("Username",  username);
        person.put("Password", password);
        person.put("FirstName", "Selenium");
        person.put("LastName", "Test_" + TIME_STAMP);
        person.put("Email", "lodiguvac@ether123.net");
        person.put("Phone", "(333)333-3333");
        person.put("DateOfBirth", "10/10/1999");
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
}
