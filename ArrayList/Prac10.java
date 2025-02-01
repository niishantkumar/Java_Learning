package Java_Learning.ArrayList;

import java.util.ArrayList;

//pair sum - 1 (pointer method)
//O(n)

public class Prac10 {

    // func to check pair sum
    static void pairSum(ArrayList<Integer> list, int tgt) {
        int n = list.size();

        int pivot = 0;
        while (pivot < n - 2 && list.get(pivot) < list.get(pivot + 1)) {
            pivot++;
        }

        int rightPtr = pivot;
        int leftPtr = pivot + 1;

        while (leftPtr != rightPtr) {

            if (list.get(leftPtr) + list.get(rightPtr) == tgt) {
                System.out.println(list.get(leftPtr) + " + " + list.get(rightPtr) + " = " + tgt);
                return;
            }

            if (list.get(leftPtr) + list.get(rightPtr) < tgt) {
                leftPtr = (leftPtr + 1) % n;
            } else {
                rightPtr = (n + rightPtr - 1) % n;
            }

        }

        // If no pair sum found
        System.out.println("No pair found with sum " + tgt);
    }

    // main func
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        pairSum(list, 16);

    }

}