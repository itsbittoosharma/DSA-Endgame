class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i=triangle.size()-1;i>0;i--)
        {
            for(int j=0;j<triangle.get(i).size()-1;j++)
            {
                
                int temp=Math.min(triangle.get(i).get(j),triangle.get(i).get(j+1));
                triangle.get(i-1).set(j,triangle.get(i-1).get(j)+temp);
            }
        }
        return triangle.get(0).get(0);
    }
}