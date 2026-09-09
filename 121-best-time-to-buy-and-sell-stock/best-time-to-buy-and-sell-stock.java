class Solution {
    public int maxProfit(int[] prices) {
               int n = prices.length;
        int profit = 0;
        int bye = prices[0];
        for (int i = 1; i < n; i++) {
            if(prices[i] < bye){
                bye = prices[i];
            }
            else{
                int currentprofit = prices[i] - bye;
                if(currentprofit > profit){
                    profit = currentprofit;
                }
            }

        }
        return profit;
    }
}