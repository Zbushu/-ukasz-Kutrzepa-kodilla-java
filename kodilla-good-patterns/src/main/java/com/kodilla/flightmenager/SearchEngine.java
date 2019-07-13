package com.kodilla.flightmenager;

import java.util.ArrayList;
import java.util.List;

public class SearchEngine {
    public static List<Flight> searchFlightFrom (Airport airport, FlightList list){
        ArrayList<Flight> result = new ArrayList<>();
        list.getFlights().stream()
                .filter(f-> f.getDepartureAirport().equals(airport))
                .forEach(result::add);
        return result;
    }
    public static List<Flight> searchFlightTo (Airport airport, FlightList list){
        ArrayList<Flight> result = new ArrayList<>();
        list.getFlights().stream()
                .filter(f-> f.getArrivalAirport().equals(airport))
                .forEach(result::add);
        return result;
    }
    public static boolean searchFlightsVia (Airport from, Airport via, Airport to, FlightList list){
        ArrayList<Flight> result1 = new ArrayList<>();
        ArrayList<Flight> result2 = new ArrayList<>();

        list.getFlights().stream()
                .filter(f-> f.getDepartureAirport().equals(from))
                .filter(f-> f.getArrivalAirport().equals(via))
                .forEach(result1::add);

        list.getFlights().stream()
                .filter(f-> f.getDepartureAirport().equals(via))
                .filter(f-> f.getArrivalAirport().equals(to))
                .forEach(result2::add);

        if (!result1.isEmpty()&&!result2.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}
