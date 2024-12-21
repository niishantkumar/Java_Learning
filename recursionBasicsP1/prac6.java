//to check if array is sorted

public class prac6 {

    // finc to check if arr is sorted
    public static boolean isSorted(int arr[], int n) {
        if (n == 0) {
            return true;
        }

        int a1 = arr[n];
        int a2 = arr[n - 1];

        if (a1 < a2) {
            return false;
        }

        return isSorted(arr, n-1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 3, 4, 5, 8 };

        int size = arr.length;

        if (isSorted(arr, size-1)) {
            System.err.println("Sorted");
        } else {
            System.err.println("Not sorted");
        }

    }
}