class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        Arrays.sort(strs);
        int count=0;
        for(int i=0;i<strs[0].length() && i<strs[strs.length-1].length() ;i++)
        {
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i))
            {
                count++;
            }
            else
            {
                break;
            }
        }
        return count==0?"":new String(strs[0].substring(0,count));
    }
}