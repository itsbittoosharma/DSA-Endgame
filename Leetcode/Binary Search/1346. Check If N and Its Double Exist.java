class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i:arr)
        {
            if(i==0) 
            {
                if(arr.length>1 && arr[1]==0) return true;
                else continue;
            }
            int b=binSearch(arr,i*2);
            if(b!=-1) return true;
        }
        return false;
    }
    public int binSearch(int[]arr,int t)
    {
        int l=0,r=arr.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]==t) return 1;
            else if(arr[mid]<t) l=mid+1;
            else r=mid-1;
        }
        return -1;
    }
}