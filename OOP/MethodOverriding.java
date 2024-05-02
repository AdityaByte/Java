// Method overriding in java
/* Overriding a method in java is if a child class implements the method presend in the 
parent class is known as method overriding .
*/

class A{
    public void meth1(){
        System.out.println("this is the method 1 of class A");
    }
    public int meth2(){
        return 4;
    }
}

// Class B is inherited by class A
class B extends A{
    
    // Overriding a method which is pre-existed in the parent class
    // you can write the pre notation before overriding 
    
    @Override
    public void meth1(){
        System.out.println("this is the method 1 of class B");
    }
    
    public void meth3(){
        System.out.println("this is the method 3 of class B");
    }
}

public class Main{
    public static void main(String args[]){
        A a = new A();
        a.meth1();
        B b = new B();
        b.meth1(); // this runs the method of class A when we can't override 
    }
}
