package com.kodilla.good.patterns.airline;

import java.time.LocalDateTime;

public class Flight {
    private String cityFrom;
    private String cityTo;
    private int flightNumber;
    private LocalDateTime departure;
    private LocalDateTime arrival;

    public Flight(String cityFrom, String cityTo, int flightNumber, LocalDateTime departure, LocalDateTime arrival) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public LocalDateTime getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (getFlightNumber() != flight.getFlightNumber()) return false;
        if (getCityFrom() != null ? !getCityFrom().equals(flight.getCityFrom()) : flight.getCityFrom() != null)
            return false;
        if (getCityTo() != null ? !getCityTo().equals(flight.getCityTo()) : flight.getCityTo() != null) return false;
        if (getDeparture() != null ? !getDeparture().equals(flight.getDeparture()) : flight.getDeparture() != null)
            return false;
        return getArrival() != null ? getArrival().equals(flight.getArrival()) : flight.getArrival() == null;
    }

    @Override
    public int hashCode() {
        return getFlightNumber();
    }

    @Override
    public String toString() {
        return "Przelot z:" + cityFrom + '\'' +
                ", do: " + cityTo + '\'' +
                ", nr lotu: " + flightNumber +
                ", wylot: " + departure +
                ", przylot: " + arrival;
    }
}
