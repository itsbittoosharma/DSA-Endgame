class Solution {
    public int addDigits(int num) {
        if(num/10==0) return num;
        if(num%9==0) return 9;
        else return num%9;
        
        
        
        // if(num/10==0) return num;
        // int sum=0;
        // while(num!=0 || sum/10!=0)
        // {
        //     if(num==0) {num=sum; sum=0;}
        //     sum+=num%10;
        //     num/=10;
        // }
        // return sum;
    }
}