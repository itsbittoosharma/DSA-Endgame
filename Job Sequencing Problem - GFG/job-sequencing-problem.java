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
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        HashSet<Integer> hs=new HashSet<>();
        Arrays.sort(arr,(a,b)->b.profit-a.profit );
        int profit=0;
        for(int i=0;i<n;i++)
        {
            if(!hs.contains(arr[i].deadline)) 
            {
                hs.add(arr[i].deadline);
                profit+=arr[i].profit;
            }
            else
            {
                int tempDeadline=arr[i].deadline;
                while(tempDeadline!=0)
                {
                    if(!hs.contains(tempDeadline)) break;
                    tempDeadline--;
                }
                if(tempDeadline>0) 
                {
                    hs.add(tempDeadline);
                    profit+=arr[i].profit;
                }
            }
        }
        return new int[]{hs.size(),profit};
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