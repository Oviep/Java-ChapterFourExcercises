package Exercises;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pass= 0;
        int failure= 0;
        int studentCounter= 1;

        while(studentCounter < 10) {
            System.out.print("Enter result (1 = pass, 2= fail): ");
            int result = input.nextInt();

            if(result == 1) {
                pass += 1;
            } else {
                failure += 1;
            }
            studentCounter++;
        }
        System.out.printf("Passed: %d%n Failed: %d%n", pass, failure);

        if(pass > 8) {
        System.out.println("Bonus to the instructor!");
    }
}
}
