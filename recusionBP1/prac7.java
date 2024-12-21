package Java_Learning.recusionBP1;

public class prac7 {
    //first occrance
    public static int index(int arr[],int i, int key){
        if(i == arr.length){
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return index(arr, i+1, key);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7};

        System.out.println(index(arr, 0, 6));
    }
}