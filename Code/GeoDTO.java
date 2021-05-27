package com.example.demo;

public class GeoDTO {
    public GeoDTO() {
    }
    public String lat;
    public String lng;

    @Override
    public String toString() {
        return "GeoDTO{" +
                "lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                '}';
    }
}
