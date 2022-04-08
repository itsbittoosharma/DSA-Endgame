class KthLargest {
    
    PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
    int k1;
    public KthLargest(int k, int[] nums) {
       this.k1=k;
        for(int n:nums)
        {
            add(n);
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>k1) pq.poll();
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */