class Solution {
    public int findDuplicate(int[] nums) {
        while(nums[0]!=nums[nums[0]])
        {
            int temp=nums[nums[0]];
            nums[nums[0]]=nums[0];
            nums[0]=temp;
        }
        return nums[0];
    }
}