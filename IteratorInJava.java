// Iterator is a loop inside a list like arraylist , hashmap , hashset

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class Test{
    public static void main(String[] args) {

        // ArrayList - resizeable array
        ArrayList<String> arraylistname = new ArrayList<String>();
        arraylistname.add("aditya");
        arraylistname.add("aur koi");
        System.out.println("ArrayList = "+arraylistname);
        // To use iterator in this list - iterator is a similar term to iterations
        Iterator<String> it = arraylistname.iterator();
        System.out.println("it value = " + it); // it prints the string representation of the object - javaclass$methodname+stringrepresentation
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println(""); // for new line

        // HashMap - key - value format me data store kar skte hai
        HashMap<Integer , String> hashmapname = new HashMap<Integer , String>();
        hashmapname.put(1, "aditya");
        hashmapname.put(2 , "hemraj");
        hashmapname.put(3 , "aditya");
        System.out.println("HashMap = "+hashmapname);
        // testing out iterator here - instead of iterator it is a simpler method - by foreach loop
        for(int i: hashmapname.keySet()){
            System.out.print("Key:" + i + " Value:"+ hashmapname.get(i));
            System.out.println();
        }
        // second method
        Iterator<Integer> it1 = hashmapname.keySet().iterator();
        while(it1.hasNext()){
            Integer i = it1.next();
            System.out.print("key by iterator : " + i + "  Value by iterator :" + hashmapname.get(i) + "\n");
        }

        // HashSet - ye ek unique list hoti hai jisme sab item unique hote hai baki arraylist type hai
        HashSet<Character> hashsetname = new HashSet<Character>();
        Character c = 'A';
        for(int i=0; i<10; i++){
            hashsetname.add(c);
            c++;
        }
        System.out.println("HashSet = "+hashsetname);
        // Iteration method
        Iterator<Character> it2 = hashsetname.iterator();
        while(it2.hasNext()){
            System.out.print(it2.next() + " ");
        }
    }
}
