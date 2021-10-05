class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans_size=(nums.length)*2;
        int[] ans = new int[ans_size];
        for(int i=0; i<nums.length; i++){
            ans[i]=nums[i];
            ans[nums.length+i]=nums[i];

            return ans;
        }
      
    }

}     
    