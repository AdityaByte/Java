package com.springcore.javaconfig;

public class Student {
    private Pakoda pakoda;

    public Pakoda getPakoda() {
        return pakoda;
    }

    public void setPakoda(Pakoda pakoda) {
        this.pakoda = pakoda;
    }
    public Student(Pakoda pakoda){
        System.out.println("i am the constructor");
        pakoda.display();
    }

}
