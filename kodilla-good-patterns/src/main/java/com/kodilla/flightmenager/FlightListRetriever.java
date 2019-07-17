package com.kodilla.flightmenager;

public class FlightListRetriever {
    FlightList retrieve() {
        FlightList flightList = new FlightList();

        Airport warszawa = new Airport("Warszawa", "WAW");
        Airport gdańsk = new Airport("Gdańsk", "GDA");
        Airport katowice = new Airport("Katowice", "KAT");

        flightList.addFlight(new Flight(warszawa, gdańsk));
        flightList.addFlight(new Flight(gdańsk, warszawa));
        flightList.addFlight(new Flight(warszawa, katowice));

        return flightList;
    }
}
