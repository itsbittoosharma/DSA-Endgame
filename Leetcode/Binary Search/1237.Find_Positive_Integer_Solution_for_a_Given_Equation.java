class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        for(int i = 1; i <= 1000; i++){
            if(customfunction.f(i, 1) > z) break;
            if(customfunction.f(i, 1000) < z) continue;
            int low = 1, high = 1000, mid = low + (high-low)/2;
            while(low <= high){
                if(customfunction.f(i, mid) > z) high = mid - 1;
                else if(customfunction.f(i, mid) < z) low = mid + 1;
                else {
                    List<Integer> res = new ArrayList<>();
                    res.add(i);
                    res.add(mid);
                    ans.add(res);
                    break;
                }
                mid = low + (high-low)/2;
            }
        }
        return ans;
    }
}
