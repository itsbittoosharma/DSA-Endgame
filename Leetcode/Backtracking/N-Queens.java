class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<List<String>();
        ArrayList<String> temp=new ArrayList<String>();
        if(n==1)
        {
            temp.add("Q");
            result.add(new ArrayList<String>(temp));
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                temp.add("");
                for(int j=0;j<n;j++)
                {
                    temp.set(i,temp.get(i)+".");
                }
            }
            // recursion(n,result,temp,0,0,n);
            recursion(n,n,result,temp,0);
        }   
        return result;
    }
    public void recursion(int queen,int n,List<List<String>> result, ArrayList<String> temp,int row)
    {
        
        if(queen==0)
        {
            result.add(new ArrayList(temp));
            return;
        }
        
        for(int i=0;i<n;i++)
        {
            if(isValid(n,temp,row,i))
            {
                String prev = temp.get(row);
                int index=i;
                char ch='Q';
                String str = prev.substring(0, index) + ch
                + prev.substring(index + 1);
                temp.set(row,str);
                recursion(queen-1,n,result,temp,row+1);
                temp.set(row,prev);
            }
        }
        
    }
    public boolean isValid(int n,ArrayList<String> temp,int p, int q)
    {
        for(int i=p-1;i>=0;i--)
        {
            if(temp.get(i).charAt(q)=='Q') return false;
        }
        for(int i=q-1;i>=0;i--)
        {
            if(temp.get(p).charAt(i)=='Q') return false;
        }
        for(int i=p-1,j=q-1;i>=0&&j>=0;i--,j--)
        {
            if(temp.get(i).charAt(j)=='Q') return false;
        }
        for(int i=p-1,j=q+1;i>=0&&j<n;i--,j++)
        {
            if(temp.get(i).charAt(j)=='Q') return false;
        }
        return true;
    }
}