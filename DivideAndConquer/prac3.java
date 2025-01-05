package Java_Learning.DivideAndConquer;

// Randomised Quick Sort 
import java.util.*;

class RandomizedQsort {
    // This Function helps in calculating
    // random numbers between si and ei
    static void random(int arr[], int si, int ei) {

        Random rand = new Random();
        int pivot = rand.nextInt(ei - si) + si;

        // swap
        int temp = arr[pivot];
        arr[pivot] = arr[ei];
        arr[ei] = temp;
    }

    static int partition(int arr[], int si, int ei) {
        // pivot is chosen randomly
        random(arr, si, ei);
        int pivot = arr[ei];

        int i = (si - 1); // index of smaller element

        for (int j = si; j < ei; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;
    }

    static void quickSort(int arr[], int si, int ei) {
        if (si < ei) {

            int pi = partition(arr, si, ei);

            quickSort(arr, si, pi - 1);
            quickSort(arr, pi + 1, ei);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver Code
    public static void main(String args[]) {
        int arr[] = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array");
        printArray(arr);
    }
}