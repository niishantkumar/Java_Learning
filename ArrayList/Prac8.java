package Java_Learning.ArrayList;

import java.util.ArrayList;

//pair sum - 1 (Brute Force)
//O(n^2)

public class Prac8 {

    // func to check pair sum
    static void pairSum(ArrayList<Integer> list, int tgt) {

        for (int i = 0; i < list.size() - 1; i++) {
            int fstTerm = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (fstTerm + list.get(j) == tgt) {

                    System.out.println(fstTerm + " + " + list.get(j) + " = " + tgt);
                    return;
                }
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