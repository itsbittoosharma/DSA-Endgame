class Solution {
    public void sortColors(int[] nums) {
        int left=0, right=nums.length-1, mid=0;
        while(mid<=right)
        {
            switch(nums[mid])
            {
                case 0:
                    {
                    int temp=nums[left];
                    nums[left++]=nums[mid];
                    nums[mid++]=temp;
                        break;
                }
                    case 2:
                    {
                        int temp=nums[right];
                        nums[right--]=nums[mid];
                        nums[mid]=temp;
                        break;
                    }
                case 1:
                    {
                        mid++;
                    }
                
            }
        }
    }
}