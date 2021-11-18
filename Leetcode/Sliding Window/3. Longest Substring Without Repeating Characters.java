class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int i=0,j=0;
        int max=0;
        Set<Character> memory=new HashSet<Character>();
        while(j<s.length())
        {
            if(!memory.contains(s.charAt(j)))
            {
                memory.add(s.charAt(j));
                max=Math.max(max,memory.size());
                j++;
            }
            else{
                memory.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}