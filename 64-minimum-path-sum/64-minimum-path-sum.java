class Solution {
    public int minPathSum(int[][] grid) {
        return -check(0,0,grid);
    }
    public int check(int i, int j, int[][] grid)
    {
        if(i==grid.length-1 && j==grid[0].length-1) return -grid[i][j];
        if(grid[i][j]>=0) 
        {
            grid[i][j]=-grid[i][j];
            int temp=Integer.MIN_VALUE;
            if(i<grid.length-1) temp=check(i+1,j,grid);
            if(j<grid[0].length-1) temp=Math.max(check(i,j+1,grid),temp);
            grid[i][j]+=temp;
        }
        return grid[i][j];
    }
}