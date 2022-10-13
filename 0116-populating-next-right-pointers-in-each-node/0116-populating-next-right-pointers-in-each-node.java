class Solution {
    public Node connect(Node root) {
        Queue<Node> q=new LinkedList<>();
        if(root==null) return null;
        q.add(root);
        while(q.size()>0)
        {
            int size=q.size();
            while(size>0)
            {
                Node temp=q.poll();
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                if(size>1) temp.next=q.peek();
                size--;
            }
        }
        return root;
    }
}