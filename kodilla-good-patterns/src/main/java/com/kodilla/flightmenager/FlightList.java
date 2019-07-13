package com.kodilla.flightmenager;

import java.util.HashSet;

public class FlightList {
    HashSet<Flight> flights = new HashSet<>();


    public HashSet<Flight> getFlights() {
        return flights;
    }
    public void addFlight(Flight flight){
        flights.add(flight);
    }
}
