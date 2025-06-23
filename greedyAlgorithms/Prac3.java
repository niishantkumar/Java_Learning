package Java_Learning.greedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

//Fractional knapsack

public class Prac3 {

    public static void main(String[] args) {
        int weight[] = { 10, 20, 30 };// weight of each item
        int value[] = { 60, 100, 120 };// respective value
        int w = 50; // capacity of sack

        // array to store ratio of val:weight
        double ratio[][] = new double[value.length][2];
        // 0th col->ind, 1st col->ratio

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }

        // sorting ratio
        Arrays.sort(ratio, Comparator.comparingDouble((O -> O[1])));

        int capacity = w;
        int finalValue = 0;

        //
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                finalValue += value[idx];
                capacity -= weight[idx];
            } else {
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("Final value = " + finalValue);
    }

}