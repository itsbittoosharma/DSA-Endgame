import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends



class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
       int top=0, left=0, right=c-1, bottom=r-1;
       int d=0;
       ArrayList<Integer> res=new ArrayList<Integer>();
       while(top<=bottom && left<=right)
       {    if( d==0){
           for(int i=left;i<=right;i++)
           {
               res.add(matrix[top][i]);
           }   top++;}
           else if( d==1) {
           for(int i=top;i<=bottom;i++)
           {
               res.add(matrix[i][right]);
           }   right--;}
           else if( d==2) {
           for(int i=right;i>=left;i--)
           {
               res.add(matrix[bottom][i]);
           }   bottom--;}
           else if( d==3){
           for(int i=bottom;i>=top;i--)
           {
               res.add(matrix[i][left]);
           }   left++;}
           d=(d+1)%4;
       } return res;
    }
}
