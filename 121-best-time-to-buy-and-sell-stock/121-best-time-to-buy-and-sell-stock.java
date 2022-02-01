class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int lowest=prices[0];
        for(int i:prices)
        {
            if(i<lowest) lowest=i;
            if(i>lowest && i-lowest>profit) profit=i-lowest;
        }
        return profit;
    }
}