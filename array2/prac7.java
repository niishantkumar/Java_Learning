package Java_Learning.array2;

//bye and sell stock brute force

public class prac7 {
    // func to find profit
    public static int profit(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int profit;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                profit = prices[i] - buyPrice;

                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };

        System.out.println("Max profit is : " + profit(prices));
    }
}