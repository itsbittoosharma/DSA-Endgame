class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        helper(candidates, 0, target, list, new ArrayList<>());
        return list;
    }
    public void helper(int[] arr, int ind, int target, List<List<Integer>> list, ArrayList<Integer> temp)
    {
        if(target==0) {list.add(new ArrayList<>(temp)); return;}
        if(ind==arr.length) return;
        helper(arr, ind+1, target, list, temp);
        if(arr[ind]<=target) 
        {
            temp.add(arr[ind]);
            helper(arr, ind, target-arr[ind],list,temp);
            temp.remove(temp.size()-1);
        }
        
    }
}