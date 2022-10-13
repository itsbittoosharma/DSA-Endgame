
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode curr=root;
        while(curr!=null)
        {
            if(curr.val==val) return curr;
            if(curr.val<val) curr=curr.right;
            else curr=curr.left;
        }
        return null;
    }
}