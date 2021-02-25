package Exercises;

public class PatternOfAsterisks {
    public static void main(String[] args) {
        int row = 0;
        while(row < 8){
            if (row % 2 == 1){
                System.out.print(" ");
            }
            int column = 0;
            while(column < 8) {
                System.out.print("* ");
                column++;
            }
            System.out.println();
            row++;
        }
    }
}
