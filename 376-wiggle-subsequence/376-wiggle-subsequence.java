class Solution {
    public int wiggleMaxLength(int[] nums) {
        Boolean positive=null;
        int max=nums.length;
        
        for(int i=1;i<nums.length;i++)
        {
            int temp=nums[i]-nums[i-1];
            if(temp==0) max--;
            else if(positive==null) 
            {
                positive=temp>0;
            }
            else if(positive && temp>0) max--;
            else if(!positive && temp<0) max--;
            else positive=!positive;
        }
        return max;
    }
}