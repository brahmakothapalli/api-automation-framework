package payloads;

import java.util.HashMap;
import java.util.Map;

public class AirlinesPayloads {

    public static String getCreateAirlinePayloadStringFormat(String id, String airline, String country, String logo,
                                               String slogan, String headQuarters, String website, String year){

        String payload = "{\n" +
                "    \"id\": " + id + ",\n" +
                "    \"name\": \"" + airline + "\",\n" +
                "    \"country\": \"" + country + "\",\n" +
                "    \"logo\": \"" + logo + "\",\n" +
                "    \"slogan\": \"" + slogan + "\",\n" +
                "    \"head_quaters\": \"" + headQuarters + "\",\n" +
                "    \"website\": \"" + website + "\",\n" +
                "    \"established\": \"" + year + "\"\n" +
                "}";
        return payload;
    }

    public static Map<String, Object> getCreateAirlinePayloadMapFormat(String id, String airline, String country, String logo,
                                                                       String slogan, String headQuarters, String website, String year){

        Map<String, Object> payload = new HashMap<>();
        payload.put("id", id);
        payload.put("name", airline);
        payload.put("country", country);
        payload.put("logo", logo);
        payload.put("slogan", slogan);
        payload.put("website", website);
        payload.put("head_quaters", headQuarters);
        payload.put("established", year);
        return payload;
    }
}
