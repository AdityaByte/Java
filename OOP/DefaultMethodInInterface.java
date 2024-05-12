// Interfaces example and default method in interface
// Like we are creating some features and cellphone is the parent class of smartphone

// default method in interface - if we make a method in the interface then it be a abstract method so we have to give the body
// to the method which implements the method we dont want to give body to each class which implements it so we define default methods in it like --

// Interface -
interface Camera{
    void takePicture();
    void openGallery();

    // we can also define a private method to the interface if the logic is too big we can make a private method also we the user can't access it all
    private void greet(){
        System.out.println("good afternoon....");
    }

    default void shutterSound(){
        // we can use the private method here
        greet();
        System.out.println("clicks clicks......");
    }
}

// Another interface
interface Wifi{
    void connectToNetwork();
    void showNetworks(String networks[]);
}

class CellPhone{
    public void call(long number){
        System.out.println("calling to... " + number);
    }

    public void showBattery(){
        System.out.println("Battery percentage is 49%");
    }
}

class SmartphoneClass extends CellPhone implements Camera, Wifi{
    public void takePicture(){
        System.out.println("taking picture say cheese.......");
    }

    public void openGallery(){
        System.out.println("Opening gallary");
    }

    public void showNetworks(String networks[]){
        for(String network : networks){
            System.out.println(network);
        }
    }

    public void connectToNetwork(){
        System.out.println("connecting......");
    } 
}

public class DefaultMethodInInterface{
    public static void main(String[] args) {
        SmartphoneClass obj = new SmartphoneClass();
        obj.openGallery();
    }
}