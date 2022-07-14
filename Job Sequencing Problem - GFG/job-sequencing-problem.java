// { Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}// } Driver Code Ends


class Solution
{
    boolean checkavail(int deadline,int dead[])
    {
        deadline-=1;
        if(dead[deadline]==0)
        {
            dead[deadline]=1;
            return true;
        }
        else{
            for(int i=deadline-1;i>=0;i--)
            {
                if(dead[i]==0)
                {
                    dead[i]=1;
                    return true;
                }
            }
            
        }
        return false;
    }
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        if(arr==null) return new int[]{0,0};
        if(arr.length==1) return new int[]{1,arr[0].profit};
        int max=0;
        int maxdead=0;
        for(Job i:arr) maxdead=Math.max(maxdead,i.deadline);
        Arrays.sort(arr,(a, b) -> b.profit - a.profit);
        if(maxdead==1) return new int[]{1,arr[0].profit};
        int profit=0;
        int[] dead=new int[maxdead];
        int c=0;
        for(int i=0;i<maxdead;i++) dead[i]=0;
        for(Job i:arr)
        {
            if(checkavail(i.deadline,dead))
            {
                profit+=i.profit;
                c+=1;
            }
        }
        
        
        
        return new int[]{c,profit};
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/