package Java_Learning.patternI;

import java.util.Scanner;
/*
    1
   212
  32123
 4321234
543212345
 */

public class prac12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input of total number of lines
        System.out.print("Enter number of lines in which pattern to be printed : ");
        int tLines = sc.nextInt();

        // loop to print pattern
        for (int line = 1; line <= tLines; line++) {
            // for space
            for (int space = tLines; space > line; space--) {
                System.out.print(" ");
            }

            // for digits in 1st half
            for (int digit = line; digit >= 1; digit--) {
                System.out.print(digit);
            }

            // for digit in 2nd half
            for (int digit = 2; digit <= line; digit++) {
                System.out.print(digit);
            }
            System.out.println();
        }
        sc.close();
    }
}
