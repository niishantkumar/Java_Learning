package Java_Learning.greedyAlgorithms.PracQues;

public class Prac1 {
    public static int maxBalancedSubstrings(String str) {
        int balance = 0;
        int count = 0;
        int lastPoint = 0;

        for (int i = 0; i < str.length(); i++) {
            // Increase or decrease the balance counter
            if (str.charAt(i) == 'L') {
                balance++;
            } else if (str.charAt(i) == 'R') {
                balance--;
            }

            // When balance is zero, we've found a balanced substring
            if (balance == 0) {
                count++;

                System.out.print(str.substring(lastPoint, i + 1) + " ");
                lastPoint = i;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        int result = maxBalancedSubstrings(str);
        System.out.println("Maximum number of balanced substrings: " + result);
    }
}
