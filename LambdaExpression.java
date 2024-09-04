//One issue with anonymous classes is that if the implementation of your anonymous class is very simple, 
//such as an interface that contains only one method, then the syntax of anonymous classes may seem unwieldy and unclear. 
//In these cases, you're usually trying to pass functionality as an argument to another method, 
//such as what action should be taken when someone clicks a button. 
//Lambda expressions enable you to do this, to treat functionality as method argument, or code as data.

@FunctionalInterface
interface Demo{
    void meth1(String name);
}

public class LambdaExpression{
    public static void main(String args[]){
        Demo obj = (name)->{System.out.println("hellow world " + name);};
        obj.meth1("aditya  pawar");
    }
}
