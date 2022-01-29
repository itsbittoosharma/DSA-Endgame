class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return Math.max(check(nums,1,dp),check(nums,0,dp));
    }
    public int check(int[] nums, int ind, int[] dp)
    {
        if(ind==nums.length-1 || ind==nums.length-2)
        {
            return nums[ind];
        }
        if(ind>=nums.length) return 0;
        if(dp[ind]!=-1) return dp[ind];
        dp[ind]=nums[ind]+(Math.max(check(nums,ind+2,dp),check(nums,ind+3,dp)));
        return dp[ind];
    }
}