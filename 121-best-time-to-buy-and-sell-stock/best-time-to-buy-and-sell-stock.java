class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxprofit = 0;
        int bye = prices[0];
        for(int i = 1;i < n; i++){
            if(prices[i] < bye){
                bye = prices[i];
            }
            else{
                int currentprofit = prices[i] - bye;
                maxprofit = Math.max(maxprofit, currentprofit);
            }
        }
        return maxprofit;
      
    }
}