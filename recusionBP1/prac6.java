package Java_Learning.recusionBP1;

public class prac6 {
    //array is sorted or not
    public static boolean isSorted(int arr[], int n){
        if(n == arr.length -1){
            return true;
        }

        int e1 = arr[n];
        int e2 = arr[n+1];

        if (e1 > e2) {
            return false;
        }

        return isSorted(arr, n+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};

        System.out.println(isSorted(arr, 0));
    }
}