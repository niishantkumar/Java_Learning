package Java_Learning.Backtracking.pracQues;

//rat problem
//prefered

public class prac4 {
    // print 2D array
    public static void print(int[][] array) {
        System.out.println("\n-----Path------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // func to find path
    public static void path(int[][] maze, int n, int x, int y, int[][] sol) {
        // base case
        if (x < 0 || y < 0 || x >= n || y >= n) {
            return;
        }

        if (maze[x][y] == 0 || sol[x][y] == 1) {
            return;
        }

        if (x == n-1 && y == n-1) {
            sol[x][y] = 1;
            print(sol);
        }

        sol[x][y] = 1;

        // moves
        path(maze, n, x + 1, y, sol);
        path(maze, n, x - 1, y, sol);
        path(maze, n, x, y + 1, sol);
        path(maze, n, x, y - 1, sol);

        // backtrack
        sol[x][y] = 0;

    }

    // main func
    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
        int n = maze.length;
        int sol[][] = new int[n][n];

        path(maze, n, 0, 0, sol);

    }

}