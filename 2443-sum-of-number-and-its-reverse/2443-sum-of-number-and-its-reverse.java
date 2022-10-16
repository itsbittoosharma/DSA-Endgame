class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=num/2;i<=num;i++)
        {
            if(i+rev(i)==num) return true;
        }
        return false;
    }
    public int rev(int n)
    {
        int ans=0;
        while(n!=0)
        {
            ans*=10;
            int temp=n%10;
            ans+=temp;
            n/=10;
        }
        return ans;
    }
}