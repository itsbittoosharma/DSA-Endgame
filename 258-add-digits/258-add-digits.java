class Solution {
    public int addDigits(int num) {
        if(num/10==0) return num;
        int sum=0;
        while(num!=0)
        {
            sum+=num%10;
            num/=10;
        }
        return addDigits(sum);
    }
}