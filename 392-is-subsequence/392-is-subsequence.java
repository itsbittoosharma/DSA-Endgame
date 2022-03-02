class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int ans=0;
        for(char a:s.toCharArray())
        {
            while(i<t.length())
            {
                if(t.charAt(i)==a)
                {
                    ans++;
                    i++;
                    break;
                }
                i++;
            }
        }
        if(ans==s.length()) return true;
        return false;
    }
}