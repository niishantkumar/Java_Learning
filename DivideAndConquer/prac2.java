package Java_Learning.DivideAndConquer;

//Quick sort

public class prac2 {
    // func for quick sort
    public static void quickSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        // last element
        int pivotInd = partition(arr, si, ei);
        quickSort(arr, si, pivotInd - 1); // for left part
        quickSort(arr, pivotInd + 1, ei); // for right part
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for elements smaller than pivot
        int temp; // for swapping

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;

                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;

        temp = pivot; // this line is not necessary but using temp is not wrong and can sometimes make
                      // the logic easier to follow, especially for debugging or understanding the
                      // code in larger contexts.
        arr[ei] = arr[i];
        arr[i] = pivot;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 23, 1, 4, 6, 6, 2, 7, 8, 3, 2, 6 };

        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}