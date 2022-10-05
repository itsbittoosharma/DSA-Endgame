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
        if(depth==2)
        {
            root.left=new TreeNode(val,root.left,null);
            root.right=new TreeNode(val,null,root.right);
        }
        else
        {
            if(root.left!=null) addOneRow(root.left,val,depth-1);
            if(root.right!=null) addOneRow(root.right,val,depth-1);
        }
        return root;
    }
}