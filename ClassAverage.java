package Exercises;
import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        counter-controlled statement execution
//        int total = 0;
//        int gradeCounter = 1;
//
//        while (gradeCounter <= 10) {
//            System.out.println("Enter grade");
//            int grade = input.nextInt();
//            total += grade;
//            gradeCounter++;
//        }
//
//        int average = total/10;
//        System.out.printf("%n Total of all ten grades is %d%n", total);
//        System.out.printf("Class average is %d%n", average);

//          Sentinel controlled execution

            int total = 0;
            int gradeCounter = 0;

        System.out.print("Enter grade or -1 to quit");
        int grade = input.nextInt();

        while(grade != -1) {
            total += grade;
            gradeCounter++;

            System.out.print("Enter grade or -1 to quit");
             grade = input.nextInt();
        }

        if (grade != 0) {
            double average = (double) total/gradeCounter;

            System.out.printf("%nTotal of the %d grades entered is %d%n",gradeCounter, total);
            System.out.printf("Class total is: %.2f%n", average);
        } else {
            System.out.println("No grades were entered");
        }


    }
}
