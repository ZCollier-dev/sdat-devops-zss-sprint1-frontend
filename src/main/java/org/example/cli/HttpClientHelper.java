package org.example.cli;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientHelper {

    public static void sendGet(String url) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response (" + response.statusCode() + "):");
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            System.err.println("Error during GET request to: " + url);
            e.printStackTrace();
        }

        System.out.println(); // line break for clarity
    }
}
