package Java_Learning.DivideAndConquer.pracQues;

public class prac7 {
    // Function to mergeSort 2 arrays
    public static String[] mergeSort(String[] arr, int lo, int hi) {
        if (lo == hi) {
            return new String[]{arr[lo]};
        }
        int mid = lo + (hi - lo) / 2;
        String[] arr1 = mergeSort(arr, lo, mid);
        String[] arr2 = mergeSort(arr, mid + 1, hi);
        String[] arr3 = merge(arr1, arr2);
        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m + n];
        int idx = 0;
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (arr1[i].compareTo(arr2[j]) < 0) {
                arr3[idx] = arr1[i];
                i++;
            } else {
                arr3[idx] = arr2[j];
                j++;
            }
            idx++;
        }

        // If any elements are left in arr1
        while (i < m) {
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }

        // If any elements are left in arr2
        while (j < n) {
            arr3[idx] = arr2[j];
            j++;
            idx++;
        }

        return arr3;
    }

    public static void main(String[] args) {
        String[] arr = {"sun", "earth", "mars", "mercury", "venus"};
        String[] a = mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
