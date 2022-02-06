class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n==0 || n==1 || n==2) return 0;
        int k=0;
        int l=n-1;
        int water=0;
        for(int i=0, j=n-1;i<j;)
        {
            if(height[i]<=height[j])
            {
                if(height[i]<height[k])
                 {
                     water+=height[k]-height[i];
                }
                else
                {
                   k=i;
                  }
                i++;
            }
            else
            {
                if(height[j]<height[l])
                 {
                     water+=height[l]-height[j];
                }
                else
                {
                   l=j;
                  }
                j--;
            }
            
        }
        return water;
    }
}