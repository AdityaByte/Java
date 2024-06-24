package com.springcore.lifecycle;

public class Samosa {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("setting price of samosa");
        this.price = price;
    }

    public Samosa() {
        super();
    }

    @Override
    public String toString() {
        return "samosa [price=" + price + "]";
    }

    public void init(){
        System.out.println("inside the init method");
    }

    public void destroy(){
        System.out.println("inside the destroy method");
    }
    
}
