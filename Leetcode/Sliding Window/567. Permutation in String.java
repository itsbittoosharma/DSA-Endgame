class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(char a:s1.toCharArray())
        {
            arr1[a-'a']+=1;
        }
        for(int i=0;i<s1.length();i++)
        {
            arr2[s2.charAt(i)-'a']+=1;
        }
        int i=0,j=s1.length()-1;
        if(check(arr1,arr2)) return true;
        while(j<s2.length()-1)
        {
            arr2[s2.charAt(i)-'a']-=1;
            i++; j++;
            arr2[s2.charAt(j)-'a']+=1;
            if(check(arr1,arr2)) return true;
        }
        return false;
    }
    public boolean check(int[] arr1,int[] arr2)
    {
        for(int i=0;i<26;i++)
        {
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }
}