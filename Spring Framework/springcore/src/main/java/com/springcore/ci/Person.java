package com.springcore.ci; // ci - constructor injection

import java.util.List;

public class Person {
    private String name;
    private int personId;
    private Certi certi;
    private List<String> personAddress;

    public Person(String name , int personId , Certi certi , List<String> personAddress){
        this.name = name;
        this.personId = personId;
        this.certi = certi;
        this.personAddress = personAddress;
    }

    @Override
    public String toString(){
        return "Person [Name -" + name + " Person id -" + personId + " Certi -" + certi.name +" Person address -> "+ personAddress + "]";
    }
}
