package Java_Learning.loops;

import java.util.Scanner;

//Write a program to print the multiplication table of a number N,entered by the user

public class prac6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to display table : ");
        byte num = sc.nextByte();

        System.out.println("Table of " + num + " :");
        for (byte i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
        sc.close();

    }
}
