class Solution {
    public int majorityElement(int[] nums) {
        int temp=0;
        int count=0;
        for(int i:nums)
        {
            if(count==0)
            {
                temp=i;
            }
            
            count+=i==temp?1:-1;
        }
        return temp;
    }
}