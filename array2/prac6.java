package Java_Learning.array2;

//bye and sell stock brute force

public class prac6 {
    // func to find profit
    public static int profit(int prices[]) {
        int maxProfit = Integer.MIN_VALUE;
        int currentProfit;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                currentProfit = prices[j] - prices[i];

                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }

        if (maxProfit < 0) {
            return 0;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };

        System.out.println("Max profit is : " + profit(prices));
    }
}