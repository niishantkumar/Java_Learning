package Java_Learning.Queues;

import java.util.LinkedList;
import java.util.Queue;

//first non-repeating letter

public class Prac8 {

    // func to print non-repeating
    public static void printNonRepeating(String str) {
        int map[] = new int[26]; // map to trace frequency of characters in string

        Queue<Character> que = new LinkedList<>();

        char current;

        for (int i = 0; i < str.length(); i++) {
            current = str.charAt(i);

            que.add(current);
            map[current - 'a']++;

            while (!que.isEmpty() && map[que.peek() - 'a'] > 1) {
                que.remove();
            }

            if (que.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(que.peek() + " ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabccxb";

        printNonRepeating(str);
    }

}