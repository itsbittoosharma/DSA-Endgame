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
    private void preorder(TreeNode node, List<Integer> dfs ){
        if(node == null) return;
        
        preorder(node.left, dfs);
        preorder(node.right, dfs);
        dfs.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> dfs = new ArrayList<>();
    preorder(root, dfs);
    return dfs;
    }
}