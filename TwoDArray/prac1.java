package Java_Learning.TwoDArray;

import java.util.Scanner;

//creation of 2D Array

public class prac1 {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        int rows = matrix.length;
        int cols = matrix[0].length;

        // taking input of matrix elements
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at index ("+i+","+j+") : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // displaying matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
