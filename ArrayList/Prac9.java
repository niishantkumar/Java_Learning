package Java_Learning.ArrayList;

import java.util.ArrayList;

//pair sum - 1 (pointer method)
//O(n)

public class Prac9 {

    // func to check pair sum
    static void pairSum(ArrayList<Integer> list, int tgt) {
        int fstTerm = 0;
        int lstTerm = list.size() - 1;

        while (fstTerm < lstTerm) {

            if (list.get(fstTerm) + list.get(lstTerm) == tgt) {
                System.out.println(list.get(fstTerm) + " + " + list.get(lstTerm) + " = " + tgt);
                return;
            } else if (list.get(fstTerm) + list.get(lstTerm) < tgt) {
                fstTerm++;
            } else {
                lstTerm--;
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