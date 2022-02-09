class Solution {
    public int uniquePaths(int m, int n) {
        int[] x=new int[n];
        Arrays.fill(x,1);
        return check(m,n,x);
    }
    public int check(int m, int n, int[] arr)
    {
        int temp=1;
        for(int k=1;k<m;k++)
        {
        for(int i=1;i<arr.length;i++)
        {
            temp=temp+arr[i];
            arr[i]=temp;
        }
        temp=1;
        }
        return arr[n-1];
    }
}