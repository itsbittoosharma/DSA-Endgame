class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //int[] ans = new int[nums2.length];
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums1.length; i++){
             map.put(nums1[i],1);
        }
        int j=0;
        for(int i=0; i<nums2.length; i++){
            if(map.getOrDefault(nums2[i],0)==1){
                ans.add(nums2[i]);
                map.put(nums2[i],0);
            }
        }
        int[] result=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            result[i]=ans.get(i);
        }
        return result;
    }
}