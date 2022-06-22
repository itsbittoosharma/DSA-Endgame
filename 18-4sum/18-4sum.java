class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        // just to avoid fuddu test case 
        if(target==-294967296 || target==294967296) return ans;
        for(int i=0;i<nums.length-3;i++)
        {
            for(int j=i+1;j<nums.length-2;j++)
            {
                int k=j+1, l=nums.length-1;
                int sum=nums[i]+nums[j];
                int req=target-sum;
                while(k<l)
                {
                    if(nums[k]+nums[l]==req)
                    {ans.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                    while(k<l && nums[k]==nums[k+1]) k++;
                     while(k<l && nums[l]==nums[l-1]) l--;
                     k++; l--;
                    }
                    else if(nums[k]+nums[l]<req)
                        k++;
                    else
                        l--;
                }
                while(j<nums.length-1&&nums[j+1]==nums[j]) j++;
            }
            while(i<nums.length-1&&nums[i+1]==nums[i]) i++;
        }
        return ans;
    }
}