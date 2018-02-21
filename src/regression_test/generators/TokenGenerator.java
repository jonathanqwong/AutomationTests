package generators;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static objects.Browser.DOMAIN;
import static objects.Browser.ENV;

public class TokenGenerator {
    public String AuthenticationToken;
    public String SessionToken;

    public void getTokens (){
        Map<String,String> Authenticate = new HashMap();
        Authenticate.put("Username", "Jonathan");
        Authenticate.put("Password", "edi");

        Response response =
                given()
                        .header("AuthenticationToken", "beefbeef-beef-beef-beef-beefbeefbeef").header("SessionToken", "beefbeef-beef-beef-beef-beefbeefbeef")
                        .contentType("application/json")
                        .body(Authenticate)
                .when()
                        .put("http://" + ENV + "-authentication-srv."+ DOMAIN +".com/authentication/v2/authentication")
                .then()
                        .assertThat().statusCode(200)
                .extract()
                        .response();

        String result = response.asString();
        JsonPath jsonPath = new JsonPath(result);
        this.AuthenticationToken = jsonPath.getString("AuthenticationToken");
        this.SessionToken = jsonPath.getString("SessionToken");
    }

}
