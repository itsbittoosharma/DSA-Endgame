class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        int i;
        int y =n/k;
        int count=0;
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(i=0; i<n; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for(Map.Entry m : hm.entrySet()){
            Integer temp=(Integer)m.getValue();
            if(temp){
                count+=1;
            }
        }
        return count;
     
    }
}
