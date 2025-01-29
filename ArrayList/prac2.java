package Java_Learning.ArrayList;

//find max in an ArrayList

import java.util.ArrayList;

public class prac2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(6);
        list.add(0);
        list.add(4);
        list.add(10);
        list.add(8);

        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }

        System.out.println(max);
    }

}