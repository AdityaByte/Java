/*
Class - A class is a way of organizing information about a type of data so that a programmer
can reuse elements when making multiple instances (Object) of that data type
Syntax - 
class ClassName(In pascal convention){
  // attributes
  // methods
}
*/

class Car{

  // These are the attributes of a class 
  // Variables inside a class are known as attributes
  String name;
  boolean petrolEngine;
  boolean diesalEngine;
  int topSpeed;
  int milege;

  // Function inside a class is known as method
  static void setProperties(String n, boolean pe , boolean de , int ts , int m){
    this.name = n;
    this.petrolEngine = pe;
    this.diesalEngine = de;
    this.topSpeed = ts;
    this.milege = m;
  }
}
/*
-> A java file can only have one public class because when the compiler search for the main method so it 
firstly search that the java file have a public class then it search that the public class has the main method in it if it doesn't it 
gives an error
-> A java file can also be run without a public method but the compiler needs to search for every method 
which contains main method this makes compilation slower.
-> if we provide more than one class as a public , 
then we must save that java file with more than one name which is not possible in any operating system
*/
public class Main{
  public static void main(String args[]){
    Car.setProperties("kia sonet" , true , false , 300 , 10); // Because its a static method
  }
}
