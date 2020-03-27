public class BestTimeToBuyAndSellStockII {
    public static int maxProfit(final int[] prices) {
        int maxProfit = 0;

        for (int index = 1; index < prices.length; index++)
            if (prices[index] > prices[index - 1])
                maxProfit += prices[index] - prices[index - 1];

        return maxProfit;
    }
}
