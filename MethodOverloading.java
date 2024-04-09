// Method Overloading in java

public class MethodOverloading{

    static String func(){
        return "Hello world";
    }
    static String func(String name){
        return "hello " +name;
    }
    static int func(int a){
        return a;
    }
    static int func(int a, int b){
        return a+b;
    }

    // but we can't do this
    /*
    static void func(int a){
        System.out.println("gives an error");
    }
     */

    public static void main(String[] args) {
        // this is methodOverloading in java
        System.out.println(func());
        System.out.println(func("aditya"));
        System.out.println(func(100));
        System.out.println(func(100,200));
    }
}
