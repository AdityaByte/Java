// Hashmap in java - HashMap is kinda similar to dictionary in python it has also key and value
// The key and value are generally objects - that's why we use non-primitive data types
// String is a non-primitive and we use wrapper classes for primitive data types
// Integer - int , Character - char , Boolean - boolean , Double - double

import java.util.HashMap;

// if we want to create a hashmap we have to create an object of it like -

public class HashMap {
    public static void main(String[] args) {
        HashMap<String , String> nickName = new HashMap<String , String>();

        // we we want to put data in a hashmap use this method - put()
        nickName.put("aditya" , "adi");
        nickName.put("Jeandre" , "jeanie");
        System.out.println(nickName);

        // To print the size of a hashmap use the size method
        System.out.println("Size of nickName : " + nickName.size());

        //To get a item in a hashmap
        String particularItem = nickName.get("aditya");
        System.out.println(particularItem);

        //To remove a item in a hashmap use the remove method
        nickName.remove("aditya");
        System.out.println(nickName);

        //To remove all items use the clear method
        nickName.clear();
        System.out.println(nickName);

        HashMap<Integer ,String> hashmap1 = new HashMap<Integer , String>();
        hashmap1.put(1 , "aditya");
        hashmap1.put(2 , "adi");
        hashmap1.put(3 , "somebody");
        hashmap1.put(4 , "nobody");
        System.out.println(hashmap1);

        // To print the size of a hashmap
        System.out.println("Size of hashmap1 : " + hashmap1.size());

        // For-each loop in hashmap - to print the keys use the keyset method
        System.out.println("Keys -> ");
        for(int k : hashmap1.keySet()){
            System.out.println(k);
        }
        // For-each loop in hashmap - to print the Values use the values method
        System.out.println("Values -> ");
        for(String v : hashmap1.values()){
            System.out.println(v);
        }
        // To print the key and values at the same time using for-each loop
        System.out.println("key - Value");
        for(int i : hashmap1.keySet()){
            System.out.println("key : " + i + " Value : " + hashmap1.get(i));
        }
    }
}
