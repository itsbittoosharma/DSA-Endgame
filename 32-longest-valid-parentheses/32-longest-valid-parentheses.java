class Solution {
    public int longestValidParentheses(String s) {
        int length=0;
        int max=0;
        Stack<Integer> st=new Stack<Integer>();
        st.push(-1);
        int i=0;
        for(char a:s.toCharArray())
        {
            if(a=='(')  st.push(i);
            else {
                if(!st.isEmpty()) {
                    st.pop();
                    if(st.isEmpty()){
                        st.push(i);
                    }
                    else
                    length=i-st.peek();
                }
            }
            
            max=Math.max(max,length);
            
            i++;
        }
        return max;
    }
}