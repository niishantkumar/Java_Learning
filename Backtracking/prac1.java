package Java_Learning.Backtracking;

//backtrack in an array

public class prac1 {
    // changes in array
    public static void arrBackTrack(int arr[], int value, int ind) {
        if (ind == arr.length) {
            printArr(arr);
            return;
        }

        arr[ind] = value;
        arrBackTrack(arr, value + 1, ind + 1);
        arr[ind] = arr[ind] - 2;
    }

    // func to print arr
    public static void printArr(int arr[]) {

        System.out.println("Your array is :");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // main func
    public static void main(String[] args) {
        int arr[] = new int[5];
        arrBackTrack(arr, 1, 0);
        printArr(arr);
    }

}