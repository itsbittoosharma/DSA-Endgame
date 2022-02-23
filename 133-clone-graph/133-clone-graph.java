/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    HashMap<Integer,Node> hm=new HashMap<Integer,Node>();
    public Node cloneGraph(Node node) {
        if(node == null) return null;
            if(hm.containsKey(node.val)) return hm.get(node.val);
        Node start=new Node(node.val);
        hm.put(node.val,start);
        List<Node> temp=new ArrayList<Node>();
        for(int i=0;i<node.neighbors.size();i++)
        {
            temp.add(cloneGraph(node.neighbors.get(i)));
            
        }
        start.neighbors=temp;
        return start;
    }
}