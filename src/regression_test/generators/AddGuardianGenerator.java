package generators;

import io.restassured.response.Response;
import java.util.HashMap;
import java.util.Map;
import static generators.CreateAccountGenerator.TEMP_EMAIL;
import static generators.CreateAccountGenerator.TEMP_PHONE;
import static generators.CreateAccountGenerator.TIME_STAMP;
import static io.restassured.RestAssured.given;
import static objects.Browser.DOMAIN;
import static objects.Browser.ENV;

public class AddGuardianGenerator {

    public void addGuardianToGeneratedStudent() {

        TokenGenerator token = new TokenGenerator();
        token.getTokens();
        CreateAccountGenerator account = new CreateAccountGenerator();

        Map<String,String> guardian = new HashMap();
        guardian.put("FirstName", "Dad");
        guardian.put("LastName", "Test_" + TIME_STAMP);
        guardian.put("Email", TEMP_EMAIL);
        guardian.put("PhoneNumber", TEMP_PHONE);
        guardian.put("DateOfBirth", "10/10/1970");
        guardian.put("RelationshipId", "21");
        guardian.put("IsPrimary", "true");
        guardian.put("IsEmergency", "true");

        Response response =
                given()
                        .header("AuthenticationToken",token.AuthenticationToken).header("SessionToken",token.SessionToken)
                        .contentType("application/json")
                        .body(guardian)
                        .log().all()
                .when()
                        .post("http://" + ENV + "-person-srv." + DOMAIN + ".com/student/" + account.GeneratedPersonId + "/guardian")
                .then()
                        .assertThat().statusCode(200)
                .extract()
                        .response();

        String result = response.asString();
        System.out.println("Response Body:" + result);
    }
}
