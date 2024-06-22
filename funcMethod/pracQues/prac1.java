package Java_Learning.funcMethod.pracQues;

import java.util.Scanner;

//Write a Java method to compute the average of three numbers

public class prac1 {
    // average of three num
    public static void avgThreeNum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers :");
        float num1 = sc.nextInt();
        float num2 = sc.nextInt();
        float num3 = sc.nextInt();

        sc.close();

        System.out.println("Avg = " + ((num1 + num2 + num3) / 3));
    }

    public static void main(String[] args) {
        avgThreeNum();
    }
}