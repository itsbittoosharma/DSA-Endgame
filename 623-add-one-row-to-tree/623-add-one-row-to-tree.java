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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        Queue<TreeNode> nodes=new LinkedList<>();
        nodes.add(root);
        if(depth==1)
        {
            TreeNode temp=new TreeNode(val,root,null);
            return temp;
        }
        while(depth>2)
        {
            int k=nodes.size();
            while(k>0)
            {
                TreeNode temp=nodes.poll();
                if(temp.left!=null) nodes.add(temp.left);
                if(temp.right!=null) nodes.add(temp.right);
                k--;
            }
            depth--;
        }
        while(nodes.size()>0)
        {
            TreeNode temp=nodes.poll();
            temp.left=new TreeNode(val,temp.left,null);
            temp.right=new TreeNode(val,null,temp.right);
        }
        return root;
    }
}