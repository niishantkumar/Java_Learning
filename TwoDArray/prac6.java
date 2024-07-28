package Java_Learning.TwoDArray;

//sum of diagonal of a matrix

public class prac6 {
    // func to print diagonal sum
    public static void diagonalSum(int matrix[][]) {

        int startRow = 0, startCol = 0;
        int endRow = matrix.length - 1;

        // sum of primary diagonal
        int sum = 0;
        while (startRow <= endRow) {
            sum += matrix[startRow][startCol];
            startRow++;
            startCol++;
        }
        System.out.println("Sum of primary diagonal = " + sum);

        // sum of secondary diagonal
        sum = 0;
        startRow = 0;
        startCol = matrix[0].length - 1;
        while (startCol >= 0) {
            sum += matrix[startRow][startCol];

            startCol--;
            startRow++;
        }
        System.out.println("Sum of secondary diagonal = " + sum);

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };

        System.out.println("Your matrix is :");
        // displaying matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        diagonalSum(matrix);
    }

}
