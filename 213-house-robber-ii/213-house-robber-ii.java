class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        // if(nums.length==3) return Math.max(nums[0],Math.max(nums[1],nums[2]));
        return Math.max(check(nums,0,nums.length-2),check(nums,1,nums.length-1));
    }
    public int check(int[] nums,int p, int n)
    {
        int prev=Math.max(nums[p],nums[p+1]);
        int pprev=nums[p];
        for(int i=p+2;i<=n;i++)
        {
            int temp=Math.max(prev,pprev+nums[i]);
            pprev=prev;
            prev=temp;
        }
        
        return prev;
    }
}