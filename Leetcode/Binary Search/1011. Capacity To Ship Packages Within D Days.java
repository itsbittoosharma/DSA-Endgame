class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0,right=0;
        for(int i:weights)
        {
            left=Math.max(left,i);
            right+=i;
        }
        int mid=0;
        while(left<right)
        {
            mid=left+(right-left)/2;
            int sum=0;
            int day=1;
            for(int k:weights)
            {
                if(k+sum>mid)
                {
                    sum=k;
                    day++;
                }
                else sum+=k;
            }
            if(day>days) left=mid+1;
            else right=mid;
        }
        return right;    // or   return left; (Same thing)
    }
}