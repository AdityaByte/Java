/*
Inheritance in java - In Java, one class can easily inherit the attributes 
and methods from some other class. This mechanism of acquiring objects and
properties from some other class is known as inheritance in Java.

-> for inheriting a class from another class we use the '' extends '' keyword
*/

class SuperClass{
    int a;
    int b;
    public int sum(int a , int b){
        this.a = a;
        this.b = b;
        return this.a + this.b;
    }
}

// SubClass is inherited by the SuperClass Now 
// SubClass has all the properties of the superclass and its own also
// We can call any method of superclass from the subclass
class SubClass extends SuperClass{
    int c;
    public void printValue(int c){
        this.c = c;
        System.out.println("the value of c is: " + this.c);
    }
}

public class Main{
    public static void main(String args[]){
        SuperClass obj_of_super = new SuperClass();
        int result = obj_of_super.sum(10 ,20);
        System.out.println(result);
        
        SubClass obj_of_sub = new SubClass();
        System.out.println(obj_of_sub.sum(20,30)); // calling a method of the parent class
        obj_of_sub.printValue(100);
    }
}
