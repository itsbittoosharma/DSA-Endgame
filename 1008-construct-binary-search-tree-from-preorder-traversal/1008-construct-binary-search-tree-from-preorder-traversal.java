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
    public TreeNode bstFromPreorder(int[] preorder) {
        Stack<TreeNode> st=new Stack<>();
        TreeNode root=new TreeNode(preorder[0]);
        st.push(root);
        for(int i:preorder)
        {
            if(i==preorder[0]) continue;
            if(i<st.peek().val)
            {
                TreeNode temp=new TreeNode(i);
                st.peek().left=temp;
                st.push(temp);
            }
            else
            {
                TreeNode temp=st.pop();
                while(!st.isEmpty() && st.peek().val<i)
                {
                    temp=st.pop();
                }
                TreeNode node=new TreeNode(i);
                temp.right=node;
                st.push(node);
            }
        }
        return root;
    }
}