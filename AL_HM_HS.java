// Arraylist , HashMap and HashSet in code file just for revision

// Iterator is a loop inside a list like arraylist , hashmap , hashset

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Test{
    public static void main(String[] args) {

        // ArrayList - resizeable array
        ArrayList<String> arraylistname = new ArrayList<String>();
        arraylistname.add("aditya");
        arraylistname.add("aur koi");
        System.out.println("ArrayList = "+arraylistname);

        // HashMap - key - value format me data store kar skte hai
        HashMap<Integer , String> hashmapname = new HashMap<Integer , String>();
        hashmapname.put(1, "aditya");
        hashmapname.put(2 , "siddharth");
        hashmapname.put(3 , "aditya");
        System.out.println("HashMap = "+hashmapname);

        // HashSet - ye ek unique list hoti hai jisme sab item unique hote hai baki arraylist type hai
        HashSet<Character> hashsetname = new HashSet<Character>();
        Character c = 'A';
        for(int i=0; i<10; i++){
            hashsetname.add(c);
            c++;
        }
        System.out.println("HashSet = "+hashsetname);
    }
}
