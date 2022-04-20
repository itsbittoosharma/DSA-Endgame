class Solution {
    public int[] rearrangeArray(int[] nums) {
        int _pos=0, _neg=1;
        int[] ans=new int[nums.length];
        int pos=-1,neg=-1;
        for(;_neg<nums.length;_pos+=2, _neg+=2)
        {
            for(int i=pos+1;i<nums.length;i++)
        {
            if(nums[i]>0) {pos=i; break;}
        }
            ans[_pos]=nums[pos];
            for(int i=neg+1;i<nums.length;i++)
        {
            if(nums[i]<0) {neg=i; break;}
        }
            ans[_neg]=nums[neg];
            
        
        }
        return ans;
    }
}