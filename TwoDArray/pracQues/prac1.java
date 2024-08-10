package Java_Learning.TwoDArray.pracQues;

import java.util.Scanner;

//Print the number of 7’s that are in the 2D array

public class prac1 {
    // func to count occurance of 7
    public static int occurance_Seven(int arr[][], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key)
                    count++;
            }
        }
        return count;
    }

    // main func
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 0, col = 0;
        System.out.print("Enter no. of rows : ");
        row = sc.nextInt();
        System.out.print("Enter no. of cols : ");
        col = sc.nextInt();

        // input of array
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element at " + i + "," + j + " : ");
                arr[i][j] = sc.nextInt();
            }
        }

        int key;
        System.out.print("Enter number to be found : ");
        key = sc.nextInt();

        System.out.println(key + " occurs " + occurance_Seven(arr, key));
    }
}