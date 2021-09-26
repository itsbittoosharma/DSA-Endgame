class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int result=arr[n-1]-arr[0];
        for(int i=0;i<n-1;i++){
            
            if(arr[i+1]<k){
                continue;
            }
                int curr_min=Math.min(arr[0]+k, arr[i+1]-k);
                int curr_max=Math.max(arr[n-1]-k, arr[i]+k);
                result = Math.min(curr_max-curr_min, result);
        }
        return result;
    }
}