class Solution {
    public List<Integer> majorityElement(int[] nums) {
         int count1=0, count2=0, key1=-1, key2=-1;
        for(int i:nums)
        {
            if(i==key1)
            {
                count1++;
            }
            else if(i==key2)
            {
                count2++;
            }
            else if(count1==0)
            {
                count1=1;
                key1=i;                
            }
            else if(count2==0)
            {
                count2=1;
                key2=i;
            }
            
            else
            {
                count1--;
                count2--;
            }
        }
        
        count1=0;
        count2=0;
          for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==key1) count1++;
              else if(nums[i]==key2) count2++;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        if(count1>nums.length/3) ans.add(key1);
        if(count2>nums.length/3) ans.add(key2);
        return ans;
    }
}