package Java_Learning.TwoDArray;

public class prac5 {
    // func to print matrix in spiral
    public static void matrix_SpiralPrint(char matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // upper row
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }

            // right col
            for (int i = startRow + 1; i < endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // lower row
            for (int i = endCol; i >= startCol; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][i] + " ");
            }

            // left col
            for (int i = endRow - 1; i > startRow; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String[] args) {
        char matrix[][] = { { 'H', 'E', 'L', 'L', 'O' }, { 'W', 'O', 'R', 'L', 'W' }, { 'O', 'L', 'O', 'D', 'O' }, { 'L', 'L', 'E', 'H', 'R' },
                { 'L', 'E', 'H', 'D', 'L' } };

        System.out.println();

        // displaying matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        matrix_SpiralPrint(matrix);
    }

}
