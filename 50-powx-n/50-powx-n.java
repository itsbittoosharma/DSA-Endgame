class Solution {
    public double myPow(double x, int n) {
        long t=n;
        if(n<0) t=-t;
        if(n==0) return 1.00;
        double ans=1;
        
        while(t>0)
        {
            if(t%2==1)
            {
                ans*=x; t--;
            }
            else
            {
                x*=x;   t/=2;
            }
        }
        return n<0?(1/ans):ans;
    }
}