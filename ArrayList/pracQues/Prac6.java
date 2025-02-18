package Java_Learning.ArrayList.pracQues;

/*
  Beautiful ArrayList(MEDIUM)
  An Arraylist nums of size n is beautiful if:
  nums is a permutation of the integers in the range [1, n].For every 0 <= i < j < n, there is no index k with i < k < j where 
  2*nums.get(k) == nums.get(i) + nums.get(j). Given the integer n, return any beautiful arraylist nums of size n. There will be atleast one
  valid answer for the given n.
  
  Sample Input 1: n = 4
  Sample Output 1:  [2,1,4,3]
 */

//Time Complexity	O(n log n)
//Space Complexity	O(n)

import java.util.ArrayList;

public class Prac6 {

    public static void main(String[] args) {
        Solution ob = new Solution(5);

        ob.beautifulArray();

    }

}

class Solution {
    int n;

    Solution(int n) {
        this.n = n;
    }

    // func to find beautiful array
    void beautifulArray() {
        ArrayList<Integer> beautiful = new ArrayList<>();
        beautiful.add(1);

        while (beautiful.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();

            for (int i = 0; i < beautiful.size(); i++) {
                if (beautiful.get(i) * 2 - 1 <= n) {
                    temp.add(beautiful.get(i) * 2 - 1);
                }
            }

            for (int i = 0; i < beautiful.size(); i++) {
                if (beautiful.get(i) * 2 <= n) {
                    temp.add(beautiful.get(i) * 2);
                }
            }

            beautiful = temp;

        }

        System.out.println(beautiful);

    }

}