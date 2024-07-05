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

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 3, 2 };

        selectionSort(array);

        for (int i = 0; i < array.length; i++) {
            System.err.print(array[i] + " ");
        }
    }
}