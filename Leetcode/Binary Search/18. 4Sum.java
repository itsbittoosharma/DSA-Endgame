class Solution {
    public int binsearch(int[] nums,int target,int l,int r)
    {
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) l=mid+1;
            else r=mid-1;
        }
        return -1;
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        int n=nums.length;
        int oi=0;
        ArrayList<String> strArr=new ArrayList<String>();
        for(int i=0;i<n-3;i++)
        {
            for(int j=i+1;j<n-2;j++)
            {
                for(int k=j+1;k<n-1;k++)
                {
                    int _3sum=nums[i]+nums[j]+nums[k];
                    int search=binsearch(nums,target-_3sum,k+1,n-1);
                    if(search!=-1)
                    {
                        String str=Integer.toString(nums[i])+" "+Integer.toString(nums[j])+" "+Integer.toString(nums[k])+" "+Integer.toString(nums[search]);
                        if(!strArr.contains(str))
                        {
                            strArr.add(str);
                            ans.add(new ArrayList<Integer>());
                            ans.get(oi).add(nums[i]);
                            ans.get(oi).add(nums[j]);
                            ans.get(oi).add(nums[k]);
                            ans.get(oi).add(nums[search]);
                            oi++;
                        }
                    }
                 }   
                    
                }
            }
        return ans;
    }
}
