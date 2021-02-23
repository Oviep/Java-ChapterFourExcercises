package Exercises;

import java.util.Scanner;

public class FuelMileage {
    public static void main(String[] args) {
        int milesDriven;
        int gallonsUsed;
        boolean on = true;
        float total = 0;

        Scanner input = new Scanner(System.in);

        while(on) {
            System.out.print("Enter miles driven or -1 to quit: ");
            milesDriven = input.nextInt();
            if(milesDriven == -1) {
                on = false;
            } else{
                System.out.print("Enter gallons used or -1 to quit: ");
                gallonsUsed = input.nextInt();
                if(gallonsUsed == -1) {
                    on = false;
                } else{
                    System.out.printf("Miles per gallon: %.2f%n",(float)milesDriven/gallonsUsed);
                    total += (float)milesDriven/gallonsUsed;
                }
            }
        }
        System.out.printf("Miles per gallon for all trips = %.2f", total);


    }

}


