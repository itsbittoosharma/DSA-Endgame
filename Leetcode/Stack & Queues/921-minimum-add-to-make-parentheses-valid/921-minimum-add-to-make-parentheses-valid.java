class Solution {
    public int minAddToMakeValid(String s) {
        int wrong=0;
        Stack<Character> st=new Stack<Character>();
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                st.push(')');
            }
            else
            {
                if(!st.empty()&&st.peek()==')')
                    st.pop();
                else
                    wrong+=1;
            }
            
        }
        wrong+=st.size();
        return wrong;
    }
}