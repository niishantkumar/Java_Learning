package Java_Learning.funcMethod;
import java.util.Scanner;

// func to take input and display sum of two integers

public class prac1 {

    public static void sum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();

        sc.close();

        System.out.println("Their sum is : " + (num1 + num2));
    }

    public static void main(String[] args) {
        sum();
    }
}
