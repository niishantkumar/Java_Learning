package Java_Learning.funcMethod.pracQues;

import java.util.Scanner;

//Write a Java method to compute the sum of the digits in an integer

public class prac4 {
    // func to compute sum of digits of an integer
    public static void sumDigitsOfInt() {
        Scanner sc = new Scanner(System.in);

        // taking input of integer
        System.out.print("Enter integer : ");
        int num = sc.nextInt();

        int numCopy = num;
        int sumDigitsOfInt = 0;

        // loop to sun digits
        while (num > 0) {
            sumDigitsOfInt += num % 10;
            num /= 10;
        }

        System.out.println("Sum of digits of " + numCopy + " = " + sumDigitsOfInt);
    }

    public static void main(String[] args) {
        sumDigitsOfInt();
    }
}