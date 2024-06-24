package com.springcore.ref;

public class A {
    private int x;
    private B objB;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public B getObjB() {
        return objB;
    }
    public void setObjB(B objB) {
        this.objB = objB;
    }
    public A() {
        super();
    }
    @Override
    public String toString() {
        return "A [x=" + x + ", objB=" + objB + "]";
    }

    
}
