package Java_Learning.Queues.PracQues;

/*  
    Given a number N. The task is to generate and print all binary numbers with decimal values from
    1 to N.
    Sample Input 1 : N =2
    Sample Output 1 : 1 10
    
    Sample Input 2 : 5.
    Sample Output 2 : 1 10 11 100 101
*/

import java.util.Queue;
import java.util.LinkedList;

public class Prac1 {
    // func to print binary
    public static void printBinary(int num) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < num; i++) {
            String curr = q.remove();
            System.out.print(curr + " ");
            q.add(curr + "0");
            q.add(curr + "1");
        }

    }

    // main func
    public static void main(String[] args) {
        int num = 5;
        printBinary(num);
    }

}