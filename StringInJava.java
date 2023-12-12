// String in Java

public class StringInJava{
    public static void main(String[] args) {
        
        // String are used for Storing Text
        // A String variable contains a collection of characters surrounded by double quotes

        String name = "Aditya";

        System.out.println(name);

        // Some pre-defined methods which u can used for performing operations on strings

        // 1) The length of the string can be found by - length()

        String carName = "MustangGT";

        System.out.println(carName.length());

        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("There are " + alphabets.length() + " letters in alphabet");

        // 2) CharAt() - return the character value

        String personName = "Abhi"; // A-0 , b-1 , h-2 , i-3

        System.out.println(personName.charAt(3)); // java reads from 0 and counts from 1

        // 3) getBytes() - Encodes the string into a sequence of bytes

        System.out.println(name.getBytes());

        // 4) hashCode() - returns a hash code of this string

        System.out.println(name.hashCode());

        String name1 = "Aditya";

        System.out.println(name.hashCode() == name1.hashCode()); // since both variable contains the same value so it return the true value

        // 5) indexOf() - finding a character in a string

        String text = "hey there my name is aditya";

        System.out.println(text.indexOf("my")); // Java counts position from zero

        // 6) isEmpty() - it checks the String is empty or not

        String st1 = " ";

        System.out.println(st1.isEmpty()); // it returns false because the string contains a backspace

        // 7) isBlank() - it ignores backspace it reals only character

        String st2 = "      ";
        
        System.out.println(st2.isBlank()); // it returns true

        // 8) toLowerCase() - Convert all of the characters in this String to lowercase 

        String placeName = "SWITZERland";

        System.out.println(placeName.toLowerCase());

        // 9) toUpperCase() - Convert all the characters of the string to upper case

        System.out.println(placeName.toUpperCase());

        // 10) toCharArray() - Convert the string to a new character array

        String letters = "aditya";

        System.out.println(letters.toCharArray());

        // 11) String Concatenation

            /* 
             * The + operator can be used between strings to combine them. This is called concatenation
             * Instead of this you can use this method 
             * Concat()
             */

        String Name = "Aditya";

        String surName = " Pawar";

        System.out.println(Name + surName);

        System.out.println(Name.concat(surName)); // both will return the same value

        // 12) Adding numbers and string 

        /*
         * Java use + operator for both addition and concatenation
         */

        int a = 10;
        int b = 20;

        System.out.println(a + b);

        // but if we add a string and an integer

        String num = "20";
        
        System.out.println(num + a); // it returns 2010

        // 13) Strings - Special Characters

        // String txt = " hey there ! its me "aditya" "; // this will generate an error 

        // a. for single quote ('') - \'

        System.out.println("what\'s going on");

        // b. for double quote ("") - \"

        System.out.println("Itz me \"aditya\" ");

        // c. for backslash (\) - \\

        System.out.println("\\www\\bin\\files");

        // d. \n - for new line

        System.out.println("whats up \n buddy");    

        // e. \t - for tab

        System.out.println("hey \t tab");

        // f. \b - for backspace

        System.out.println("hel\blo bro");
    }
}