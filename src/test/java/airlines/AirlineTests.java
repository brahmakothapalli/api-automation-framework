package airlines;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Utilities;

import java.util.HashMap;

public class AirlineTests {

    @Test
    public void createAirline(){

        String endPoint = "https://api.instantwebtools.net/v1/airlines";
        String payload = "{\n" +
                "    \"id\": 12564878,\n" +
                "    \"name\": \"Sri Lankan Airways\",\n" +
                "    \"country\": \"Sri Lanka\",\n" +
                "    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\n" +
                "    \"slogan\": \"From Sri Lanka\",\n" +
                "    \"head_quaters\": \"Katunayake, Sri Lanka\",\n" +
                "    \"website\": \"www.srilankaairways.com\",\n" +
                "    \"established\": \"1990\"\n" +
                "}";

        Response response = Utilities.postRequest(endPoint, payload, new HashMap<>());
        Assert.assertEquals(200, response.statusCode());

    }
}
