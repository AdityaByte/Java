package com.springcore.autowiring.annotations;

public class Address {
    private String street;
    private String city;
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        System.out.println("setting the street value");
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        System.out.println("setting the city value");
        this.city = city;
    }
    @Override
    public String toString() {
        return "Address [street=" + street + ", city=" + city + "]";
    }
    
}
