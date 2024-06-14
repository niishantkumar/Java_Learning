package Java_Learning.loops;

import java.util.Scanner;

//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

public class prac4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        int sumAllElements = 0;
        // taking input of integers
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
            sumAllElements += arr[i];
        }

        // displaying integers
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        int evenSum = 0;
        

        //sum of even
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            }
           
        }
        int oddSum = sumAllElements - evenSum;

        System.out.println();

        System.out.println("The sum of even integers is : " + evenSum);
        System.out.print("The sum of even integers is : " + oddSum);

        sc.close();

    }

}

