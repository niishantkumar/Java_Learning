package Java_Learning.TwoDArray;

import java.util.Scanner;

//searching in a 2D array

public class prac8 {
    // func for searching
    public static void staircaseSearch(int arr[][], int key) {
        int row = 0, col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("Found at " + row + "," + col);
                break;
            } 
            else if (arr[row][col] > key) {
                col--;
            }
            else {
                row++;
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

        staircaseSearch(arr, key);

        sc.close();
    }
}