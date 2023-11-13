// Variables are containers for storing data values

// Declaring (Creating) Variables
/* 
 * Syntax -
 *      type variableName = value;
 */

 /*
  * All Java variables must be identified with unique names.
  * These unique names are called identifiers.
  */

public class Variables {
    public static void main(String[] args) {

        // Step 1 - First you have to declare the data type
        // Step 2 - Name the Variable , name should be understable
        // Step 3 - assign value to the variable

        int a = 12;
        System.out.println(a);

        String name1 = "Aditya";
        System.out.println(name1);

        char character = 'a';
        System.out.println(character);

        double d1 = 12.12d;
        System.out.println(d1);

        // You can assign any other values to a variable like this -

        int num;
        num = 111;
        num = 122; // now this value is assigned in the variable in place of the previous value
        System.out.println(" It will print the second number rather than the first " + num);
        
        // If you don't want others (or yourself) to overwrite existing values, use the final keyword 

        final int num1 = 26;
        // num1 = 23; // it gives error 
        System.out.println(num1);

        // Java Declare Multiple Variables - To declare more than one variable of the same type, you can use a comma-separated list:

        int aa = 1 , bb = 2 , cc = 3;
        System.out.println(aa + bb + cc);

        String name = "Aditya " , surname = "Pawar";
        System.out.println(name + surname);
    }
}
