package Java_Learning.Backtracking.pracQues;

// Knight’s Tour

public class prac3 {
    // Function to print 2D array
    public static void print2dArr(int[][] board) {
        System.out.println("--------Knight moves------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Function to show knight move
    public static void knightMove(int[][] board, int n, int x, int y, int moveNum) {
        // Check if the current position is out of bounds or already visited
        if (x < 0 || x >= n || y < 0 || y >= n || board[x][y] != 0) {
            return;
        }

        // Mark the current square with the move number
        board[x][y] = moveNum + 1; // Store move number (1-based)

        // If all cells are visited, print the board and return
        if (moveNum == n * n - 1) {
            print2dArr(board);
            return; // Found a solution, exit
        }

        // Recurse for all possible knight moves
        knightMove(board, n, x - 2, y + 1, moveNum); // Move 1
        knightMove(board, n, x - 1, y + 2, moveNum); // Move 2
        knightMove(board, n, x + 1, y + 2, moveNum); // Move 3
        knightMove(board, n, x + 2, y + 1, moveNum); // Move 4
        knightMove(board, n, x + 2, y - 1, moveNum); // Move 5
        knightMove(board, n, x + 1, y - 2, moveNum); // Move 6
        knightMove(board, n, x - 1, y - 2, moveNum); // Move 7
        knightMove(board, n, x - 2, y - 1, moveNum); // Move 8

        // Backtrack: unmark the current square
        board[x][y] = 0;
    }

    // Main function
    public static void main(String[] args) {
        // Starting the knight’s tour from (0,0)
        int n = 8; // Size of the chessboard
        int[][] board = new int[n][n];
        knightMove(board, n, 0, 0, 0);
    }
}