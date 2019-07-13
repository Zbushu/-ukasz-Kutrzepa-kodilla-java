package com.kodilla.flightmenager;

public class Application {
    public static void main(String[] args) {
        FlightListRetriever flightListRetriever = new FlightListRetriever();
        FlightList flightList = flightListRetriever.retrieve();

        SearchProcessor.process(flightList);
    }
}
