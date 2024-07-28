package Java_Learning.TwoDArray;

//spiral output of 2D array
public class prac3 {
    // func to print in spiral form
    public static void spiralForm(int arr[][]) {
        int tRows = arr.length - 1;
        int tCols = arr[0].length - 1;

        int upperRow = 0;
        int lowerRow = arr.length - 1;
        int rowRelated_updation = 0;
        int rightCol = arr.length - 1;
        int leftCol = 0;
        int colRelated_updation = 1;
        int tElements = 0;

        while (tElements < ((tRows + 1) * (tCols + 1))) {
            // loop for upper row
            for (int i = rowRelated_updation; i <= tCols - rowRelated_updation; i++) {
                System.out.print(arr[upperRow][i] + " ");
                tElements++;
            }

            // loop for right col
            for (int i = colRelated_updation; i <= tRows - colRelated_updation; i++) {
                System.out.print(arr[i][rightCol] + " ");
                tElements++;
            }

            // loop for lower row
            for (int i = tCols - rowRelated_updation; i >= rowRelated_updation; i--) {
                System.out.print(arr[lowerRow][i] + " ");
                tElements++;
            }

            // loop for left row
            for (int i = tRows - colRelated_updation; i >= colRelated_updation; i--) {
                System.out.print(arr[i][leftCol] + " ");
                tElements++;
            }

            rowRelated_updation++;
            colRelated_updation++;
            upperRow++;
            lowerRow--;
            rightCol--;
            leftCol++;
        }

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4, 22 }, { 5, 6, 7, 8 , 23}, { 9, 10, 11, 12,24 }, { 13, 14, 15, 16,25 }, {17, 18, 19, 20, 21}};

        // displaying matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        spiralForm(matrix);
    }
}