package org.example;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        // String modifiedURL = baseURL + "/airports/by-city";

        while (true) {
            System.out.println("*** Flight Management System Menu ***");
            System.out.println("    Please choose an option:");
            System.out.println(" 0. Exit program");
            System.out.println(" 1. View airports in each city");
            System.out.println(" 2. View which aircraft a passenger has flown on");
            System.out.println(" 3. View airports that aircraft take off/land at");
            System.out.println(" 4. View what airports passengers have used");
            System.out.println("    Please enter your choice:");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {
                    String url = baseURL + "/airports/by-city";
                    getFromAPI(url, client);
                }
                case "2" -> {
                    System.out.println("Please enter passenger ID: ");
                    Long passengerId = Long.parseLong(scanner.nextLine());
                    String url = baseURL + "/passengers/" + passengerId + "/aircraft";
                    getFromAPI(url, client);
                }
                case "3" -> {
                    String url = baseURL + "/aircraft/routes";
                    getFromAPI(url, client);
                }
                case "4" -> {
                    String url = baseURL + "/passengers/airports";
                    getFromAPI(url, client);
                }
                case "0" -> {
                    System.out.println("Thank you for using the flight management system. Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please choose options available on menu.");
            }
        }

        // getFromAPI(modifiedURL, client);
    }
}