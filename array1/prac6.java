package Java_Learning.array1;

import java.util.Scanner;

public class prac6 {
    // fun for binary search
    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;

        // comparison
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };

        System.out.print("Enter key : ");
        int key = sc.nextInt();

        if (binarySearch(arr, key) == -1) {
            System.out.println("No match found");
        } else {
            System.out.println("Key is at index : " + (binarySearch(arr, key)));
        }

        sc.close();
    }
}