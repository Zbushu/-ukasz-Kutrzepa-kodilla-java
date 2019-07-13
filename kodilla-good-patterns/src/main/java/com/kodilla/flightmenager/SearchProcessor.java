package com.kodilla.flightmenager;

public class SearchProcessor {
    public static void process(FlightList flightList) {
        System.out.println(SearchEngine.searchFlightTo(new Airport("Katowice", "KAT"),flightList));
        System.out.println(SearchEngine.searchFlightFrom(new Airport("Gdańsk", "GDA"),flightList));
        System.out.println(SearchEngine.searchFlightsVia(new Airport("Gdańsk","GDA"),new Airport("Warszawa", "WAW"), new Airport("Katowice","KAT"),flightList));
    }
}
