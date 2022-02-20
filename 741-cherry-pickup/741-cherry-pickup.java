class Solution {
    int[][][] dp;
    
    public int cherryPickup(int[][] grid) {
        
        //Initializing 3-Dimensional DP Array
        int n=grid.length;
        dp=new int[n][n][n];
        
        int max=func(0,0,0,grid);
        return max<0?0:max;
    }
    public int func(int r1, int c1, int c2, int[][] grid)
    {
        int r2=r1+c1-c2;
        int n=grid.length;
        
        if(r1>=n || r2>=n || c1>=n || c2>=n ||
           grid[r1][c1]==-1 || grid[r2][c2]==-1)
            return Integer.MIN_VALUE;
        
        if(dp[r1][c1][c2]!=0) return dp[r1][c1][c2];
        
        if(r1==n-1 && c1==n-1) return grid[r1][c1];
        
        int ans=0;
        if(r1!=r2) ans=grid[r1][c1]+grid[r2][c2];
        else ans=grid[r1][c1];
        
        int downdown=func(r1+1,c1,c2,grid);
        int downright=func(r1+1,c1,c2+1,grid);
        int rightdown=func(r1,c1+1,c2,grid);
        int rightright=func(r1,c1+1,c2+1,grid);
        
        return dp[r1][c1][c2]=ans+Math.max(downdown,Math.max(downright,(Math.max(rightright,rightdown))));
        
    }
}