package Java_Learning.funcMethod;

import java.util.Scanner;

//check prime number >= 2

public class prac11 {
    public static boolean isPrime(int num) {

        if (num == 2) {
            return true;
        }

        // loop to check prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter range :");
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime.");
            }
        }

        sc.close();
    }
}