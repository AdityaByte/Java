// Immutable objects are objects which once declared elements can’t be modified after it.
// StringBuffer - String buffer is used to create mutable sequence of characters 
// StringBuilder - String builder is also used for creating mutable sequence of characters
/* The only difference in between the string buffer and builder was that the String buffer 
is synchronized means it can work on different threads simutaneously on the other hand StringBuilder 
is not synchronized means it can only work on a single thread at a time that's why 
StringBuilder is faster than the StringBuffer
*/

public class StringBufferAndStringBuilder{
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");
        String str = sb.toString();
        sb = new StringBuffer("aditya new object");
        System.out.println("New string buffer object => " + sb); // aditya new object
        System.out.println("old String buffer object => " +str); // hello world

        StringBuilder sb1 = new StringBuilder();
        sb1.append("aditya");
        sb1.append(" pawar");
        String str1 = sb1.toString();
        System.out.println("String builder : "+ str1);
    }
}