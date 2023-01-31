package airlines;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import payloads.AirlinesPayloads;
import utils.RequestUtil;

import java.util.HashMap;

public class AirlineTests {

    @Test
    public void createAirline(){
        String endPoint = "https://api.instantwebtools.net/v1/airlines";
        String payload = AirlinesPayloads.getCreateAirlinePayloadStringFormat("45577747", "AirIndia", "India", "AI",
                "Fly High", "Hyderabad", "https://www.google.com", "1898");

        Response response = RequestUtil.postRequest(endPoint, payload, new HashMap<>());
        Assert.assertEquals(200, response.statusCode());

    }
}
