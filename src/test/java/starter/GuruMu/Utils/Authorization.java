package starter.GuruMu.Utils;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import starter.GuruMu.LoginAPI;

import java.io.Console;
import java.io.File;

public class Authorization {
    public static String EXPIRED_TOKEN = "";

    public String getToken(){
        File jsonRequest = new File(Constant.JSON_REQUEST + "/Login/LoginValid.json");
        Response response = SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(jsonRequest)
                .post(LoginAPI.POST_LOGIN);

        // https://www.toolsqa.com/rest-assured/read-json-response-body-using-rest-assured/
        // First get the JsonPath object instance from the Response interface
        JsonPath jsonPathEvaluator = response.jsonPath();

        // Then simply query the JsonPath object to get a String value of the node
        String token = jsonPathEvaluator.get(Constant.DATA_TOKEN);
        return token;
    }

    public String getTokenGuru(){
        File jsonRequest = new File(Constant.JSON_REQUEST + "/Login/LoginValidGuru.json");
        Response response = SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(jsonRequest)
                .post(LoginAPI.POST_LOGIN);

        // https://www.toolsqa.com/rest-assured/read-json-response-body-using-rest-assured/
        // First get the JsonPath object instance from the Response interface
        JsonPath jsonPathEvaluator = response.jsonPath();

        // Then simply query the JsonPath object to get a String value of the node
        String token = jsonPathEvaluator.get(Constant.DATA_TOKEN);
        return token;
    }

    public String getTokenMurid(){
        File jsonRequest = new File(Constant.JSON_REQUEST + "/Login/LoginValidMurid.json");
        Response response = SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(jsonRequest)
                .post(LoginAPI.POST_LOGIN);

        // https://www.toolsqa.com/rest-assured/read-json-response-body-using-rest-assured/
        // First get the JsonPath object instance from the Response interface
        JsonPath jsonPathEvaluator = response.jsonPath();

        // Then simply query the JsonPath object to get a String value of the node
        String token = jsonPathEvaluator.get(Constant.DATA_TOKEN);
        return token;
    }
}
