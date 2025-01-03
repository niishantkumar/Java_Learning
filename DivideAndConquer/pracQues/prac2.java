package Java_Learning.DivideAndConquer.pracQues;

//an array is sorted at a pivot point. find the index of given element

public class prac2 {

    // func to find ind of key
    public static int search(int arr[], int key, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (arr[mid] == key) {
            return mid;
        }

        // for line 1
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= key && key <= arr[mid]) {
                return search(arr, key, si, mid - 1);
            } else {
                return search(arr, key, mid + 1, ei);
            }
        } else {
            if (arr[mid] <= key && key <= arr[ei]) {
                return search(arr, key, mid + 1, ei);
            } else {
                return search(arr, key, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };

        int ind = search(arr, 0, 0, arr.length - 1);

        System.out.println("Ind of 0 is : " + ind);
    }
}