package Java_Learning.funcMethod;

import java.util.Scanner;

//to find product of two integers

public class prac4 {
    public static int product(int num1, int num2) {
        return (num1 * num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input of two numbers
        System.out.println("Enter integers to be multipled :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = product(a, b);
        System.out.println(a + " * " + b + " = " + product);

        sc.close();
    }
}