package Java_Learning.recusionBP2.pracQues;

/*
 * For a given integer array of size N.You have to find all the occurrences(indices)
 * of a given element(Key) and print them. Use a recursive function to solve this problem.
 */

public class prac1 {
    public static void allOccurance(int arr[], int key, int n) { // n -> position from where to be searched

        if (n == arr.length) {
            return;
        }

        if (arr[n] == key) {
            System.out.print(n + " ");
        }

        allOccurance(arr, key, n + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };

        allOccurance(arr, 2, 0);
    }
}