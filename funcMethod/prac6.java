package Java_Learning.funcMethod;

import java.util.Scanner;

/*
binomial coefficient = n! / (r!(n-r)!)
*/

public class prac6 {

    // fun to return factorial
    public static int factorial(int num) {
        int factorial = 1;

        // loop to calc factorial
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // func to return bin coefficient
    public static int binCoefficient(int numerator, int denominator1, int denominator2) {

        int binCoefficient = numerator / (denominator1 * denominator2);

        return binCoefficient;
    }

    //main func
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input of n and r
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter value of r : ");
        int r = sc.nextInt();

        //calling finc binFactorial
        int binCoefficient = binCoefficient(factorial(n), factorial(r), factorial(n - r));

        System.out.print("The binomial factor is : " + binCoefficient);

        sc.close();
    }
}