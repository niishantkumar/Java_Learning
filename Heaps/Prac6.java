package Java_Learning.Heaps;

//HeapSort (Descending)

public class Prac6 {

    public static void heapify(int[] arr, int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int minInd = i;

        // For descending order → build a MIN heap
        if (left < size && arr[left] < arr[minInd]) {
            minInd = left;
        }
        if (right < size && arr[right] < arr[minInd]) {
            minInd = right;
        }

        if (minInd != i) {
            // swap
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;

            heapify(arr, minInd, size);
        }
    }

    public static void HeapSortDescending(int arr[]) {
        int n = arr.length;

        // step 1 - build MIN heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // step 2 - extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            // move current root (smallest) to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // heapify reduced heap
            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 3 };

        HeapSortDescending(arr);

        // print sorted array (descending order)
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
