/*
Wrapper Class - Wrapper class is a way to provide primitive datatypes to objects
primitive datatypes - wrapper class
byte - Byte
short - Short
long - Long
int - Integer
float - Float
double - Double
char - Character
 */

public class WrapperClass {
    public static void main(String[] args) {

        //if we want to make a object of byte use the wrapper class
        Integer a = new Integer(10); // Basically its an older method of creating wrapper class objects
        Integer b = 20;
        System.out.println("Integer Object - " + (a+b)); // it returns 30

        // for byte
        Byte byteobj = new Byte((byte)10); // basically the value inside the braces is a integer u have to type cast it
        Byte byteobj1 = 10;
        System.out.println("Byte Object - "+byteobj);

        // for short
        Short s = new Short((short)10);
        Short s1 = 10;
        System.out.println("Short object - "+s);

        // for Long
        Long l = new Long(1299232l);
        Long l1 = 100000000000000l;
        System.out.println("Long object - "+l);

        Character c = new Character('A');
        Character c1 = 'B';
        System.out.println("Character object - "+ ++c + "\n Second output - "+ ++c1); // it returns B as object

        Float f = new Float(12.12f);
        float f1 = 13.13f;
        System.out.println("Float wrapper class - "+ f1);

        Double dObject = new Double((double) 12.122d);
        System.out.println("This is the double object - "+ dObject);
    }
}
