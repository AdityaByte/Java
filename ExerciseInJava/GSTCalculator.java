// GST calculator as per the old gst rates
// Save this file as main.java

import java.util.Scanner;
class GSTCalculator{

    static Scanner s = new Scanner(System.in);
    public void gstCalculatorMethod(){
        try{
            System.out.print("Enter the amount => ");
            double itemValue = s.nextInt();
            System.out.println("Select the rate slab -> \nPress 1 -> 5% \nPress 2 -> 12% \nPress 3 -> 18% \nPress 4 -> 28% ");
            System.out.print("Rate = ");
            byte slab = s.nextByte();
            switch (slab){
                case 1 -> {
                    double gst1 = (itemValue * 5) / 100;
                    System.out.println("GST => " + gst1 + " Rs");
                    System.out.println("NET PRICE => " + (itemValue + gst1) + " Rs");
                    break;
                }
                case 2 -> {
                    double gst2 = (itemValue * 12) / 100;
                    System.out.println("GST => " + gst2 + " Rs");
                    System.out.println("NET PRICE => " + (itemValue + gst2) + " Rs");
                    break;
                }
                case 3 -> {
                    double gst3 = (itemValue * 18) / 100;
                    System.out.println("GST => " + gst3 + " Rs");
                    System.out.println("NET PRICE => " + (itemValue + gst3) + " Rs");
                    break;
                }
                case 4 -> {
                    double gst4 = (itemValue * 28) / 100;
                    System.out.println("GST => " + gst4 + " Rs");
                    System.out.println("NET PRICE => " + (itemValue + gst4) + " Rs");
                    break;
                }
                default -> {
                    System.out.println("Please enter the given value as per the given rate slab context");
                }
            }
            System.out.println("Note ->  for better info visit this site \"https://groww.in/p/tax/gst-rates\"");
        }catch (Exception e){
            System.out.println("The user have entered a wrong data type");
        }
    }
}

public class Main{
    public static void main(String[] args) {
        GSTCalculator obj = new GSTCalculator();
        obj.gstCalculatorMethod();
    }
}
