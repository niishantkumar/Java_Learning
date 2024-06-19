package Java_Learning.funcMethod;
import java.util.Scanner;

//func to return sum of two integers passed as parameters

public class prac3 {
    public static int sum(int num1, int num2){
        return (num1+num2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input of integers
        System.out.print("Enter integer : ");
        int a = sc.nextInt();
        System.out.print("Enter integer : ");
        int b = sc.nextInt();

        int sum = sum(a, b);
        System.out.println("The sum is : "+sum);

        sc.close();
    }
}
