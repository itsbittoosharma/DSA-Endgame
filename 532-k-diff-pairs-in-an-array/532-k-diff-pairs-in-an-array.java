class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums.length==0 || k<0) return 0;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int ans=0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet())
        {
            if(k==0 && entry.getValue()>1) ans++;
            else if(k>0)
            {
                if(hm.containsKey(entry.getKey()+k)) ans++;
            }
        }
        return ans;
    }
}