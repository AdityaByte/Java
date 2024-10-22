// Question - what's the inner implementation of this keyword
// this keyword refers to the instance variable that belongs to the current object of the class.
// this keyword refers to instance variable and the parameter variable is the local variable which scope is at the function defination.

class something {
    int a = 12;  // Instance variable

    public void func(int a) {  // Method parameter `a` (local variable)
        System.out.println(this.a);  // Refers to the instance variable `a`
    }
}

public class Main {
    public static void main(String[] args) {
        something k = new something();
        k.func(10);  // Calls `func` with method parameter `a = 10`
    }
}