class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans1=new ArrayList<List<Integer>>();
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Arrays.sort(candidates);
        recursion(candidates, 0, target, new ArrayList<>(), ans1);
        return ans1;
    }
    public void recursion(int[] nums, int index, int target, ArrayList<Integer> ans, List<List<Integer>> ans1)
    {
        if(index==nums.length)
        {
            if(target==0) {ans1.add(new ArrayList<>(ans)); return;}
         return;
        }    
        if(target==0)
        {
            ans1.add(new ArrayList<>(ans)); return;
        }
        if(nums[index]<=target)
        {
            ans.add(nums[index]);
            recursion(nums, index,target-nums[index],ans,ans1);
            ans.remove(ans.size()-1);
            recursion(nums,index+=1,target,ans,ans1);
    }
}
}