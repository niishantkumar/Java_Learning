package Java_Learning.funcMethod;

import java.util.Scanner;

//factorial of a number

public class prac5 {
    public static int factorial(int num) {
        int factorial = 1;

        // loop to calc factorial
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input of number
        while (true) {
            System.out.print("Enter number : ");
            int num = sc.nextInt();

            //as factorial of negative number does not exist
            if (num < 0) {
                char choice;
                System.out.print("Number entered is invalid. Do you want to try again(y/n) : ");
                choice = sc.next().charAt(0);
                if (choice == 'y') {
                    continue;
                } else {
                    break;
                }
            }
            //calling of func
            else{
                System.out.print(num+"! = "+factorial(num));
                break;
            }
        }
        sc.close();
    }
}