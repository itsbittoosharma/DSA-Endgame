class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=0;
        for(int[] acc : accounts){
            int sum=0;
            for(int s : acc){
            sum= sum+s;
            }
        ans= Math.max(ans, sum);
        }
        return ans;
    }   
}