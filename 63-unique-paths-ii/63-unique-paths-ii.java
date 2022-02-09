class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return -check(0,0,obstacleGrid);
    }
    public int check(int i, int j, int[][] arr)
    {
        if(i==arr.length-1 && j==arr[0].length-1 && arr[i][j]!=1) return -1;
        if(arr[i][j]==1) return 0;
        if(arr[i][j]<0) return arr[i][j];
        if(i<arr.length-1) arr[i][j]+=check(i+1,j,arr);
        if(j<arr[0].length-1) arr[i][j]+=check(i,j+1,arr);
        return arr[i][j];
    }
}