package Java_Learning.funcMethod;

import java.util.Scanner;

//check prime number

public class prac9 {
    public static boolean isPrime(int num) {

        if (num == 1) {
            return false;
        }

        // loop to check prime
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.print(number + " is prime.");
        } else {
            System.out.println("Not prime.");
        }

        sc.close();
    }
}