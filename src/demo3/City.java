package com.example.demo3;

public class City {
    private String name;
    private String lat;
    private String Lon;

    public City(String name, String lat, String lon) {
        this.name = name;
        this.lat = lat;
        Lon = lon;
    }

    public String getName() {
        return name;
    }

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return Lon;
    }
}
