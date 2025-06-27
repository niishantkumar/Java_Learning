package Java_Learning.greedyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//Indian coins

public class Prac6 {

    public static void main(String[] args) {

        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
        int amount = 590;

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfcoins = 0;
        ArrayList<Integer> coinsUsed = new ArrayList<>();

        for (int i = 0; i < coins.length && amount > 0; i++) {

            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    amount -= coins[i];
                    countOfcoins++;
                    coinsUsed.add(coins[i]);
                }

            }
        }

        System.out.println("Number of coins/notes used : " + countOfcoins);

        System.out.println("Coins/notes used : " + coinsUsed);
    }

}