package com.kodilla.good.patterns.airline;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static javafx.collections.FXCollections.concat;

public class FlightSearcher {

    private String cityOfDeparture;
    private String cityOfArrival;
    private String cityInterChange;
    private LocalDate flightDate;


    public FlightSearcher(String cityOfDeparture, String cityOfArrival, String cityInterChange, LocalDate flightDate) {
        this.cityOfDeparture = cityOfDeparture;
        this.cityOfArrival = cityOfArrival;
        this.cityInterChange=cityInterChange;
        this.flightDate = flightDate;
    }

    public FlightSearcher (String cityOfDeparture, String cityOfArrival, LocalDate flightDate){
        this(cityOfDeparture,cityOfArrival,null,flightDate);
    }

    public FlightSearcher (String cityOfDeparture,  LocalDate flightDate){
        this(cityOfDeparture,cityOfDeparture,null, flightDate);
    }

    public String getCityOfDeparture() {
        return cityOfDeparture;
    }

    public String getCityOfArrival() {
        return cityOfArrival;
    }

    public String getCityInterChange() {
        return cityInterChange;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    public void flightsToFrom (FlightRegister flightRegister) {
        System.out.println("Loty bezpośrednie z " + getCityOfDeparture() + " do " + getCityOfArrival()
                + " na dzień: " + getFlightDate() + ";");
        flightRegister.flightList.stream()
                .filter(f -> f.getDeparture().toLocalDate().isEqual(getFlightDate()))
                .filter(f -> f.getCityTo().equals(getCityOfArrival()) && f.getCityFrom().equals(getCityOfDeparture()))
                .forEach(System.out::println);
    }

        public void flightsToFromThrough (FlightRegister flightRegister) {
            System.out.println('\n' + "Lista lotów pośrednich z " + getCityOfDeparture() + " do " + getCityOfArrival()
                    + " przez " + getCityInterChange() + " na dzień: " + getFlightDate() + ";");
            List<Flight> fromAToB = flightRegister.flightList.stream()
                    .filter(f -> f.getDeparture().toLocalDate().isEqual(getFlightDate()))
                    .filter(f -> (f.getCityTo().equals(getCityInterChange())) && f.getCityFrom().equals(getCityOfDeparture()))
                    .collect(Collectors.toList());
            List<Flight> fromBToC = flightRegister.flightList.stream()
                    .filter(f -> f.getDeparture().toLocalDate().isEqual(getFlightDate()))
                    .filter(f -> (f.getCityTo().equals(getCityOfArrival())) && f.getCityFrom().equals(getCityInterChange()))
                    .collect(Collectors.toList());
            List<Flight> fromAThroughBToC = Stream.concat(fromAToB.stream(), fromBToC.stream())
                    .collect(Collectors.toList());
            fromAThroughBToC.forEach(System.out::println);
    }

    public void flightsFrom(FlightRegister flightRegister) {
            System.out.println('\n' + "Lista lotów z " + getCityOfDeparture() + " na dzień: " + getFlightDate() + ";");
            flightRegister.flightList.stream()
                    .filter(f -> f.getDeparture().toLocalDate().isEqual(getFlightDate()))
                    .filter(f -> f.getCityFrom().equals(getCityOfDeparture()))
                    .forEach(System.out::println);
    }

    public  void  flightsTo(FlightRegister flightRegister) {
            System.out.println('\n' + "Lista lotów do " + getCityOfArrival() + " na dzień: " + getFlightDate() + ";");
            flightRegister.flightList.stream()
                    .filter(f -> f.getDeparture().toLocalDate().isEqual(getFlightDate()))
                    .filter(f -> f.getCityTo().equals(getCityOfArrival()))
                    .forEach(System.out::println);
    }

}
