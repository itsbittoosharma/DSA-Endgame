class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        for(int i=0;i<strs.length;i++)
        {
            if(i==0) ans=new String(strs[0]);
            if(strs[i].equals("")) {return strs[i];}
            for(int j=1;j<=strs[i].length();j++)
            {
                if(ans.indexOf(strs[i].substring(0,j))!=0)
                {
                    ans=new String(strs[i].substring(0,j-1));
                    break;
                }
                if(j==strs[i].length())
                {
                    ans=new String(strs[i].substring(0,j));
                }
            }
            if(ans.equals("")) break;
        }
        return ans;
    }
}