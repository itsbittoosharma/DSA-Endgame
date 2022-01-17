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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if(recursion(root)==-1) return false;
        else return true;
    }
    public int recursion(TreeNode root)
    {
        if(root==null) return 0;
        int left=recursion(root.left);
        int right=recursion(root.right);
        if(left==-1 || right==-1 || Math.abs(left-right)>1) return -1;
        else return Math.max(left,right)+1;
        
    }
}