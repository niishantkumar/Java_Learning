package Java_Learning.funcMethod;

import java.util.Scanner;

//calc binary from decimal

public class prac13 {

    // func to calc bin from decimal
    public static void decToBin(int decimal) {
        int numReceived = decimal;
        int bin = 0;
        int pow = 0;

        while (decimal > 0) {

            bin += ((decimal % 2) * Math.pow(10, pow));

            decimal /= 2;
            pow++;
        }

        System.out.print("Binary of " + numReceived + " = " + bin);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input of decimal number
        System.out.print("Enter decimal number : ");
        int num = sc.nextInt();

        decToBin(num);

        sc.close();
    }
}