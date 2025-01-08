package Java_Learning.basicSort;

//optimized bubble sort

public class prac2 {
    //func fot bubble sort
    public static void bobbleSort(int arr[]){

        int n = arr.length;
        int temp;
        boolean swapped;

        for(int i = 0; i<n; i++){

            swapped = false;

            for(int j = 0; j< n - 1 - i; j++){
                //swap
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }


    //main func
    public static void main(String[] args) {
        int arr[] = {4,2,3};

        bobbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}