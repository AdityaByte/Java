// Dynamic method dispatch
/*
Few things we need to remember -
1) Object is created at runtime 
filename.java ------> compile ----> filename.class ----> interpret --> machine code means it is running (runtime)
2) Dynamic method dispatch helps us to learn about how overriden method is resolved at runtime instead of compile time.
3) Its an important concept for learning how java implements runtime polymorphism
*/

class Phone{
    public void showTime(){
        System.out.println("the time is 9:09 pm");
    }
    public void lock(){
        System.out.println("Your phone is locked - superclass");
    }
}

class SmartPhone extends Phone{
    @Override
    public void lock(){
        System.out.println("Your phone is locked - subclass");
    }
    
    public void music(){
        System.out.println("Playing music");
    }
}

public class Main{
    public static void main(String args[]){
        Phone obj = new SmartPhone();
        //obj.lock(); // run
        //obj.showTime(); // run
        //obj.music(); // it gives an error
        
        SmartPhone obj1 = new SmartPhone();
        obj1.showTime();
        obj1.lock(); // It runs the overrided method of subclass bcz object -> subclass
        obj1.music();
        
        //SmartPhone obj2 = new Phone(); // it gives an error
        
    }
}
