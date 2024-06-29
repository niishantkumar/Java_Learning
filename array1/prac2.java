package Java_Learning.array1;

//binary search

public class prac2 {
    // func for binary search
    public static int binSearch(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;

            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 44, 5, 2, 44, 35, 23 };

        int index = binSearch(arr, 23);

        if (index == -1) {
            System.out.println("No match found.");
        } else {
            System.out.println("Element found at index : " + index);
        }
    }
}