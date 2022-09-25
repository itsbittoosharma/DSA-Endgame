class StockSpanner {
    
    Stack<Pair<Integer,Integer>> st1=new Stack<>();
   
    public int next(int price) {
        int val=1;
        while(!st1.isEmpty() && st1.peek().getKey()<=price)
        {
            val+=st1.pop().getValue();
        }
        Pair<Integer,Integer> pair=new Pair<>(price,val);
        st1.push(pair);
        return pair.getValue();
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */