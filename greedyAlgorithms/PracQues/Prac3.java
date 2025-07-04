package Java_Learning.greedyAlgorithms.PracQues;

/*

 *******Lexicographically smallest string of length N and sum K********

 We have two integers N and K. The task is to print the lexicographically smallest string of
 length N consisting of lower-case English alphabets such that the sum of the characters of
 the string equals to K where ‘a’ = 1, ‘b’ = 2, ‘c’ = 3, ….. and ‘z’ = 26.

 Sample Input 1 : N = 5, K = 42
 Sample Output 1 : aaamz
 
 Sample Input 2 : N = 3, K = 25
 Sample Output 2 : aaw

*/

public class Prac3 {
    // func to find Lexicographically smallest string of length N and sum K
    public static String Lexico_smallest_String(int n, int k) {
        String ans = "";

        while (n != 0) {
            if ((n - 1) * 26 >= k) {
                ans += 'a';
                k--;
            } else {
                int position = k % 26;
                if (position == 0) {
                    ans += 'z';
                    k -= 26;
                } else {
                    ans += (char) ('a' + position - 1);
                    k -= position;
                }
            }
            n--;
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 42;

        System.out.println(Lexico_smallest_String(n, k));
    }
}