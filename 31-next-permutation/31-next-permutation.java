class Solution {
    public void nextPermutation(int[] nums) {
        int j=nums.length-1;
        int i=j-1;
        while(i>=0 && nums[i]>=nums[j])
        {
            i--;
            j--;
        }
        if(i>=0)
        {
            int temp=nums[i];
            int k;
            for(k=i+1;k<nums.length &&nums[k]>temp;)
            {
                k++;
            }
            temp=nums[k-1];
            nums[k-1]=nums[i];
            nums[i]=temp;
        }
        Arrays.sort(nums,j,nums.length);
    }
}