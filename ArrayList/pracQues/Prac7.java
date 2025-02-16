package Java_Learning.ArrayList.pracQues;

// Beautiful ArrayList(MEDIUM)
//Time Complexity	O(n log n)
//Space Complexity	O(n)

import java.util.ArrayList;
import java.util.Scanner;

public class Prac7 {

    // main func

    public static void main(String[] args) {
        Solution ob = new Solution();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<Integer> ans = ob.beautifulArray(num);

        for (int i = 0; i < num; i++) {
            System.out.println(ans.get(i) + " ");
        }

        sc.close();
    }

}

class Solution {

    ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        for (int i = 1; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (Integer e : ans) { // This loop iterates over each element e in the ans list
                if (2 * e <= n)
                    temp.add(e * 2);
            }
            for (Integer e : ans) {
                if (2 * e - 1 <= n)
                    temp.add(e * 2 - 1);
            }
            ans = temp;
        }
        return ans;
    }

}