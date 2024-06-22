package Java_Learning.funcMethod;

import java.util.Scanner;

//to calculate binary to decimal

public class prac12 {

    // func to calculate bin to decimal
    public static int binToDeci(int num) {
        int decimal = 0;
        int power = 0;

        while (num != 0) {
            decimal += ((num % 10) * Math.pow(2, power));
            num /= 10;
            power++;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input of bin number
        System.out.print("Enter binary number : ");
        int num = sc.nextInt();

        System.out.println("Decimal of " + num + " = " + binToDeci(num));

        sc.close();
    }
}