package Java_Learning.patternI;

import java.util.Scanner;

/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
*/

public class prac13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // tatal number of lines
        System.out.print("Enter number of lines : ");
        int tLines = sc.nextInt();

        // loop to print
        for (int line = 1; line <= tLines; line++) {
            // for space loop
            for (int space = tLines; space > line; space--) {
                System.out.print(" ");
            }

            // for digits
            for (int digit = 1; digit <= line; digit++) {
                System.out.print(line + " ");
            }
            System.out.println();
        }
    }
}