package Java_Learning.DivideAndConquer.pracQues;

// Apply Merge sort to sort an array of Strings.

// (Assume that all the characters in all the Strings are in lowercase). (EASY)

public class prac3 {
    // merge sort
    public static void mergeSort(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    // func for merge
    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];

        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp
        int l = 0; // iterator for comparing characters

        while (i <= mid && j <= ei) {
            while (l < arr[i].length() && l < arr[j].length() && arr[i].charAt(l) == arr[j].charAt(l)) {
                l++; // move the character index as long as they are equal
            }

            if (l < arr[i].length() && l < arr[j].length()) {
                // If arr[i].charAt(l) < arr[j].charAt(l)
                if (arr[i].charAt(l) < arr[j].charAt(l)) {
                    temp[k++] = arr[i++];
                } else {
                    temp[k++] = arr[j++];
                }
            } else {
                // If one of the strings is exhausted, we should consider the other one
                if (arr[i].length() < arr[j].length()) {
                    temp[k++] = arr[i++];
                } else {
                    temp[k++] = arr[j++];
                }
            }
            l = 0; // Reset l after each comparison
        }

        // leftover left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // leftover right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy to original arr
        for (i = 0, j = si; i < k; i++, j++) {
            arr[j] = temp[i];
        }
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };

        // sorting of arr
        mergeSort(arr, 0, arr.length - 1);

        // printing of ascending sorted arr
        System.out.println("Ascending :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        secMthd m2 = new secMthd();
        m2.mergeSort(arr, 0, arr.length - 1);

        // printing of descending sorted arr
        System.out.println("Descending :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// for descending order
class secMthd {
    // merge sort
    public static void mergeSort(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    // func for merge
    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];

        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp

        // Merge the two halves into the temp array
        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) > 0) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy the remaining elements from the left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy the remaining elements from the right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted elements back into the original array
        for (i = 0, j = si; i < k; i++, j++) {
            arr[j] = temp[i];
        }
    }
}