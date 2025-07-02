package Java_Learning.greedyAlgorithms.PracQues;

/*
   ****Maximum Balanced String Partitions*****
 We have balanced string str of size N with an equal number of L and R, the task is to find a
 maximum number X, such that a given string can be partitioned into X balanced substring.

 A string is called to be balanced if the number of ‘L’s in the string equals the number of ‘R’s.

 Input : “LRRRRLLRLLRL”
 Output : 3
 */

public class Prac1 {
    public static int maxBalancedSubstrings(String str) {
        int balance = 0;
        int count = 0;
        char currChar;
        int lastPoint = 0;

        for (int i = 0; i < str.length(); i++) {
            currChar = str.charAt(i);

            // Increase or decrease the balance counter
            if (currChar == 'L') {
                balance++;
            } else if (currChar == 'R') {
                balance--;
            }

            // When balance is zero, we've found a balanced substring
            if (balance == 0) {
                count++;

                System.out.print(str.substring(lastPoint, i + 1) + " ");
                lastPoint = i + 1;
            }
        }
        System.out.println();

        return count;
    }

    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        int result = maxBalancedSubstrings(str);
        System.out.println("Maximum number of balanced substrings: " + result);
    }
}
