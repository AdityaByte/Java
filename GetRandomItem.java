// Getting Random Items from a list using java

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hey");
        list.add("wassup");
        list.add("what are u doing");
        list.add("kya kar rha hai");
        list.add("hey bro how are uh");

        Random random1 = new Random(); // Making random class object

      // here the loop starts dont store it out a 
        for(int i=1; i<=4; i++) {
            System.out.println(list.get(random1.nextInt(list.size()))); 
        }
    }
}
