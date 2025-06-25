package org.example.cli;

public class Main {
    public static void main(String[] args) {
        AnswerQueries cli = new AnswerQueries();
        cli.getAirportsByCity();
        cli.getAircraftByPassenger();
        cli.getAirportsByAircraft();
        cli.getAirportsByPassenger();
    }
}
