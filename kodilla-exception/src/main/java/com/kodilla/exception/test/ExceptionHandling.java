package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        Flight flight = new Flight("Lotnisko", "Chopin");

        FlightFinder flightFinder = new FlightFinder();
        flightFinder.addAirport();

        try {
            flightFinder.findFilght(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Jedno ze wskazanych lotnisk nie istnieje");
        } finally {
            System.out.println("Koniec wyszukiwania lotu");
        }



    }
}
