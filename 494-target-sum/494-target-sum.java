class Solution {
    int ans=0;
    public int findTargetSumWays(int[] nums, int target) {
        ans=0;
        helper(nums,target,0,0);
        return ans;
    }
    public void helper(int[] nums, int target, int index, int curr)
    {
        
        if(curr==target && index==nums.length) ans+=1;
        else if(index==nums.length) return;
        else
        {
            helper(nums,target,index+1,curr-nums[index]);
            helper(nums,target,index+1,curr+nums[index]);
        }
    }
}