class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length, n2=nums2.length;
        if(n1>n2) return findMedianSortedArrays(nums2,nums1);
        int partition1=0;
        int partition2=0;
        int low=0, high=n1;
        while(low<=high)
        {
            partition1=(low+high)/2;
            partition2=(n1+n2+1)/2-partition1;
            int[] temp=new int[4];
            temp[0]=partition1==0?Integer.MIN_VALUE:nums1[partition1-1];
            temp[1]=partition2==0?Integer.MIN_VALUE:nums2[partition2-1];
            temp[2]=partition1==n1?Integer.MAX_VALUE:nums1[partition1];
            temp[3]=partition2==n2?Integer.MAX_VALUE:nums2[partition2];
            if(temp[0]<=temp[3] && temp[1]<temp[2]) 
            {
                if((n1+n2)%2!=0) return Math.max(temp[1],temp[0]);
                else return (Math.max(temp[0],temp[1])+Math.min(temp[2],temp[3]))/2.0;
            }
            else if(temp[0]>temp[3]) high=partition1;
            else low=partition1+1;
        }
        return 1.00;
    }
}