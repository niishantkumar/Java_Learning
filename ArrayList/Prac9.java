package Java_Learning.ArrayList;

import java.util.ArrayList;

//pair sum - 1 (pointer method)
//O(n)

public class Prac9 {

    // func to check pair sum
    static void pairSum(ArrayList<Integer> list, int tgt) {
        int rightPtr = 0;
        int leftPtr = list.size() - 1;

        while (rightPtr != leftPtr) {

            if (list.get(rightPtr) + list.get(leftPtr) == tgt) {
                System.out.println(list.get(rightPtr) + " + " + list.get(leftPtr) + " = " + tgt);
                return;
            } else if (list.get(rightPtr) + list.get(leftPtr) < tgt) {
                rightPtr++;
            } else {
                leftPtr--;
            }

        }
    }

    // main func
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        pairSum(list, 5);

    }

}