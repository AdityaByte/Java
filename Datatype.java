// DATA TYPES
/*
 * Data Types are divided into two types :
 * 1) Primitive data types - byte,short,int,long,float,double,boolean,char
 * 2) Non-Primitive data types - String , Array etc
 */

public class Datatype {
    public static void main(String[] args) {

        // Byte - byte stores integer between -128 to 127 , 1 byte
        byte byte1 = 10;
        System.out.println(byte1);

        // Short - short stores integer between -32,768 to 32,767 , 2 byte
        short short1 = 1000;
        System.out.println(short1);

        // Int - int stores integer between -2,147,483,648 to 2,147,483,647 , 4 byte
        int int1 = 122222222;
        System.out.println(int1);

        // Long - long stores integer between -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 , 8 byte
        long long1 = 111111111111111111L; //ends with l or L
        System.out.println(long1);

        // FLoat - Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits , 4 byte
        float float1 = 12.11111f;
        System.out.println(float1);

        // Double - Stores fractional numbers. Sufficient for storing 15 decimal digits , 8 byte
        double double1 = 11.111111111D;
        System.out.println(double1);

        // Boolean - Stores true or false values , 1 bit (0,1)
        boolean bool1 = true;
        System.out.println(bool1);

        // char - 	Stores a single character/letter or ASCII values , 2 byte
        char character1 = 'a'; //under single quotes
        System.out.println(character1);

        /*String - It comes under non-primitive data types and it stores any text value 
        and any value inside double quotes is considered as string value*/
        
        String name = "aditya";
        System.out.println(name);

    }
}
