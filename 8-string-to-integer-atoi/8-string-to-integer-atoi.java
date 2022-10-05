class Solution {
    public int myAtoi(String s) {
        long ans=0;
        s=s.trim();
        if(s.length()==0) return 0;
        boolean positive=true;
        if(s.charAt(0)=='-') {
            positive=false;
            s=s.substring(1);
        }
        else if(s.charAt(0)=='+')
            s=s.substring(1);
        int i=0;
        for(;i<s.length();i++)
        {
            if(s.charAt(i)!='0') break; 
        }
        if(i>0) s=s.substring(i);
        i=0; long pow=10;
        for(;i<s.length();i++)
        {
            
            if(s.charAt(i)<48 || s.charAt(i)>57) break;
            ans*=pow;
            ans+=s.charAt(i)-48;
            if(positive && ans>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
            else if(ans>Integer.MAX_VALUE) return Integer.MIN_VALUE;
        }
        if(!positive) return 0-(int)ans;
        return (int)ans;
    }
}