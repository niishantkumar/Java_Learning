package Java_Learning.loops;

import java.util.Scanner;

//to chaeck if prime or not

public class prac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check whether prime or not : ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.print("Invalid input");
        } else if (num == 0 || num == 1) {
            System.out.print("Neither prime nor composite.");
        } else {
            int flag = 0;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag++;
                }
                if (flag > 0) {
                    break;
                }
            }

            if (flag > 0) {
                System.out.print(num + " is not a prime number");
            } else {
                System.out.print(num + " is a prime number");
            }
        }

        sc.close();

    }
}