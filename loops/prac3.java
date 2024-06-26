package Java_Learning.loops;

import java.util.Scanner;

//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

public class prac3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        // taking input of integers
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        // displaying integers
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        System.out.println();

        System.out.println("The sum of even integers is : " + evenSum);
        System.out.print("The sum of even integers is : " + oddSum);

        sc.close();

    }

}
