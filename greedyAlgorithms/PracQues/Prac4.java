package Java_Learning.greedyAlgorithms.PracQues;

public class Prac4 {

    // Function to find lexicographically smallest string of length n and sum k
    public static String Lexico_smallest_String(int n, int k) {
        StringBuilder sb = new StringBuilder();

        // Build string from end to start
        for (int i = n - 1; i >= 0; i--) {
            // Minimum sum required for remaining i characters = i * 1 = i
            // So, max we can assign here = k - i
            int val = Math.min(26, k - i);
            sb.append((char) ('a' + val - 1));
            k -= val;
        }

        // Since we built from right to left, we need to reverse it
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int n1 = 5, k1 = 42;
        int n2 = 3, k2 = 25;

        System.out.println(Lexico_smallest_String(n1, k1)); // Output: aaanz
        System.out.println(Lexico_smallest_String(n2, k2)); // Output: aaw
    }
}
