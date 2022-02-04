class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;
        int maxLength=0;
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            count+=(nums[i]==1?1:-1);
            if(hm.containsKey(count))
            {
                maxLength=Math.max(maxLength,i-hm.get(count)); 
            }
            else
                hm.put(count,i);
        }
        return maxLength;
    }
}