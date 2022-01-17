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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        if(root==null) return ans;
        q.add(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            ArrayList<Integer> sub=new ArrayList<Integer>();
            for(int i=0;i<n;i++)
            {
            TreeNode temp=q.poll();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
        sub.add(temp.val);}
            ans.add(sub);
        }
        return ans;
    }
}