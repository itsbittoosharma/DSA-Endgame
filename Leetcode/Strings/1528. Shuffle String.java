class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ans=new char[indices.length];
        for(int i=0;i<indices.length;i++)
        {
            ans[indices[i]]=s.charAt(i);
        }
        return String.valueOf(ans);
    }
}