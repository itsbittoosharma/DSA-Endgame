class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<3) return nums.length;
        int i=2;
        int j=2;
        while(j<nums.length)
        {
            if(nums[i-2]!=nums[j])
            {
                nums[i++]=nums[j];
            }
            j++;
        }
        return i;
    }
}