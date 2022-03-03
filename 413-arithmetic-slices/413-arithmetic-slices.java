class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int ans=0;
        int prev=0;
        for(int i=1;i<nums.length-1;i++)
        {
            if(i<nums.length-1)
                ans+=(nums[i-1]-nums[i]==nums[i]-nums[i+1])?(++prev):(prev=0);
        }
        return ans;
    }
}