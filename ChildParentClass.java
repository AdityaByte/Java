// SubClass in Java

import com.sun.tools.javac.Main;

// MainClass is the parent class
class MainClass{
    String carName = "Mustang Gt";
    String modelOfCar = "Gt 101";


}

// SubClass is the child class

class SubClass extends MainClass{

    public void SubClassFunction(){
        // You can acquire parent class variable in the child class like this
        System.out.printf("I have a car named %s of model %s" , carName , modelOfCar);
        
    }
}

public class ChildParentClass{
    public static void main(String[] args) {
        SubClass objOfSubClass = new SubClass();
        objOfSubClass.SubClassFunction();
    }
}
