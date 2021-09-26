class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int minSoFar=prices[0];
        int i;
        for(i=0; i<prices.length;i++){
            minSoFar=Math.min(minSoFar, prices[i]);
            int profit=prices[i]-minSoFar;
            max_profit=Math.max(max_profit, profit);
        }
        return max_profit;
    }
    
}
