package Java_Learning.DivideAndConquer;

//merge sort

public class prac1 {

    // func for merge sort
    public static void mergeSort(int arr[], int si, int ei) {

        // base case
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid); // for left part
        mergeSort(arr, mid + 1, ei); // for right part
        merge(arr, si, mid, ei);
    }

    // func to merge sorted array
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];

        int i = si; //iterator for left part
        int j = mid + 1; //iterator for right part
        int k = 0; //iterator for temp

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        //for leftover left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        //for leftover right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //for copying from temp to arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 23, 1, 4, 6, 6, 2, 7, 8, 3, 2, 6 };

        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}