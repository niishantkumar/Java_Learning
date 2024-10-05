package Java_Learning.recursionBasicsP1;

//print nth fibonacci number

public class prac5 {

    // recursive func to print nth fibonacci number
    public static int calc_Fibonacci(int num) {

        if (num == 0 || num == 1) {
            return num;
        }

        int f2 = calc_Fibonacci(num - 2);
        int f1 = calc_Fibonacci(num - 1);

        return (f1 + f2);

    }

    public static void print_Fibonacci(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(calc_Fibonacci(i) + " ");
        }
    }

    // main func
    public static void main(String[] args) {

        print_Fibonacci(5);

    }
}