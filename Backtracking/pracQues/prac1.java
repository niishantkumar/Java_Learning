package Java_Learning.Backtracking.pracQues;

// Rat in a Maze Problem using Backtracking
public class prac1 {

    // Function to print the solution matrix
    public static void printSolution(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to check if a cell (x, y) is safe to move into
    public static boolean isSafe(int maze[][], int x, int y) {
        // Check if (x, y) is within the bounds of the maze and is a valid cell (1)
        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
    }

    // Function to solve the maze using backtracking
    public static boolean solveMaze(int maze[][]) {
        int N = maze.length;
        int sol[][] = new int[N][N];  // Create a solution matrix

        // Start from the top-left corner (0, 0)
        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.print("Solution doesn't exist");
            return false;  // No solution exists
        }

        printSolution(sol);  // If solution exists, print the solution matrix
        return true;
    }

    // Utility function to solve the maze problem
    public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
        // Base case: if (x, y) is the destination cell (bottom-right corner)
        if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        // Check if maze[x][y] is a valid and safe cell
        if (isSafe(maze, x, y) == true) {
            // Mark the current cell as part of the solution path
            if (sol[x][y] == 1)
                return false;

            sol[x][y] = 1;

            // Move forward in the x direction (down)
            if (solveMazeUtil(maze, x + 1, y, sol))
                return true;

            // If moving down doesn't work, move right
            if (solveMazeUtil(maze, x, y + 1, sol))
                return true;

            // If neither forward nor right works, backtrack
            sol[x][y] = 0;
            return false;
        }

        return false;  // If the current cell is not valid
    }

    public static void main(String args[]) {
        int maze[][] = {
            { 1, 0, 0, 0 },
            { 1, 1, 0, 1 },
            { 0, 1, 0, 0 },
            { 1, 1, 1, 1 }
        };

        solveMaze(maze);
    }
}
