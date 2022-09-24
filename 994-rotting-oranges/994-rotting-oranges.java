class Solution {
    public int orangesRotting(int[][] grid) {
        int time=0;
        Queue<int[]> q=new LinkedList<>();
        int zero=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
            { if(grid[i][j]==2) q.add(new int[]{i,j});
             if(grid[i][j]!=0) zero=1;}
        if(zero==0) return 0;
        if(q.size()==grid.length*grid[0].length) return 0;
        //if(q.size()==0) return -1;
        System.out.println(q.size());
        while(q.size()>0)
        {
            int k=q.size();
            while(k!=0)
            {   
                k--;
                int temp[]=q.poll();
                int i=temp[0];
                int j=temp[1];
                if(i-1>=0 && grid[i-1][j]==1) {grid[i-1][j]=2; q.add(new int[]{i-1,j});} 
                if(j-1>=0 && grid[i][j-1]==1) {grid[i][j-1]=2; q.add(new int[]{i,j-1});}
                if(i+1<grid.length && grid[i+1][j]==1) {grid[i+1][j]=2; q.add(new int[]{i+1,j});} 
                if(j+1<grid[0].length && grid[i][j+1]==1) {grid[i][j+1]=2; q.add(new int[]{i,j+1});} 
               
            }
             System.out.println(q.size());
            System.out.println();
            time++;
        }
        
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
            if(grid[i][j]==1) return -1;
        return time-1;
    }
}