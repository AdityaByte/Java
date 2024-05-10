// Abstraction - Abstraction is the process of hiding Internal details 
/*
 * Few things we need to remember about the abstract class and abstract methods
 * 1) Abstract class - abstract class is a class that may or may not include abstract methods 
 * 2) Abstract class cannot be instantiated we cant make a object of it
 * 3) But we can make a subclass of a abstract class 
 * 4) Abstract method is a method that is declared without an implementation means without body
 * 5) When an abstract class is subclassed, 
 *    the subclass usually provides implementations for all of the abstract methods in its parent class. 
 *    However, if it does not, then the subclass must also be declared abstract.
 * 6) We can create a reference of a abstract class and the object of the subclass like that
 *      AbstractClassName refernceName = new SubClassName();
 */

 // Here we declared phone as the abstract and it has the following methods
 // We can't instantiate the Phone class we can but we have to give body to the all abstracts methods there where it has been intantiate
abstract class Phone{
    abstract void bootLogo();
    abstract void ringTone();
    abstract void controlPanel();
}

// Redmi class is subclasses by the Phone class so it must includes all the abstract methods of the super class
// Otherwise it should also declared abstract class
class Redmi extends Phone{
    void bootLogo(){
        System.out.println("it boots the redmi logo");
    }
    void ringTone(){
        System.out.println("It plays the redmi ringtone");
    }
    void controlPanel(){
        System.out.println("It shows the redmi control panel");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Redmi obj = new Redmi();
        obj.bootLogo();
        obj.ringTone();
        obj.controlPanel();
        Phone obj1 = new Redmi(); // we can also do this 
    }
}