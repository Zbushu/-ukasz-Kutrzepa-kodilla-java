package com.kodilla.flightmenager;

public class Airport {
    private String city;
    private String acronym;

    public Airport(String city, String acronym) {
        this.city = city;
        this.acronym = acronym;
    }

    public String getCity() {
        return city;
    }

    public String getAcronym() {
        return acronym;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        if (!city.equals(airport.city)) return false;
        return acronym.equals(airport.acronym);
    }

    @Override
    public int hashCode() {
        int result = city.hashCode();
        result = 31 * result + acronym.hashCode();
        return result;
    }
}
