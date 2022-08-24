class Solution {
    public String reverseWords(String s) {
        String ans="";
        String temp="";
        int prev=0;
        for(int i=0;i<=s.length();i++)
        {
            if(i==s.length() || s.charAt(i)==' ')
            {
                temp=s.substring(prev,i);
                if(temp!="") { ans=" "+temp+ans; }
                prev=i+1;
            }
        }
        return ans.trim();
    }
}