package org.example.cli;

public class AnswerQueries {

    private static final String BASE_URL = "http://localhost:8080/api";

    public void getAirportsByCity() {
        String url = BASE_URL + "/airports/by-city";
        System.out.println("Airports by City:");
        HttpClientHelper.sendGet(url);
    }

    public void getAircraftByPassenger() {
        String url = BASE_URL + "/aircrafts/by-passenger";
        System.out.println("Aircraft by Passenger:");
        HttpClientHelper.sendGet(url);
    }

    public void getAirportsByAircraft() {
        String url = BASE_URL + "/airports/by-aircraft";
        System.out.println("Airports by Aircraft:");
        HttpClientHelper.sendGet(url);
    }

    public void getAirportsByPassenger() {
        String url = BASE_URL + "/airports/by-passenger";
        System.out.println("Airports by Passenger:");
        HttpClientHelper.sendGet(url);
    }
}
