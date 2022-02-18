class Solution {
    public String removeKdigits(String num, int k) {
        if(k==num.length()) return "0";
        Stack<Character> st=new Stack<>();
        for(char i:num.toCharArray())
        {
            while(!st.isEmpty() && st.peek()>i && k>0)
            {
                st.pop();
                k--;
            }
            st.push(i);
        }
        while(k>0)
        {
            st.pop();
            k--;
        }
        StringBuilder str1 = new StringBuilder();
        while(!st.isEmpty())
        {
            str1.append(st.pop());
        }
        str1.reverse();
        while(str1.length()>1 && str1.charAt(0)=='0')
        {
            str1.deleteCharAt(0);
        }
        return str1.toString();
    }
}