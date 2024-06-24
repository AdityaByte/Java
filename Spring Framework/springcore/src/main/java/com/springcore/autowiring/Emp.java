package com.springcore.autowiring;

public class Emp {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("they are using setter injection");
        this.address = address;
    }

    public Emp(Address address) {
        super();
        this.address = address;
        System.out.println("they are using constructor injection");
    }

    public Emp(){
        super();
    }

    public String toString(){
        return "Emp [ address = " + address + " ]";
    }

    
}
