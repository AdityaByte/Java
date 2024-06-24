package com.hibernate;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="student_address")

public class Address {

    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    
    @Column(name = "STREET" , length = 100)
    private String street;

    @Column(name = "CITY" , length = 50)
    private String city;

    @Transient
    private double x;

    @Column(name = "is_open")
    private boolean isOpen;

    @Column(name = "added_date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;

    @Lob
    private byte[] image;

    public Address(int addressId, String street, String city, double x, boolean isOpen, Date addedDate, byte[] image) {
        super();
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.x = x;
        this.isOpen = isOpen;
        this.addedDate = addedDate;
        this.image = image;
    }

    

    @Override
    public String toString() {
        return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", x=" + x + ", isOpen="
                + isOpen + ", addedDate=" + addedDate  + "]";
    }



    public Address(){
        super();
    }

}
