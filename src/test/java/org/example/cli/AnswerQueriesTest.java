package org.example.cli;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnswerQueriesTest {

    private HttpClientHelper mockClient;
    private AnswerQueries queries;

    @BeforeEach
    public void setUp() {
        mockClient = mock(HttpClientHelper.class);
        queries = new AnswerQueries(mockClient);
    }

    @Test
    public void testGetAirportsByCity() {
        when(mockClient.get("http://localhost:8080/api/airports/by-city"))
                .thenReturn("[\"Toronto: Pearson Intl\"]");
        String result = queries.getAirportsByCity();
        assertTrue(result.contains("Toronto"));
    }

    @Test
    public void testGetAircraftByPassenger() {
        when(mockClient.get("http://localhost:8080/api/aircrafts/by-passenger"))
                .thenReturn("[\"Scarlett Budgell: Boeing 737\"]");
        String result = queries.getAircraftByPassenger();
        assertTrue(result.contains("Scarlett Budgell"));
    }

    @Test
    public void testGetAirportsByAircraft() {
        when(mockClient.get("http://localhost:8080/api/airports/by-aircraft"))
                .thenReturn("[\"Boeing 737: Toronto\"]");
        String result = queries.getAirportsByAircraft();
        assertTrue(result.contains("Boeing 737"));
    }

    @Test
    public void testGetAirportsByPassenger() {
        when(mockClient.get("http://localhost:8080/api/airports/by-passenger"))
                .thenReturn("[\"Scarlett Budgell: YYZ\"]");
        String result = queries.getAirportsByPassenger();
        assertTrue(result.contains("YYZ"));
    }
}
