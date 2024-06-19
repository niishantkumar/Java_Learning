package Java_Learning.funcMethod;
import java.util.Scanner;

//func to display sum of two integers passed as parameters

public class prac2 {

    public static void sum(int num1, int num2){
        int sum = num1+num2;
        System.out.print("The sum is : "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input of integers for sum
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        System.out.print("Enter number : ");
        int b = sc.nextInt();

        //calling func
        sum(a, b);

        sc.close();
    }
}