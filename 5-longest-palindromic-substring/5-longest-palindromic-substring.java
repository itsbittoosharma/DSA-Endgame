class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        if(s.length()>0) ans=Character.toString(s.charAt(0));
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        char[] a=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(st1.size()==0 || (st1.peek()!=a[i] && (i!=s.length()-1 && st1.peek()!=a[i+1])))
            {
                st1.push(a[i]);
            }
            else {if(st1.peek()==a[i])
            {
                int j=i;
                int count=0;
                String temp="";
                while(!st1.isEmpty()&&j<a.length&&st1.peek()==a[j])
                {
                    temp=a[j]+temp+a[j];
                    count+=2;
                    st2.push(st1.pop());
                    j++;
                }
                while(!st2.isEmpty())
                    st1.push(st2.pop());
                if(count>ans.length()) ans=new String(temp);
            }
            if(i!=s.length()-1 && st1.peek()==a[i+1])
            {
                int j=i+1;
                int count=1;
                String temp=Character.toString(a[i]);
                while(!st1.isEmpty()&&j<a.length&&st1.peek()==a[j])
                {
                    temp=a[j]+temp+a[j];
                    count+=2;
                    st2.push(st1.pop());
                    j++;
                }
                while(!st2.isEmpty())
                    st1.push(st2.pop());
                if(count>ans.length()) ans=new String(temp);
            }
                 st1.push(a[i]);
                 }
        }
        return ans;
    }
}