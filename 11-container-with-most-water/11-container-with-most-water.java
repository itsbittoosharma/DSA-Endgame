class Solution {
    public int maxArea(int[] height) {
        int start=0, end=height.length-1;
        int vol=0;
        while(start<end)
        {
            int newVol=Math.min(height[start],height[end])*(end-start);
            vol=Math.max(vol,newVol);
            if(height[start]<height[end])
                start++;
            else end--;
        }
        return vol;
    }
}