package Java_Learning.loops;

import java.util.Scanner;

//Write a program to find the factorialof any number entered by the user

public class prac5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find factorial : ");
        int num = sc.nextInt();

        int fac = 1;

        if (num < 0) {
            System.out.print("Factorial of negative number does not exist");
        } else if (num == 0 || num == 1) {
            System.out.print("Factorial of " + num + " is : 1");
        } else {
            for (int i = 2; i <= num; i++) {
                fac *= i;
            }
            System.out.println("Factorial of " + num + " is : " + fac);
        }

        sc.close();

    }

}
