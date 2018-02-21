package generators;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static objects.Browser.DOMAIN;
import static objects.Browser.ENV;

public class CreateAccountGenerator {

    public static String GeneratedPersonId;
    public static final String TIME_STAMP = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    public static final String TEMP_EMAIL = "lodiguvac@ether123.net";
    public static final String TEMP_PHONE = "(333)333-3333";
    public static String username = "Sel_Test_" + TIME_STAMP;
    public static String password = "edi";

    public void createAccountGenerator(){
        Map<String,String> person = new HashMap();
        person.put("Username",  username);
        person.put("Password", password);
        person.put("FirstName", "Selenium");
        person.put("LastName", "Test_" + TIME_STAMP);
        person.put("Email", TEMP_EMAIL);
        person.put("Phone", TEMP_PHONE);
        person.put("DateOfBirth", "10/10/1999");
        person.put("RoleId", "2");
        person.put("ClientId", "21");

        Response response =
                given()
                        .contentType("application/json")
                        .body(person)
                .when()
                        .post("http://" + ENV + "-authentication-srv." + DOMAIN + ".com/account")
                .then()
                        .assertThat().statusCode(200)
                .extract()
                        .response();

        String result = response.asString();
        System.out.println("Response Body:" + result);
        JsonPath jsonPath = new JsonPath(result);
        this.GeneratedPersonId = jsonPath.getString("PersonId");
    }

    public void createCustomAccountGenerator(String username, String password, String firstName, String lastName, String email, String phone, String dob, String roleId, String clientId){
        Map<String,String> person = new HashMap();
        person.put("Username",  username);
        person.put("Password", password);
        person.put("FirstName", firstName);
        person.put("LastName", lastName);
        person.put("Email", email);
        person.put("Phone", phone);
        person.put("DateOfBirth", dob);
        person.put("RoleId", roleId);
        person.put("ClientId", clientId);

        Response response =
                given()
                        .contentType("application/json")
                        .body(person)
                        .log().all()
                .when()
                        .post("http://" + ENV + "-authentication-srv.edudyn.com/account")
                .then()
                        .assertThat().statusCode(200)
                .extract()
                        .response();

        String result = response.asString();
        System.out.println("Response Body:" + result + "\n");
        JsonPath jsonPath = new JsonPath(result);
        this.GeneratedPersonId = jsonPath.getString("PersonId");
    }

}
