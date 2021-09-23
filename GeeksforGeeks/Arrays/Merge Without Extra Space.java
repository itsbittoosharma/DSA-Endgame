//Initial Template for Java

import java.util.*;
import java.io.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    long arr1[] = new long[n];
		    long arr2[] = new long[m];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr1[i] = Long.parseLong(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++){
		        arr2[i] = Long.parseLong(inputLine[i]);
		    }
		    Solution ob = new Solution();
		    ob.merge(arr1, arr2, n, m);
		    
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr1[i]+" ");
		    }
		    for(int i=0; i<m; i++){
		        str.append(arr2[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}
// } Driver Code Ends

class Solution
{
   public static void swap(long arr1[], long arr2[], int n, int m)
    {
        long temp=arr1[n];
        arr1[n]=arr2[m];
        arr2[m]=temp;
    }
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
       int gap=(m+n);
       gap=(gap/2)+(gap%2);
       
    //   int i=0;int j=i+gap;
       while(gap>=1)
       {  
           
           int i=0;int j=i+gap;
           while(j<n)
           {
               if (arr1[i] > arr1[j])
               swap(arr1,arr1,i,j);
               i++;j++;
           }
           if(gap>n) j=gap-n;
           else j=0;
           while(j<m&&i<n)
           {
               if (arr1[i] > arr2[j])
               swap(arr1,arr2,i,j);
               i++;j++;
           }
           if(j<m){
           i=0; j=i+gap;
           while(j<m)
           {
               if (arr2[i] > arr2[j])
               swap(arr2,arr2,i,j);
               i++;j++;
           }}
           if(gap==1) gap=0;
           gap=(gap/2)+(gap%2);
       }
    }
}
