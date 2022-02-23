class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums)
            sum+=i;
        if(sum%2==1) return false;
        int dp[][]=new int[nums.length][sum/2+1];
        for(int[] i:dp)
            Arrays.fill(i,-1);
        return helper(nums,0,sum/2,dp)==1;
    }
    public int helper(int[] nums, int i, int sum, int[][]dp)
    {
        if(sum==0) return 1;
        if(i==nums.length || sum<0 || dp[i][sum]==0) return 0;
        if(helper(nums,i+1,sum,dp)==1 || helper(nums,i+1,sum-nums[i],dp)==1) return dp[i][sum]=1;
        return dp[i][sum]=0;
    }
}