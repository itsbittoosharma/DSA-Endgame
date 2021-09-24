class Solution {
    public int[] twoSum(int[] nums, int target) {
     int[] ans = new int[2];
     HashMap<Integer, Integer> m=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
           int rem=target-nums[i];
           if(m.containsKey(rem)){
               ans[0]=m.get(rem);
               ans[1]=i;
               return ans;
           }
            m.put(nums[i], i);
        }
        return ans;
    }
}