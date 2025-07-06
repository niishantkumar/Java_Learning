package Java_Learning.greedyAlgorithms.PracQues;

/*
            *********Best Time to Buy and Sell Stock***********
 Given an array prices[] of length N, representing the prices of the stocks on different days, the
 task is to find the maximum profit possible for buying and selling the stocks on different days
 using transactions where at most one transaction is allowed.
 Note: Stock must be bought before being sold.

 Sample Input 1 : prices[] = {7, 6, 4, 3, 1}
 Sample Output 1 : 0
 
 Sample Input 2 : prices[] = {7, 1, 5, 3, 6, 4]
 Sample Output 2 : 5
 */

public class Prac5 {
    public static int maxProfit(int[] prices) {
        int costPrice = prices[0];
        int currProfit = 0;
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (costPrice > prices[i]) {
                costPrice = prices[i];
                continue;
            }
            currProfit = prices[i] - costPrice;
            maxProfit = Math.max(maxProfit, currProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };

        System.out.println(maxProfit(prices));

        prices = new int[] { 7, 6, 4, 3, 1 };

        System.out.println(maxProfit(prices));
    }

}