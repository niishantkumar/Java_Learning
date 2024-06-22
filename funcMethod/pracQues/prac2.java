package Java_Learning.funcMethod.pracQues;

import java.util.Scanner;

//Write a method named isEven that accepts an int argument.The method should return true if
//the argument is even,or false otherwise.Also write ap rogram to test your method.

public class prac2 {
    // func to check even or not
    public static boolean isEven(int num) {

        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input of integer
        System.out.print("Enter integer : ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }

        sc.close();
    }
}