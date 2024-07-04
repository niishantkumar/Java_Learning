package Java_Learning.loops;

import java.util.Scanner;

/*
You are given two numbers, A and B, where B >= A
Find the last digit of the answer B!/A! in integer form.
Note: B!/A! is guaranteed to be an integer as B >= A
*/

public class prac8 {

    // func to find factorial
    public static int factorial(int num) {
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    // func to find B!/A!
    public static int AFac_By_BFac(int a, int b) {
        int quotient = factorial(b) / factorial(a);

        int lastDigit = quotient % 10;

        return lastDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input of A & B
        System.out.println("Note : B>A");
        System.out.print("Enter B : ");
        int b = sc.nextInt();
        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.println("Last digit is : " + AFac_By_BFac(a, b));

        sc.close();
    }
}