package com.springcore.ci;

public class Certi {
    String name;

    public Certi(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Name => " + this.name;
    }
}
