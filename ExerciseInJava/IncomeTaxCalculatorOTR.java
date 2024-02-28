// Calculating Income Tax according to the old tax regime OTR

import java.util.Scanner;

class IncomeTaxCalculator{
    public void calculateTax(){
        Scanner s = new Scanner(System.in);
        System.out.print("Income (per annum)=> ");
        try {
            long incomeValue = s.nextLong();
            // now the main works begin
            if (incomeValue <= 250000) {
                System.out.println("Congrats buddy you have to pay no tax");
            } else if (incomeValue > 250000 && incomeValue <= 500000) {
                // Calculation begins
                double calc1 = incomeValue - 250000;
                double calc2 = calc1 / 20;
                if (calc2 < 12500) {
                    System.out.println("Your tax is " + calc2 + " but it is smaller than the rebate amount 12,500 \nso you have to pay no tax on it ");
                } else {
                    System.out.println("You have to pay => " + calc2);
                }
            } else if (incomeValue > 500000 && incomeValue <= 1000000) {
                // Calculation begins
                double c1 = incomeValue - 500000;
                double c2 = c1 / 5;
                double c3 = c2 + 12500;
                double c4 = (c3 * 4) / 100;
                double c5Final = c3 + c4;
                System.out.println("You have to pay -> " + c5Final + " including the 4% health and Education cess");
            } else if (incomeValue > 1000000) {
                //Calculation begins
                double calculation1 = incomeValue - 1000000;
                double calculation2 = (calculation1 * 30) / 100;
                double calculation3 = calculation2 + 100000 + 12500;
                double calculation4 = (calculation3 * 4) / 100;
                double calculation5Final = calculation3 + calculation4;
                System.out.println("Your income is \nIncome = " + incomeValue + " \n so you have to pay \n TAX = " + calculation5Final + " \n as per old tax regime");
            }
        } catch (Exception e){
            System.out.println("The user have entered a wrong data type rather than integer");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        IncomeTaxCalculator obj = new IncomeTaxCalculator();
        obj.calculateTax();
    }
}
