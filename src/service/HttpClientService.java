package service;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.JsonAdapter;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;

public class HttpClientService {

    private final HttpClient client;

    public HttpClientService() {
        this.client = HttpClient.newHttpClient();
    }

    public String sendGetRequest(String url) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public String getExchangeRate() throws Exception {
        String apiKey = System.getenv("EXCHANGE_API_KEY");
        if (apiKey == null) {
            throw new RuntimeException("API key not found");
        }
        String url_str = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD";
        String response = sendGetRequest(url_str);

        System.out.println("API Response: " + response);

        JsonElement root = JsonParser.parseString(response);
        JsonObject jsonObject = root.getAsJsonObject();
        try {
            return jsonObject.get("result").getAsString();
        } catch (Exception e) {
            System.err.println("Error parsing JSON response: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}