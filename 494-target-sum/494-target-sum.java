class Solution {
    int a=0;
    public int findTargetSumWays(int[] nums, int target) {
        a=0;
        helper(nums,target,0,0);
        return a;
    }
    public void helper(int[] nums, int target, int index, int curr)
    {
        // using if statements
        if(curr==target && index==nums.length) a+=1;
        else if(index==nums.length) return;
        else
        {

            helper(nums,target,index+1,curr-nums[index]);
            helper(nums,target,index+1,curr+nums[index]);
        }
    }
}
