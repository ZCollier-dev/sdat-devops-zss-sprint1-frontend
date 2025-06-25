package org.example.cli;

public class AnswerQueries {

    private final HttpClientHelper client;

    public AnswerQueries(HttpClientHelper client) {
        this.client = client;
    }

    public String getAirportsByCity() {
        return client.get("http://localhost:8080/api/airports/by-city");
    }

    public String getAircraftByPassenger() {
        return client.get("http://localhost:8080/api/aircrafts/by-passenger");
    }

    public String getAirportsByAircraft() {
        return client.get("http://localhost:8080/api/airports/by-aircraft");
    }

    public String getAirportsByPassenger() {
        return client.get("http://localhost:8080/api/airports/by-passenger");
    }
}
