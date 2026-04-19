class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int currentProfit;
        if (prices.length < 2) {
            return 0;
        }
        int buy = 0;
        int sell = 1;
        while (buy < prices.length - 1 && sell < prices.length) {
            currentProfit = prices[sell] - prices[buy];
            if (currentProfit > profit) {
                profit = currentProfit;
            }
            if (prices[sell] < prices[buy]) {
                buy = sell;
            }
            sell++;
        }
        return profit;
    }
}
