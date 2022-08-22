class MyStack {

    Queue<Integer> q;
    Queue<Integer> temp;
    public MyStack() {
        q=new LinkedList<>();
        temp=new LinkedList<>();
    }
    
    public void push(int x) {
        if(q.size()!=0)
        {
            while(q.size()>0)
            {
                temp.add(q.poll());
            }
        }
        q.add(x);
        if(temp.size()!=0)
        {
            while(temp.size()>0)
            {
                q.add(temp.poll());
            }
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        if(q.size()==0) return true;
            else return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */