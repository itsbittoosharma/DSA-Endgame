class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int i;
        int count=0;
        for(i=0; i<n;i++){
           if(arr[i]<k){
               int element=k-arr[i];
               if(m.containsKey(element)){
                   count+=m.get(element);
               }
               if(m.get(arr[i])==null){
                   m.put(arr[i], 0);
               }
               m.put(arr[i], m.get(arr[i])+1);
           }
           
        }
        return count;
    }
}
