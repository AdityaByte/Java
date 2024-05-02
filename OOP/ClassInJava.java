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
  static void getProperties(String n, boolean pe , boolean de , int ts , int m){
    this.name = n;
    this.petrolEngine = pe;
    this.diesalEngine = de;
    this.topSpeed = ts;
    this.milege = m;
  }
}

