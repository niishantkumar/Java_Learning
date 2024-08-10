package Java_Learning.TwoDArray;

import java.util.Scanner;

//searching in a 2D array

public class prac8 {
    // func for searching from up to down
    public static void staircaseSearch(int arr[][], int key) {
        int row = 0, col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("Found at " + row + "," + col);
                break;
            } else if (arr[row][col] > key) {
                col--;
            } else {
                row++;
            }
        }
    }

    // func for searching from down to up
    public static void staircaseSearch2(int arr[][], int key) {
        int row = arr.length - 1, col = 0;

        while (row >= 0 && col < arr[0].length) {
            if (arr[row][col] == key) {
                System.out.println("Found at " + row + "," + col);
                break;
            } else if (arr[row][col] > key) {
                row--;
            } else {
                col++;
            }
        }
    }

    // main func
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        // taking input of key to be searched
        int key;
        System.out.print("Enter key : ");
        key = sc.nextInt();

        staircaseSearch2(arr, key);

        sc.close();
    }
}