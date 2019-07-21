package com.kodilla.flightmenager;

public class FlightListRetriever {
    FlightList retrieve() {
        FlightList flightList = new FlightList();

        Airport warsaw = new Airport("Warszawa", "WAW");
        Airport gdansk = new Airport("Gdańsk", "GDA");
        Airport katowice = new Airport("Katowice", "KAT");

        flightList.addFlight(new Flight(warsaw, gdansk));
        flightList.addFlight(new Flight(gdansk, warsaw));
        flightList.addFlight(new Flight(warsaw, katowice));

        return flightList;
    }
}
