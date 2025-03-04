package Java_Learning.linkedListP2;

//implementation of LinkedList using JCF

import java.util.LinkedList;

public class Prac3 {

    public static void main(String[] args) {

        // create
        LinkedList<Integer> sll = new LinkedList<>();

        // add node
        sll.addLast(3);
        sll.addFirst(1);
        sll.addFirst(2);

        System.out.println(sll);
    }

}
