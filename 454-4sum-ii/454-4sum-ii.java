class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int result=0;
        for(int i:nums1)
        {
            for(int j:nums2)
            {
                hm.put(i+j,hm.getOrDefault(i+j,0)+1);
            }
        }
        for(int i:nums3)
        {
            for(int j:nums4)
            {
                if(hm.containsKey(-(i+j)))
                {
                    result+=hm.get(-(i+j));
                }
            }
        }
        return result;
    }
}