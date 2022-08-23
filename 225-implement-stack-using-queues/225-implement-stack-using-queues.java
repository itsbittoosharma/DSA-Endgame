class MyStack {
    Queue<Integer> queue;
    public MyStack() {
        queue=new LinkedList<>();
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        int size=queue.size();
        while(size!=1)
        {
            queue.add(queue.poll());
            size--;
        }
        return queue.poll();
    }
    
    public int top() {
        int size=queue.size();
        while(size!=1)
        {
            queue.add(queue.poll());
            size--;
        }
        int temp = queue.peek();
        queue.add(queue.poll());
        return temp;
    }
    
    public boolean empty() {
        return queue.size()==0;
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