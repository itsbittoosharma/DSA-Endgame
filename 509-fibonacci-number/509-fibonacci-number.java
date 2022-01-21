class Solution {
    public int fib(int n) {
        int i=0,j=1;
        int ans=1;
        if(n<=1) return n;
        for(int p=2;p<=n;p++)
        {
            ans=i+j;
            i=j;j=ans;
        }
        return ans;
        
    }
    
}