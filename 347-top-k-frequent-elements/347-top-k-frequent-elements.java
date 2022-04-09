class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i: nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(
        (a,b)->hm.get(a)-hm.get(b)
        );
         for (int n: hm.keySet()) {
          pq.add(n);
          if (pq.size() > k) pq.poll();    
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=pq.poll();
        }
        return ans;
    }
}