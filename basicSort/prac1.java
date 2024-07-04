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

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 3, 2 };

        bubbleSort(array);

        for(int i = 0; i<array.length; i++){
            System.err.print(array[i]+" ");
        }
    }
}