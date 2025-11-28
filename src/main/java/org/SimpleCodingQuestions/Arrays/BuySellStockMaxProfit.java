package org.SimpleCodingQuestions.Arrays;
/**
 * Given: An array where each element represents the stock price on that day.
 * Goal: Find the maximum profit you can make by buying on one day and selling on a later day.
 * (You can make only one transaction → one buy + one sell.)
 */
public class BuySellStockMaxProfit {
    /**
     * We want: Buy at lowest price (before), Sell at highest price (after), Maximize sell – buy
     * If prices go only down → profit = 0
     * Logic: Track two things: minPrice seen so far, maxProfit seen so far
     * At each price:
     * Update minPrice
     * Calculate potential profit = current price – minPrice
     * Update maxProfit
     */
    public static void main(String[] args) {
            int[] prices = {7, 1, 5, 3, 6, 4};

            int minPrice = Integer.MAX_VALUE;
            int maxProfit = 0;

            for(int i = 0; i < prices.length; i++) {
                // update minimum price seen so far
                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                }
                // calculate profit if sold today
                int profit = prices[i] - minPrice;
                // update max profit
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
            System.out.println("Max Profit: " + maxProfit);
    }
}
/*
🧪 Dry Run (with {7,1,5,3,6,4})
Day	 Price	minPrice	profit = price – minPrice	maxProfit
0	 7	        7	             0	                    0
1	 1	        1	             0	                    0
2	 5	        1	             4	                    4
3	 3	        1	             2	                    4
4	 6	        1	             5	                    5
5	 4	        1	             3	                    5

✔️ Max profit = 5 (Buy at 1, Sell at 6)
 */