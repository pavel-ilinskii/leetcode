package org.t1r0.home.array;

public class BestTimeBuySellStockII {

    public int maxProfit(int[] prices) {
        int profit = 0;
        boolean share = false;
        int sharePrice = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (share) {
                if (prices[i] > prices[i + 1]) {
                    profit += prices[i] - sharePrice;
                    share = false;
                    sharePrice = 0;
                }
            } else {
                if (prices[i] < prices[i + 1]) {
                    share = true;
                    sharePrice = prices[i];
                }
            }
        }
        if (share) {
            profit += prices[prices.length - 1] - sharePrice;
        }

        return profit;
    }
}
