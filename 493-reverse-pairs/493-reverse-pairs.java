class Solution {
    public int merge(int[] nums, int low, int mid, int high)
    {
        int ans = 0;
        int j = mid + 1; 
       for(int i = low;i<=mid;i++) {
            
            while(j<=high && nums[i] > (2 * (long) nums[j])) {
                j++;
            }
            ans+=j-mid-1; //(j-(mid+1))
          
        }
        ArrayList<Integer> temp=new ArrayList<>();
        int i=low;
        j=mid+1;
        while(i<=mid&&j<=high)
        {
            temp.add(nums[i]<nums[j]?nums[i++]:nums[j++]);
        }
        while(i<=mid)
            temp.add(nums[i++]);
        while(j<high)
            temp.add(nums[j++]);
        i=0;
        for(;i<temp.size();i++)
        {
            nums[low++]=temp.get(i);
        }
        return ans;
    }
    public int mergeSort(int[] nums, int low, int high)
    {
        int ans=0;
       if(low>=high) return 0;
        
            int mid=low+(high-low)/2;
            
            ans+=mergeSort(nums,low,mid);
            ans+=mergeSort(nums,mid+1,high);
            ans+=merge(nums,low,mid,high);
        
        return ans;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
}