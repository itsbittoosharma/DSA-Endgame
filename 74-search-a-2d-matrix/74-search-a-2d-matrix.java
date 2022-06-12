class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start=0, end=(matrix.length)*(matrix[0].length)-1;
        while(end>=start)
        {
            int mid=start+(end-start)/2;
            int row=mid/matrix[0].length;
            int col=mid%matrix[0].length;
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]<target) start=mid+1;
            else end=mid-1;
        }
        return false;
    }
}