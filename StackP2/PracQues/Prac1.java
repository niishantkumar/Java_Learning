package Java_Learning.StackP2.PracQues;

import java.util.LinkedList;
import java.util.Stack;

public class Prac1 {
    // Function to check if a linked list is a palindrome
    public static boolean isPalindrome(LinkedList<Character> list) {
        Stack<Character> stk = new Stack<>();
        int n = list.size();

        // Push second half of the list into stack
        int start = (n % 2 == 0) ? n / 2 : (n / 2 + 1);
        for (int i = start; i < n; i++) {
            stk.push(list.get(i));
        }

        // Compare first half with reversed second half
        for (int i = 0; i < n / 2; i++) {
            if (list.get(i) != stk.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();

        list.add('A');
        list.add('B');
        list.add('C');
        list.add('B');
        list.add('A');

        System.out.println(isPalindrome(list));  // Output: true
    }
}
