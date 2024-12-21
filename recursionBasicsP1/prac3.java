import java.util.Scanner;

//to find factorial of a number

public class prac3 {

    // func to find factorial of a number
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        return (fact(n - 1) * n);
    }

    // main func
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to find factorial : ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is : " + fact(n));

        sc.close();
    }

}