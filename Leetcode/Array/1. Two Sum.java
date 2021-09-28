import java.util.HashMap;

//Brute-force with O(n^2)

class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] ans =new int[2];
        for(int i=0;i<nums.length;i++)
        {
            
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return new int[0];
    }
}

//O(n) using hashmap

class Solution1 {
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