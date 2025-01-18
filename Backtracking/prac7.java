package Java_Learning.Backtracking;

//grid ways

public class prac7 {
    // func to find total ways to reach destination
    public static int gridWays(int x, int y, int n, int m) {
        if (x == n - 1 || y == m - 1) {
            return 1;
        } else if (x == n || y == m) {
            return 0;
        }

        int w1 = gridWays(x + 1, y, n, m);
        int w2 = gridWays(x, y + 1, n, m);

        return w1 + w2;
    }

    // main func
    public static void main(String[] args) {
        int m = 3, n = 3;

        System.out.println("Total ways : " + gridWays(0, 0, m, n));
    }

}