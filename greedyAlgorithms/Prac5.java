package Java_Learning.greedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

//maximum length chain of pairs

public class Prac5 {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingDouble(O -> O[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println("Max length of chain : " + chainLen);
    }
}