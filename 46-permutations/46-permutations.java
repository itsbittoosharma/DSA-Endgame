class Solution {
    public void swap(List<Integer> temp,int i,int j)
    {
        int t=temp.get(i);
        temp.set(i,temp.get(j));
        temp.set(j,t);
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        for(int i:nums) temp.add(i);
        helper(nums.length,ans,temp,0);
        return ans;
    }
    public void helper(int n,List<List<Integer>> ans,List<Integer> temp, int ind)
    {
        if(ind==n)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind;i<n;i++)
        {
            swap(temp,ind,i);
            helper(n,ans,temp,ind+1);
            swap(temp,ind,i);
        }
    }
}