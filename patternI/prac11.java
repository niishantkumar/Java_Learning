package Java_Learning.patternI;

import java.util.Scanner;
/*
    1
   212
  32123
 4321234
543212345
 */

public class prac11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input of total number of lines
        System.out.print("Enter number of lines in which pattern to be printed : ");
        int tLines = sc.nextInt();

        // loop for pattern
        for (int line = 1; line <= tLines; line++) {

            //counting of columns in lines
            int col = 0;

            //for digits in 2nd half
            int digiSecPart = 1;

            //for spaces
            for (int space = tLines - 1; space >= line; space--) {
                System.out.print(" ");
                col++;
            }

            //for digits
            for (int digits = (line * 2) - 1; digits >= 1; digits--) {
                col++;
                if (col > tLines) {
                    digiSecPart++;
                    System.out.print(digiSecPart);

                } else {
                    System.out.print(digits - line + 1);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
