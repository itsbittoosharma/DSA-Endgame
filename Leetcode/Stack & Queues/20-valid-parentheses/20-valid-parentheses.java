class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        for(char a:s.toCharArray())
        {
            if(a=='(')
            {
                st.push(')');
            }
            else if(a==('['))
            {
                st.push(']');
            }
            else if(a==('{'))
            {
                st.push('}');
            }
            else
            {
                if(st.size()==0 || st.pop()!=a) return false;
            }
            
        }
        return st.size()==0;
    }
}
