package Java_Learning.ArrayList;

import java.util.ArrayList;

//operations on ArrayList

public class Prac1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // to add elements in list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // to add element at specific index
        list.add(0, 0);

        // to print list
        System.out.println(list);

        // to get element of specific ind
        System.out.println("Element at ind 2 is : " + list.get(2));

        // removes element at given ind
        list.remove(0);
        System.out.println(list);

        // returns true if element found else false
        System.out.println("2 in list : " + list.contains(2));

        // replace element at a given ind
        list.set(0, 2);
        System.out.println(list);

    }

}