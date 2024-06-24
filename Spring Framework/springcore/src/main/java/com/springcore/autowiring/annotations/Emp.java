package com.springcore.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    @Autowired
    @Qualifier("address")
    private Address address;

    public Address getAddress() {
        return address;
    }

    //@Autowired
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
