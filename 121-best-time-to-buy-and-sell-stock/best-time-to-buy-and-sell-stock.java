class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxprofit = 0;
        int buy = prices[0];
        for(int i = 1;i < n; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            else{
                int currentprofit = prices[i] - buy;
                maxprofit = Math.max(maxprofit, currentprofit);
            }
        }
        return maxprofit;
      
    }
}