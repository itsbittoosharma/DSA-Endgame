class Solution {
    public int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums);
        int maximized_sum=0;
        int n=nums.length;
        for(int i=0; i<n; i+=2){
            maximized_sum += nums[i];
        }
        return maximized_sum;
    }
}
