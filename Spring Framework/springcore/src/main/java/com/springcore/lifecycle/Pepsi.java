package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean , DisposableBean{

    private int price;

    public void setPrice(int price){
        System.out.println("setting price of pepsi");
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public Pepsi(){
        super();
    }

    public String toString(){
        return "Pepsi { price -> " + this.price + " }";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // Init method
        System.out.println("taking pepsi : initializing");
    }

    
    @Override
    public void destroy() throws Exception {
        // Destroy method
        System.out.println("Putting down the bottle back : destroying or cleaning the code");
    }
    
}
