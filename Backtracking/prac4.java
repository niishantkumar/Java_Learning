package Java_Learning.Backtracking;

//n queen problem

public class prac4 {
    // to check if the place for queen is safe
    public static boolean isSafe(char board[][], int row, int col) {

        // vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonally left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonally right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;

    }

    // set queen
    public static void setQueen(char board[][], int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // loop for column
        for (int j = 0; j < board.length; j++) {

            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                setQueen(board, row + 1);
                board[row][j] = 'X'; // backtracking
            }

        }
    }

    // to print board
    public static void printBoard(char board[][]) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--+--+--+--+--");

    }

    // main func
    public static void main(String[] args) {
        int n = 5;

        char board[][] = new char[n][n];

        // setting default value
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }

        setQueen(board, 0);
    }

}