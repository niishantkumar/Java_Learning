package Java_Learning.ArrayList.pracQues;

import java.util.ArrayList;
import java.util.Collections;

// Most Frequent Number following Key(EASY)
//my solution
//tc = O(n log n)
//sc = O(n)

public class Prac4 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);

        Solution ob = new Solution();
        ob.freqTgt(list, 2);
    }

}

class Solution {
    // func to find most frequent tgt
    void freqTgt(ArrayList<Integer> list, int Key) {

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i) == Key) {
                temp.add(list.get(i + 1));
            }
        }

        if (temp.isEmpty()) {
            System.out.println("No tgt found");
            return;
        }
        if (temp.size() == 1) {
            System.out.println(temp.get(0));
            return;
        }

        Collections.sort(temp);

        int maxCount = 0;
        int count = 1;
        int ind = 0;

        for (int i = 0; i < temp.size() - 1; i++) {
            if (temp.get(i) == temp.get(i + 1)) {
                count++;
            } else {
                count = 1;
            }
            if (count > maxCount) {
                maxCount = count;
                ind = i;
            }
        }

        System.out.println(temp.get(ind));
    }
}