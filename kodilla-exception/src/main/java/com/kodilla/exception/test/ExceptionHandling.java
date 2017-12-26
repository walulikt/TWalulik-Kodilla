package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        Flight flight = new Flight("Walesy", "Chopin");

        FlightFinder flightFinder = new FlightFinder();
        flightFinder.addAirport();
        flightFinder.findFilght(flight);

        /*try {

        } catch (Exception e) {

        } finally {

        }*/

    }
}
