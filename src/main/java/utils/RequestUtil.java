package utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class RequestUtil {

    public static Response postRequest(String endPoint, String payload, Map<String, String> headers){

        return RestAssured.given()
                .baseUri(endPoint)
                .headers(headers)
                .contentType(ContentType.JSON)
                .body(payload)
                .post().then().log().all().extract().response();

    }
}
