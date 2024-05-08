/*
 Iterator - n Iterator is an object that can be used to loop through collections,
 like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping.
 */

import java.util.Iterator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.ensureCapacity(10);
        for(int i=1; i<=10; i++){
            al.add(i);
        }
        System.out.println(al);

        // Iterator is a object so
        Iterator<Integer> i = al.iterator();
        System.out.println(i.next()); // it only prints the first term

        // if we want to print all terms
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
