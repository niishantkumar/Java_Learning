package Java_Learning.recusionBP1;

public class prac9 {
    // last occurance
    public static int lastOccr(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccr(arr, i + 1, key);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,88,88,88,4,3,2};

        System.out.println(lastOccr(arr, 0, 88));
    }
}