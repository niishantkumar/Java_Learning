package Java_Learning.StackP1;

//implementing Stack using JCF(Java Collection Framework)

import java.util.Stack;;

public class Prac3 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

}