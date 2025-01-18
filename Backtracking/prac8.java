package Java_Learning.Backtracking;

// Sudoku Solver using Backtracking
public class prac8 {
    // Function to check if placing the digit is valid
    public static boolean confirmNum(int[][] board, int digit, int row, int col) {
        // Check in the row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == digit) {
                return false;
            }
        }

        // Check in the column
        for (int j = 0; j < 9; j++) {
            if (board[j][col] == digit) {
                return false;
            }
        }

        // Check in the 3x3 box
        int tempRow = (row / 3) * 3;
        int tempCol = (col / 3) * 3;
        for (int i = tempRow; i < tempRow + 3; i++) {
            for (int j = tempCol; j < tempCol + 3; j++) {
                if (board[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    // Function to solve Sudoku using backtracking
    public static boolean solSudoku(int[][] board, int row, int col) {
        // If we've filled all rows, the board is solved
        if (row == 9) {
            return true;
        }

        // go to the next row if we're at the last column
        if (col == 9) {
            return solSudoku(board, row + 1, 0);
        }

        // Skip the already filled cells
        if (board[row][col] != 0) {
            return solSudoku(board, row, col + 1);
        }

        // Try placing numbers 1-9 in the empty cell
        for (int num = 1; num <= 9; num++) {
            if (confirmNum(board, num, row, col)) {
                // Place the number if valid
                board[row][col] = num;

                // Recurse to the next cell
                if (solSudoku(board, row, col + 1)) {
                    return true;
                }

                // If placing num didn't solve the puzzle, backtrack by resetting the cell
                board[row][col] = 0;
            }
        }

        // If no number from 1-9 can be placed, return false (backtrack)
        return false;
    }

    // Function to print the Sudoku board
    public static void printBoard(int[][] board) {
        System.out.println("--------Sudoku---------");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        int board[][] = {
            { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
            { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
            { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
            { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
            { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
            { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
            { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
            { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
            { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };

        // Call the solver function starting from row 0, column 0
        if (solSudoku(board, 0, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
