package org.example.Model;

public class Aircraft {
    private Long id;
    private String type;
    private String airlineName;
    private String numberOfPassengers;

    public Aircraft() {}

    public Aircraft(Long id, String type, String airlineName, String numberOfPassengers) {
        this.id = id;
        this.type = type;
        this.airlineName = airlineName;
        this.numberOfPassengers = numberOfPassengers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(String numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Aircraft: " + type + ", Operated by: " + airlineName + "Number of Passengers: " + numberOfPassengers;
    }
}
