package Java_Learning.recusionBP2;

//tiling problem

public class prac2 {
    // recursive func for counting number of ways tiling can be done
    public static int countWays(int n) {

        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {

        System.out.println(countWays(4));

    }
}