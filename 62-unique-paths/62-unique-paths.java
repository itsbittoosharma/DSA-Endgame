class Solution {
    public int uniquePaths(int m, int n) {
        int[][] arr=new int[m][n];
        return check(m,n,0,0,arr);
    }
    public int check(int m, int n, int i, int j,int[][] arr)
    {
        if(i==m-1&&j==n-1) return 1;
        if(arr[i][j]!=0)
        {
            
            return arr[i][j];
        }
        if(i<m-1) arr[i][j]+=check(m,n,i+1,j,arr);
        if(j<n-1) arr[i][j]+=check(m,n,i,j+1,arr);
        return arr[i][j];
    }
}