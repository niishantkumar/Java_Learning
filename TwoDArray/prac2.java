package Java_Learning.TwoDArray;

//bin search in 2D array

import java.util.Scanner;

public class prac2 {
    // func for bin search
    public static int[] binSearch(int matrix[][], int key) {

        // loop for searching
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    return new int[] { i + 1, j + 1 };
                }

            }
        }
        return new int[] { -1 };
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        int rows = matrix.length;
        int cols = matrix[0].length;

        // taking input of matrix elements
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at index (" + i + "," + j + ") : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Your Matrix is :");
        // displaying matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        // taking input of key
        System.out.print("Enter element to be searched : ");
        int key = sc.nextInt();

        sc.close();

        if (binSearch(matrix, key)[0] == -1) {
            System.out.println("Not Found !");
        } else {
            System.out
                    .println("Element found at index : " + binSearch(matrix, key)[0] + "," + binSearch(matrix, key)[1]);
        }
    }
}
