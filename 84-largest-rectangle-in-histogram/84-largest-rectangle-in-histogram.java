class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=0;
        int[]left=new int[heights.length];
        int[]right=new int[heights.length];
        left[0]=-1;
        for(int i=1;i<heights.length;i++)
        {
            int p=i-1;
            while(p>=0 && heights[p]>=heights[i])
            {
                p=left[p];   
            }
            left[i]=p;
        }
        for(int i=heights.length-1;i>=0;i--)
        {
            int p=i+1;
            while(p<=heights.length-1 && heights[p]>=heights[i])
            {
                p=right[p];   
            }
            right[i]=p;
        }
        for(int i=0;i<heights.length;i++)
        {
            System.out.println(left[i]+" "+right[i]);
            max=Math.max(max,heights[i]*(right[i]-left[i]-1));
        }
        return max;
    }
}