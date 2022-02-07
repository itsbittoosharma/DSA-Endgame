class Solution {
    public char findTheDifference(String s, String t) {
        int i=0;
        char ans='0';
        for(i=0;i<s.length();i++)
        {
            ans+=(char)(t.charAt(i));
            ans-=(char)(s.charAt(i));
        }
        return (char)(ans+t.charAt(i)-'0');
    }
}