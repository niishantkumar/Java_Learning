package Java_Learning.basicSort;

//bubble sort

public class prac1 {
    // func for bubble sort
    public static void bubbleSort(int array[]) {
        int n = array.length;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // func for selection sort
    public static void selectionSort(int array[]) {
        int n = array.length;
        int smallPos;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            smallPos = i;
            for (int j = i + 1; j < n; j++) {
                if (array[smallPos] > array[j]) {
                    smallPos = j;
                }
            }
            temp = array[i];
            array[i] = array[smallPos];
            array[smallPos] = temp;
        }
    }

    // func for insertion sort-as per my logic
    public static void insertion_Sort(int arr[]) {
        int temp;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    // func for insertion sort-as per my logic
    public static void insertionSort(int arr[]) {
        int current;
        int prev;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            current = arr[i];
            prev = i - 1;

            // finding current position to insert
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // insertion
            arr[prev + 1] = current;
        }
    }

    public static void main(String[] args) {
        int array[] = { 5, 7, 1, 3, 2 };

        insertionSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}