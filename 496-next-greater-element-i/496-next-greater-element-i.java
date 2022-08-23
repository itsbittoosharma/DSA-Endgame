class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i: nums2)
        {
            if(st.empty() || st.peek()>i)
                st.push(i);
            else{
                while(!st.empty() && st.peek()<i)
                {
                    hm.put(st.pop(),i);
                }
                st.push(i);
            }
        }
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i]=hm.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}