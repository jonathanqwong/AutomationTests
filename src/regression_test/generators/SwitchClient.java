package generators;

import io.restassured.response.Response;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static objects.Browser.DOMAIN;
import static objects.Browser.ENV;

public class SwitchClient {

    public void switchClientId(String clientid){

        TokenGenerator token = new TokenGenerator();
        token.getTokens();

        Map<String,String> authentication = new HashMap();
        authentication.put("ClientId", clientid);
        authentication.put("LanguageCode", "EN");
        authentication.put("RoleId", "1");

        Response response =
                given()
                        .header("AuthenticationToken",token.AuthenticationToken).header("SessionToken",token.SessionToken)
                        .contentType("application/json")
                        .body(authentication)
                        .log().all()
                .when()
                        .put("http://" + ENV + "-authentication-srv."+ DOMAIN +".com/token/" + token.AuthenticationToken)
                .then()
                        .assertThat().statusCode(204)
                .extract()
                        .response();

        String result = response.asString();
        System.out.println("Request Body:" + authentication);
        System.out.println("Response Body:" + result);
    }


}
