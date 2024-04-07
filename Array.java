// Array is the collection of same types of datatypes
/*
Objectives-
1. One dimensional array in java
2. for each loop in java
3. Arrays class and method of an array
*/

import java.util.Arrays;

public class Test{
    public static void main(String[] args) {
        char[] charArray; // declaration
        charArray = new char[2]; // Memory allocation

        int[] intArray = new int[3]; // Declaration + Memory allocation

        String[] stringArray = {"adi" , "aditya" , "abhi" , "jean"}; // Declaration + intialization

        // Length of an array
        System.out.println(charArray.length); // return -> 2

        // How can we display array elements
        // 1. Using normal for loop
        for(int i=0; i<stringArray.length; i++){
            System.out.printf("%s ," , stringArray[i]);
        }
        System.out.println();
        // 2. Using for each loop
        for(String s: stringArray){
            System.out.print(s + " ,");
        }
        System.out.println();

        // cloning an array
        int[] arr = {1,2,3,4,5};
        int[] arr2 = arr.clone();

        // String representation of an array
        int[] arr1 = {10,20,30};
        System.out.println(Arrays.toString(arr1));

        // Filling an array using specfic value
        int[] arr4 = new int[5];
        Arrays.fill(arr4 , 12);
        String a = Arrays.toString(arr4);
        System.out.println(a);
    }
}
