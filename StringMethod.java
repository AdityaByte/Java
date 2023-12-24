public class StringMethod{

  public static void main(String[] args){

    String name = "aditya";
    String name1 = "aditya";
    // the upper two strings refer to the same object java evaluates the refrence from the same object
    // but if u create the String like this-

    String n1 = new String("aditya");
    String n2 = new String("aditya");
    System.out.println(n1 == n2); // it returns false bcz they are referring different classes

    String something = new String("adityapawar");

    // methods of string 

    System.out.println(something.length()); // for checking length of string
    // it returns 11
    System.out.println(something.toLowerCase()); // for switching all characters to lowercase
    // it returns adityapawar
    System.out.println(something.toUpperCase()); // for switching all characters to uppercase
    // it returns ADITYAPAWAR

    String something1 = "     aditya     ";
    System.out.println(something1.trim()); // it removes unusal spaces in a string
    // it returns aditya
    System.out.println(something.replace('t' , 'y')); // it replaces a character to the another character
    // it returns adiyya
    System.out.println(something.replace("adi" , "ida")); // it replaces a sequcence of chars to another sequence of char

    System.out.println(something.startsWith("adi")); // it returns a boolean value
    // it return true in this case
    System.out.println(something.endsWith("ya")); // it also returns a boolean value
    // it returns false in this case
    System.out.println(something.indexOf("i")); // it returns the place of the particular charcter or string
    // it returns 2 bcz java reads from 0
    System.out.println(something.indexOf("w" , 2)); // it starts from 2 and then gives the place of d
    // it returns 5 i think
    System.out.println(something.lastIndexOf("i"));
    // it returns i dont know run it and check
    System.out.println(something.substring(2)); // it forwards a substring which starts from 2 place 
    // it returns ityapawar
    System.out.println(something.substring(2 , 5)); // it includes 2 and excludes 5

    System.out.println(something.charAt(5)); // it returns the charcter at the place specified

    System.out.println(n1.equals(n2)); // it is used for comparing two string objects
    // it returns true
    System.out.println(n1.equalsIgnoreCase(n2)); // it is also used for comparing but it ignore the case i.e.,upper lower etc 
    
  }
  
}
