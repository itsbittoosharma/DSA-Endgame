class Solution {
    public String getPermutation(int n, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        String ans="";
        int fact=1;
        int i=1;
        for(i=1;i<n;i++)
        {
            fact*=i;
            arr.add(i);
        }
        arr.add(i);
        k--;
        while(true)
        {
            ans=ans+arr.get(k/fact);
            arr.remove(k/fact);
            if(arr.size()==0) break;
            k=k%fact;
            fact=fact/arr.size();
        }
        return ans;
    }
}