package Java_Learning.funcMethod;

import java.util.Scanner;

//check prime number >= 2

public class prac10 {
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