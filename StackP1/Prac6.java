package Java_Learning.StackP1;

//func to reverse Stack

import java.util.Stack;
import java.util.ArrayList;

public class Prac6 {
    // func to rev Stack
    public static void reverse(Stack<Integer> stk) {
        ArrayList<Integer> temp = new ArrayList<>();

        while (!stk.isEmpty()) {
            temp.add(stk.pop());
        }

        int ind = 0;
        while (ind < temp.size()) {
            stk.push(temp.get(ind));

            ind++;
        }
    }

    // main func
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        stk.push(0);
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        reverse(stk);
        System.out.println("Original Stack :");
        while (!stk.isEmpty()) {
            System.out.println(stk.pop());
        }
    }

}