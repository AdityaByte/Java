// Public and Static Methods (Functions) in Java ..

// Here is the first example

public class PublicOrStaticMethod {

    // Static method which can be accessed without creating an object

    static void staticMethod(){
        System.out.println("this is the static method");
    }

    // for accessing public method u have to create the object

    public void publicMethod(){
        System.out.println("This is the public method");
    }

    // Main method - entry point

    public static void main(String[] args) {
        staticMethod(); // static method can be acccessed without creating an object means its belong to the class not to the object
        Test obj = new Test();
        obj.publicMethod(); // public method are used to accessed creating an object because these belongs to the object not directly to the class
    }

}

// Here is the second example for using this one comment out the above code

class class1{
  
    static void staticMethod(){
        System.out.println("This is the static method of class1");
    }

    public void publicMethod(){
        System.out.println("This is the public method of class1");
    }
}

public class PublicOrStaticMethod{
    public static void main(String[] args) {
      
        class1.staticMethod(); // Static method can be accessed by the class itself
      
        class1 obj = new class1(); // You have to create an object of class1 for accessing the public method
        obj.publicMethod();
    }
}
