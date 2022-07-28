class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0, j=nums.length-1;
        while(i<j)
        {
            int mid=i+(j-i)/2;
            if(mid==0 || mid==nums.length-1) return nums[mid];
            if(mid%2==0)  
            {if(nums[mid]==nums[mid-1]) j=mid-1;
            else if(nums[mid]==nums[mid+1])i=mid+1;
            else return nums[mid];
            }
            else
            {
                if(nums[mid]==nums[mid-1]) i=mid+1;
            else if(nums[mid]==nums[mid+1]) j=mid-1;
                else return nums[mid];
            }
        }
        return nums[i];
    }
}