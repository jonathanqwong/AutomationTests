package generators;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static objects.Browser.DOMAIN;
import static objects.Browser.ENV;

/**
 * PreferenceId
 * 1  - Last Application
 * 2  - Application Order
 * 3  - Password Characters
 * 4  - Cannot Contain Username
 * 5  - Password Length
 * 6  - Password Historical Length
 * 7  - Days Password Expires
 * 8  - Max Failed Attempts
 * 9  - Max Change Password
 * 10 - Max Password Resets
 * 11 - Failed Lockout Time
 * 12 - Time Reset Token Expires
 * 13 - Time Between Logins
 * 14 - Reset Password Template
 * 15 - Account Deleted Template
 * 16 - Account Expired Template
 * 17 - Account Locked Template
 * 19 - Forgot Username Template
 * 20 - Student Account Creation Email Template
 * 21 - Guardian Account Creation Email Template
 * 22 - Person to Person Association Email Template (Account Found)
 * 23 - Person to Person Association Email Template (No Account)
 * 24 - Show Assessment Date on Print-out
 * 25 - Display Enrollment Teacher
 * 26 - Finalized Form Congratulation Email Template
 * 27 - Use Enrollment FormSet
 * 28 - Use SSN/A Number
 * 29 - Default GuideId
 * 30 - Finalized Form Congratulation Text
 * 31 - Student Guide Identifier
 * 32 - Use Extracurricular Activities
 * 33 - Use Support Programs
 * 34 - Use Graduation Check List
 * 35 - Use ADA Workdays
 * 36 - Use Course Contracts
 * 37 - Assigned Monthly Unit Limit
 * 38 - Extra Eligible Monthly Unit Limit
 * 39 - Completed Monthly Unit Limit
 * 40 - Student Monthly Unit Limit
 * 41 - Student Monthly Unit Reset Date
 * 42 - Auto Calculate GradeLevel
 * 43 - Default Password
 * 44 - Auto Calculate Grade Level
 * 45 - Use Instructional Minutes
 * 46 - Drop Leave Code
 * 47 - Continue Leave Code
 * 48 - Student Info Selected View [card, grid]
 * 49 - Student Info Display Name Order [First, Last]
 * 50 - Use Groups
 * 51 - Use Programs
 * 52 - Use Classes
 */

public class OverridePreferenceGenerator {

    public void overrideClientPref(int clientid, int preferenceid, String overrideValue){

        TokenGenerator token = new TokenGenerator();
        token.getTokens();
        String JSON = "{" + "OverrideValues: [" + overrideValue + "]}";

        Response response =
                given()
                        .header("AuthenticationToken",token.AuthenticationToken).header("SessionToken", token.SessionToken)
                        .contentType("application/json")
                        .body(JSON)
                        .log().all()
                .when()
                        .put("http://" + ENV + "-client-srv."+ DOMAIN +".com/client/" + clientid + "/preference/" + preferenceid)
                .then()
                        .assertThat().statusCode(204)
                .extract()
                        .response();

    }

    public void overridePersonPrefer(int personid, int preferenceid, String overrideValue){

        TokenGenerator token = new TokenGenerator();
        token.getTokens();
        String JSON = "{" +
                "\n\"PersonId\":\""     + personid      + "\"," +
                "\n\"PreferenceId\":\"" + preferenceid  + "\"," +
                "\n\"Values\":[\""      + overrideValue + "\"]" +
                "}";

        Response response =
                given()
                        .header("AuthenticationToken",token.AuthenticationToken).header("SessionToken", token.SessionToken)
                        .contentType("application/json")
                        .body(JSON)
                        .log().all()
                .when()
                        .put("http://" + ENV + "-person-srv.edudyn.com/person/" + personid + "/preference/" + preferenceid)
                .then()
                        .assertThat().statusCode(200)
                .extract()
                        .response();

    }

}


