// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> ans=new ArrayList<Integer>();
        ans.add(1);
        int carry=0;
        for(int i=2;i<=N;i++)
        {
            for(int j=0;j!=ans.size();j++)
            {
                int temp=ans.get(j)*i;
                
                ans.set(j,(temp+carry)%10);
                carry=((temp+carry))/10;
            }
            while(carry!=0)
            {
                ans.add(carry%10);
                carry/=10;
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}