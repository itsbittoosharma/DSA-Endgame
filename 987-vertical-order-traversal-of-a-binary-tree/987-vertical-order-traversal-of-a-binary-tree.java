/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> tm=new TreeMap<>();
        dfs(root,0,0,tm);
        List<List<Integer>> result=new ArrayList<>();
        for(int i:tm.keySet())
        {
            ArrayList<Integer> temp=new ArrayList<Integer>();
            TreeMap<Integer,PriorityQueue<Integer>> temp1=tm.get(i);
            for(int j: temp1.keySet())
            {
                while(temp1.get(j).size()>0)
                temp.add(temp1.get(j).poll());
            }
            result.add(temp);
        }
        return result;
    }
    public void dfs(TreeNode node,int level,int col,TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> tm)
    {
        if(node==null) return;
        tm.putIfAbsent(col,new TreeMap<Integer,PriorityQueue<Integer>>());
        tm.get(col).putIfAbsent(level,new PriorityQueue<Integer>());
        tm.get(col).get(level).add(node.val);
        // System.out.println(tm.get(col).get(level).peek());
        dfs(node.left,level+1,col-1,tm);
        dfs(node.right,level+1,col+1,tm);
    }
}