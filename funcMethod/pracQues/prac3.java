package Java_Learning.funcMethod.pracQues;

import java.util.Scanner;

/*
Write a Java program to check if a number is a palindrome in Java
(121 is a palindrome, 321 is not)
*/

public class prac3 {
    // func to reverse number
    public static int revNum(int num) {
        int revNum = 0;
        int rem;

        while (num > 0) {

            rem = num % 10;
            revNum = revNum * 10 + rem;
            num /= 10;
        }
        return revNum;
    }

    public static void isPalidrome(int num){
        if (num == revNum(num)) {
            System.out.print(num+" is a palidrome");
        }else{
            System.out.print(num+" is not a palidrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input of number
        System.out.println("Enter number : ");
        int num = sc.nextInt();

        isPalidrome(num);

        sc.close();
    }
}