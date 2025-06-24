package org.example;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class Main {
    public static void getFromAPI(String url, HttpClient client){
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response ->\n" + response.body());
        } catch (IOException e) {
            System.out.println("Runtime");
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        // Base URL
        String baseURL = "http://localhost:8080/api";
        HttpClient client = HttpClient.newBuilder().build();

        String modifiedURL = baseURL + "/airports/by-city";

        getFromAPI(modifiedURL, client);
    }
}