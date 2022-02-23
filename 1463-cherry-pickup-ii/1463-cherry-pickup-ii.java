class Solution {
    int[][][] dp;
    public int cherryPickup(int[][] grid) {
        dp=new int[grid.length][grid[0].length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                for (int k = 0; k < grid[0].length; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        int max=dfs(0,0,grid[0].length-1,grid);
        return max;
    }
    public int dfs(int r1, int c1, int c2, int[][] grid)
    {
        if(c1<0 || c2>=grid[0].length ||
          c2<0 || c1>=grid[0].length)
        {
            return 0;
        }
        if(dp[r1][c1][c2]!=-1)
        {
            return dp[r1][c1][c2];
        }
        int cherry=c1==c2?grid[r1][c1]:grid[r1][c1]+grid[r1][c2];
        int temp=0;
        if(r1!=grid.length-1)
        {        
            for(int i=-1;i<2;i++)
            {
                for(int j=-1;j<2;j++)
                {
                    temp=Math.max(dfs(r1+1,c1+i,c2+j,grid),temp);
                }
            }
        }
        return dp[r1][c1][c2]=cherry+temp;
    }
}