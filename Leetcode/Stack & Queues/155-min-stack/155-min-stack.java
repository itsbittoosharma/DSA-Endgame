class MinStack {

    int min=Integer.MAX_VALUE;
    Stack<Integer> st;
    public MinStack() {
        st=new Stack<Integer>();
    }
    
    public void push(int val) {
        if(val<=min)
        {
            st.push(min);
            min=val;
        }
        st.push(val);     
    }
    
    public void pop() {
        if(st.pop()==min) min=st.pop();
    }
    
    public int top() {
       return st.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */