class Solution {
    public int minFallingPathSum(int[][] matrix) {
        for(int i=matrix.length-2;i>=0;i--)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                int temp=matrix[i+1][j];
                if(j>0) temp=Math.min(temp,matrix[i+1][j-1]);
                if(j<matrix[0].length-1) temp=Math.min(temp,matrix[i+1][j+1]);
                matrix[i][j]+=temp;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i:matrix[0])
        {
            min=Math.min(min,i);
        }
        return min;
    }
}