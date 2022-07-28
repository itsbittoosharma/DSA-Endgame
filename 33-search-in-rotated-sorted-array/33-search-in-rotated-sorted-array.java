class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int i=n-1;
        for(i=n-1;i>=0;i--)
        {
            if(i==0) break;
            if(nums[i-1]>nums[i]) break;
        }
        int j;
        if(i==0) j=n-1;
        else j=i+(n-1);
        
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(nums[mid%n]==target) return mid%n;
            else if(nums[mid%n]<target) i=mid+1;
            else j=mid-1;
        }
        return -1;
    }
}