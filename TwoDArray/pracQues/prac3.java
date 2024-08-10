package Java_Learning.TwoDArray.pracQues;

//Write a program to FindTransposeofa Matrix

public class prac3 {
    // func for displaying mat
    public static void printMat(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // func for transpose of matrix
    public static void transpose(int arr[][]) {

        int row = arr.length, col = arr[0].length;

        int trans[][] = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                trans[i][j] = arr[j][i];
            }
        }

        printMat(trans);
    }

    // main func
    public static void main(String[] args) {
        int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };

        // displaying matrix
        System.out.println("Actual matrix :");
        printMat(nums);

        // displaying transpose
        System.out.println("Transpose matrix :");
        transpose(nums);
    }
}