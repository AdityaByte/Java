// String Tokenizer

import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Iterator;

public class StringTokenizerInJava {
    public static void main(String[] args) {
        String text = "hey what are you doing \n hey bruh now tell how many tokens";
        StringTokenizer str = new StringTokenizer(text , " ");
        StringTokenizer str1 = new StringTokenizer(text);
        StringTokenizer str2 = new StringTokenizer(text , "\n" , false);
        System.out.println(" str output for count tokens : " + str.countTokens());
        System.out.println("str1 output for count tokens : " + str1.countTokens());
        System.out.println("str2 output for count tokens : " + str2.countTokens());
        ArrayList<String> al = new ArrayList<String>();
        while(str.hasMoreTokens()){
            al.add(str.nextToken());
        }
        System.out.println(al);
        Iterator<String> it = al.iterator();
        System.out.println("iterator output - ");
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}