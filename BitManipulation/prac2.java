package Java_Learning.BitManipulation;

import java.util.Scanner;

//to check if num is even or odd

public class prac2 {
    // func to check even or odd
    public static void evenOdd(int num) {

        if ((num & 1) == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    // main func
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        evenOdd(num);

        sc.close();
    }

}