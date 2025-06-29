package Java_Learning.greedyAlgorithms;

import java.util.Arrays;
import java.util.Collections;

//chocola problem

public class Prac8 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int row = 4, col = 6;

        Integer costHor[] = { 4, 1, 2 }; // row -1
        Integer costVer[] = { 2, 1, 3, 1, 4 }; // col -1

        Arrays.sort(costHor, Collections.reverseOrder()); // descending
        Arrays.sort(costVer, Collections.reverseOrder());

        int h = 0, v = 0; // curr horizontal and vertical cuts
        int hp = 1, vp = 1; // curr horizontal and vertical pieces
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {

            if (costVer[v] <= costHor[h]) {
                cost += costHor[h] * vp;
                hp++;
                h++;
            } else {
                cost += costVer[v] * hp;
                vp++;
                v++;
            }

        }

        while (h < costHor.length) {
            cost += costHor[h] * vp;
            hp++;
            h++;
        }

        while (v < costVer.length) {
            cost += costVer[v] * hp;
            vp++;
            v++;
        }

        System.out.println("Minimum cost of cuts = " + cost);

    }
}