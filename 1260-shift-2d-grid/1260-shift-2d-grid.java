class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length, n=grid[0].length;
        int dimension=m*n;
        k%=dimension;
        int start=dimension-k;
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        for(int i=0;i<grid.length;i++)
        {
            ans.add(new ArrayList<>());
        }
        int count=0;
        for(int i=start;i<start+dimension;i++)
        {
            int row=(i/n)%m, col=i%n;
            ans.get(count/n).add(grid[row][col]);
            count++;
        }
        return ans;
    }
}