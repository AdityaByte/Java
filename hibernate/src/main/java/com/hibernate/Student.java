package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

// We have to specify that this class is an entity to the hibernate xml
@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private String city;
    private Certificate certificate;

    public Student(int id, String name, String city , Certificate certificate){
        this.id = id;
        this.name = name;
        this.city = city;
        this.certificate = certificate;
    }

    public Student(){
        super();
    }

    public String toString(){
        return this.id + " : " + this.name + " : " + this.city + " : " + certificate.toString();
    }
}
