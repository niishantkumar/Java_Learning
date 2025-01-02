package Java_Learning.DivideAndConquer.pracQues;

//to rotate a sorted array about pivot element
public class prac1 {

    // func to rotate
    public static void rotate(int arr[], int pi) {
        int temp[] = new int[arr.length];
        int i = 0, j = pi + 1;

        // for left part
        while (j < arr.length) {
            temp[i] = arr[j];
            i++;
            j++;
        }

        temp[i++] = arr[pi];

        // for right part
        j = 0;
        while (j < pi) {
            temp[i] = arr[j];
            i++;
            j++;
        }

        for (i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    // binary search
    public static int binSearch(int arr[], int key) {
        int si = 0;
        int ei = arr.length - 1;
        int mid;
        while (si <= ei) {
            mid = si + (ei - si) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // pivot element
        int pi = binSearch(arr, 6);

        // to rotate array
        rotate(arr, pi);
    }
}