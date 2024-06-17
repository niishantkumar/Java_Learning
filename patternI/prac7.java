package Java_Learning.patternI;

import java.util.Scanner;
/*
   *
  **
 ***
****
 */

public class prac7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input of total number of lines in which pattern to be printed
        System.out.print("enter number of lines : ");
        int tLines = sc.nextInt();

        // loop to print pattern
        for (int line = 1; line <= tLines; line++) {
            for (int j = tLines; j > line; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= line; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

}
