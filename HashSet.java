// Hashset in java - A HashSet is a collection of items where every item is unique

import java.util.HashSet;
import java.util.ArrayList; // this was just used for comparision

public class Main {
    public static void main(String[] args) {
        // In the hashset every element is unique
        HashSet<String> hashArray = new HashSet<String>();
        hashArray.add("aditya");
        hashArray.add("abhi");
        hashArray.add("aditya");
        System.out.println(hashArray); // it prints - aditya and abhi only

        // Rather than hashset duplicate items can also exists in arraylist
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("aditya");
        arraylist.add("aditya");
        System.out.println(arraylist);

        // Some methods of hashset
        // contains() - method - returns boolean value
        boolean contain = hashArray.contains("aditya");
        boolean contain1 = hashArray.contains("java");
        System.out.println(contain); // returns true
        System.out.println(contain1); // returns false

        // clone() - method
        HashSet<String> hashArray2 = (HashSet<String>) hashArray.clone();
        System.out.println(hashArray2);

        //clear() - method
        hashArray2.clear();
        System.out.println(hashArray2);

        //remove() - method - for removing an existed item
        hashArray.remove("abhi");
        System.out.println(hashArray); // returns only aditya

        //size() - method - for returning the size of array
        byte size = (byte)hashArray.size();
        System.out.println(size);
    }
}
