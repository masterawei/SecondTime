package Greedy;

/**
 * @author away
 * @date 2021-12-07 10:43
 */
public class BestTimeToBuyAndSellStockIi {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
