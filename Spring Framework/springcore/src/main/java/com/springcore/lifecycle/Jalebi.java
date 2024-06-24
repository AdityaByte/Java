package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jalebi {
    private int price;
    
    public void setPrice(int price){
        System.out.println("setting price of jalebi");
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public Jalebi(){
        super();
    }

    public String toString(){
        return " Jalebi { price = " + this.price + " }";
    }

    // init method
    @PostConstruct
    public void init(){
        System.out.println("initalizing the jalebi bean");
    }

    // destroy method
    @PreDestroy
    public void destroy(){
        System.out.println("destroying the jalebi bean");
    }
}