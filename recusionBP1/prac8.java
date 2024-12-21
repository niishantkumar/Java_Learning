package Java_Learning.recusionBP1;

public class prac8 {
    //last occurance
    public static int lastOccr(int arr[],int i, int key){
        if (i == 0) {
            return -1;
        }

        if (arr[i-1] == key) {
            return i-1;
        }

        return lastOccr(arr, i-1, key);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,88,88,88,4,3,2};

        System.out.println(lastOccr(arr, arr.length, 88));
    }
}