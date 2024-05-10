// Interface in Java - 
/*
 * Few things we need to remember about interfaces - 
 * -> In english we can refer interface as the common point where 2 or more than 2 systems/connections meet
 * -> But in java interface is a group of related methods
 * 1) Interfaces are similar to the classes
 * 2) we can implement more than 1 interface to a class
 * 3) we have to implement(Keyword) a interface rather than inherit it(extends)
 * 4) The class which implements the interface should contains all the methods which are present in the interface
 * 5) The class which implements the interface should make all the pre-existed methods inside interface public - jab methods ko body dete hai in simple words
 * 6) we can't make a public interface in a java file which has already public class because a java file should only contains only one public class
 */


interface Speed{
    void minimumSpeed(int mins);
    void maximumSpeed(int maxs);
}

interface Interior{
    public void interior();
}

// public interface OtherInterface{
    // This throws an error - reason is explained in 6 point
// }

class KiaSonet implements Speed,Interior{
    public void minimumSpeed(int min){
        System.out.println("kia sonet has the minimum speed of "+ min);
    }

    public void maximumSpeed(int max){
        System.out.println("kia sonet has the maximum speed of "+ max);
    }

    public void interior(){
        System.out.println("kia sonet has leather interior");
    }
}

public class InterfacesInJava {
    public static void main(String[] args) {
        KiaSonet obj = new KiaSonet();
        obj.minimumSpeed(40);
        obj.maximumSpeed(300);
        obj.interior();
    }
}
