class Solution {
    public int fib(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);
        return fib(n,dp);
    }
    public int fib(int n,int[] dp)
    {
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=fib(n-1,dp)+fib(n-2,dp);
    }
}