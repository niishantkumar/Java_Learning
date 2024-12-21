package Java_Learning.recusionBP1;

public class prac11 {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPowSq = pow(x, n / 2) * pow(x, n / 2);

        /*
         * int halfPow = pow(x, n/2);
         * int halfPowSquare = halfPow * halfPow;
         */

        if (n % 2 != 0) {
            halfPowSq = halfPowSq * x;
        }

        return halfPowSq;
    }

    public static void main(String[] args) {
        System.out.println("5^3 = " + pow(5, 3));
    }
}