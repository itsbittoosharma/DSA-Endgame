class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int ans=0;
        for(int i:nums)
            hs.add(i);
        for(int i:nums)
        {
            if(!hs.contains(i-1))
            {
                int curr=1;
                int j=1;
                while(hs.contains(i+j))
                {
                    curr++;
                    j++;
                }
                ans=Math.max(ans,curr);
            }
        }
        return ans;
    }
}