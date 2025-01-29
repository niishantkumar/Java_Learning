package Java_Learning.ArrayList;

import java.util.ArrayList;

//swap two values/elements in ArrayList

public class prac3 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(6);
        list.add(0);
        list.add(4);
        list.add(10);
        list.add(8);

        int ind1 = 0;
        int ind2 = 3;

        System.out.println("Before swapping :");
        System.out.println(list + "\n");

        // swap
        int temp = list.get(ind2);
        list.set(ind2, list.get(ind1));
        list.set(ind1, temp);

        System.out.println("After swapping :");
        System.out.println(list + "\n");

    }

}
