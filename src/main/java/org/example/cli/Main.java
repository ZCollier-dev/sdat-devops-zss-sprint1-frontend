package org.example.cli;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HttpClientHelper clientHelper = new HttpClientHelper();
        AnswerQueries queries = new AnswerQueries(clientHelper);

        while (true) {
            System.out.println("Choose a query:");
            System.out.println("1. List airports in a city");
            System.out.println("2. List aircraft a passenger has flown on");
            System.out.println("3. List airports an aircraft uses");
            System.out.println("4. List airports a passenger has used");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear newline

            switch (choice) {
                case 1:
                    System.out.println(queries.getAirportsByCity());
                    break;
                case 2:
                    System.out.println(queries.getAircraftByPassenger());
                    break;
                case 3:
                    System.out.println(queries.getAirportsByAircraft());
                    break;
                case 4:
                    System.out.println(queries.getAirportsByPassenger());
                    break;
                case 0:
                    System.out.println("Exiting.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
