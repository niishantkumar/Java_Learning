package Java_Learning.patternI;

import java.util.Scanner;
/*
 12345
 1234
 123
 12
 1
 */

public class prac8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input of total lines
        System.out.print("Enter total lines in which pattern to be printed : ");
        int tLines = sc.nextInt();

        // loop to print pattern
        for (int line = 1; line <= tLines; line++) {
            for (int i = 1; i <= (tLines + 1 - line); i++) {
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
