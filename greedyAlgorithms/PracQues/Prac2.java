package Java_Learning.greedyAlgorithms.PracQues;

/*
 *  *******Kth largest odd number in a given range*********
 We have two variables L and R, indicating a range of integers from L to R inclusive, and a
 number K, the task is to find Kth largest odd number. If K > number of odd numbers in the range
 L to R then return 0.

 Sample Input 1 : L = -3, R = 3, K = 1
 Sample Output 1 : 3

 */

public class Prac2 {
    // func to find Kth largest odd number in a given range
    public static int Kth_largOdd(int l, int r, int k) {
        int Kth_largOdd = r - (2 * (k - 1));

        return Kth_largOdd < l ? 0 : Kth_largOdd;
    }

    public static void main(String[] args) {
        int l = -3;
        int r = 3;
        int k = 1;

        System.out.println(Kth_largOdd(l, r, k));
    }

}