class Solution {
    public String reverseWords(String s) {
        Stack<String> st=new Stack<>();
        int prev=0;
        for(int i=0;i<=s.length();i++)
        {
            if(i==s.length() || s.charAt(i)==' ')
            {st.push(s.substring(prev,i)); prev=i+1;}
        }
        s="";
        while(!st.isEmpty())
        {
            if(st.peek()=="") st.pop();
            else s=s+" "+st.pop();
        }
        return s.trim();
    }
}