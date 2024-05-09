// Non-access Modifiers - They don't control the access level but control other functionality

// for class - we can use either final or abstract
// final class - Jaise ki final variables ki value change nhi hoti hai usi type final class dusri class se inherit nhi ho skti
/*
abstract class - jaise final class inherit nhi hoti hai dusri classo se similar like that 
        abstract class ka object nhi bana skte  iski properties attributes ko access krne ke liye hume isko 
        inherit krna pdta hai dusri class se 
 */

// Final class - 

final class FinalClass{
    int a;
    public String name = "aditya";
    protected Character c = 'A';
    private long l = 234223l;
}

/*
// This code gives an error
// The type SubClass cannot subclass the final class FinalClass
class SubClass extends FinalClass{
    void meth1(){
        System.out.println("this is the inherited class");
    }
}
*/

// abstract class

abstract class AbstractClass{
    // abstract method with no body
    abstract void abstractMethod();

    // Normal method
    public void methodInAbstractClass(){
        System.out.println("this is the normal method");
    }
}

// You need to inherit the abstract class from a another class for creating object 
// object creation can also be done by given body to the abstract method at the object creation time
class AnotherSubClass extends  AbstractClass{
    // the body of the abstract is given here
    void abstractMethod(){
        System.out.println("hey this is the abstract method");
    }
}

// Non access modifiers for attributes and methods 
/*
 * final - attributes and method cannot be overriden/modified
 * static - attributes and method belongs to the class not to the object we dont need to create obj for accessing static methods or attributes
 * 
 */
class NonAccessModifierForMethodsAndAttributes{
    final String name = "aditya";
    //name = "abhi"; // it throws an error
    static int a;
    transient int b = 10;
    void printMethod(){
        System.out.println(b);
    }
}

class Test{
    public static void main(String[] args) {
        //SubClass obj = new SubClass();
        //obj.meth1();
        //AnotherSubClass obj  = new AnotherSubClass();
        //obj.abstractMethod();
        //obj.methodInAbstractClass();
        //NonAccessModifierForMethodsAndAttributes obj = new NonAccessModifierForMethodsAndAttributes();
        //System.out.println(obj.name);
        //obj.printMethod();
    }
}
