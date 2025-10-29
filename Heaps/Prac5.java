package Java_Learning.Heaps;

//HeapSort (Ascending)

public class Prac5 {

    public static void heapify(int[] arr, int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxInd = i;

        if (left < size && arr[left] > arr[maxInd]) {
            maxInd = left;
        }
        if (right < size && arr[right] > arr[maxInd]) {
            maxInd = right;
        }

        if (maxInd != i) {
            // swap
            int temp = arr[i];
            arr[i] = arr[maxInd];
            arr[maxInd] = temp;

            heapify(arr, maxInd, size);
        }
    }

    public static void HeapSort(int arr[]) {
        int n = arr.length;

        // step 1 - build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // step 2 - extract elements one by one
        for (int i = n - 1; i > 0; i--) {
            // move current root (largest) to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call heapify on reduced heap
            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 3 };

        HeapSort(arr);

        // print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
