// access modifiers - It controls the access level

class AccessModifiers{

    // Methods , attributes and constructors can have the following access modifiers - public, default, private, protected
    // we just declare the variables
    public int a; // this is accessable for all classes
    int b; // default is defaultly setted to it
    private int c; // this code is only accessable in the declared class if we want to access it in another class we have to set a getter for that
    protected int d; // It can be accessable in subclasses and in the same package

    // For Methods 
    public void meth1(){}; // public method can be accessed for anywhere 
    void meth2(){}; // this is the default method 
    private void meth3(){}; // this is the private method
    protected void meth4(){}; // this is the protected method

    // For constructors
    // we are overloading constructers here
    AccessModifiers(){};
    void AccessModifiers(){};
    public void AccessModifiers(int a){};
    private void AccessModifiers(String a){}; // for overloading a constructor we need to change return type otherwise the parameters in the constructor
    protected int AccessModifiers(char c){
        return 0;
    }
    
}

class SubClass extends AccessModifiers{
    int a;
    // like we can access the protected method here also by creating the object of subclass
}

// ek java ki file me sirf ek public class hoti hai
public class Main {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.meth2();
        // creating object of subclass
        SubClass obj2 = new SubClass();
        obj2.meth4(); // this is the protected method
        obj2.d = 10; // this is the protected variable
    }
}
