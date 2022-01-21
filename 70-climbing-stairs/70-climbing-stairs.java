class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return climbStairs(n,dp);
    }
    public int climbStairs(int n,int[] dp)
    {
        if(n<4) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=climbStairs(n-1,dp)+climbStairs(n-2,dp);
    }
}