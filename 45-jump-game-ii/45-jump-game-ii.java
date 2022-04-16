class Solution {
    public int jump(int[] nums) {
        int ans=0;
        int max_landing_index=0;
        int curr_landed_index=0;
        for(int i=0;i<nums.length-1;i++)
        {
            max_landing_index=Math.max(max_landing_index,i+nums[i]);
            if(i==curr_landed_index)
            {
                ans++;
                curr_landed_index=max_landing_index;
            }
        }
        return ans;
    }
}