package Java_Learning.ArrayList;

import java.util.ArrayList;

//multidimensional ArrayList

public class Prac5 {

    public static void main(String[] args) {
        // 1st multidimensional ArrayList
        ArrayList<ArrayList<?>> mainList = new ArrayList<>(); // sub list may be of any type

        ArrayList<Integer> innerList1 = new ArrayList<>();
        innerList1.add(1);
        innerList1.add(2);

        ArrayList<String> innerList2 = new ArrayList<>();
        innerList2.add("one");
        innerList2.add("two");
        innerList2.add("three");

        mainList.add(innerList1);
        mainList.add(innerList2);

        // to print mainList
        for (int i = 0; i < mainList.size(); i++) {
            for (int j = 0; j < mainList.get(i).size(); j++) {
                System.out.print(mainList.get(i).get(j) + " ");
            }
            System.out.println();
        }

        // 2nd multidimensional ArrayList
        ArrayList<ArrayList<Integer>> table = new ArrayList<>(); // sub list can be of only Integer type

        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();

        table.add(one);
        table.add(two);
        table.add(three);

        for (int i = 1; i < 5; i++) {
            one.add(i);
            two.add(i * 2);
            three.add(i * 3);
        }

        // to print multidimensional list
        for (int i = 0; i < table.size(); i++) {
            ArrayList<Integer> temp = table.get(i);
            for (int j = 0; j < temp.size(); j++) {
                System.out.print(temp.get(j) + " ");
            }
            System.out.println();
        }

        System.out.println(table);
    }

}