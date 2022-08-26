class Node{
    int key;
    int value;
    Node next;
    Node prev;
    Node(int key, int val)
    {
        this.key=key;
        value=val;
    }
}
class LRUCache {

    HashMap<Integer,Node> hm=new HashMap<>();
    int size;
    Node head, tail;
    
    public LRUCache(int capacity) {
        size=capacity;
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        
        if(!hm.containsKey(key))
            return -1;
        
        Node temp=hm.get(key);
        temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
        temp.next=head.next;
        temp.next.prev=temp;
        temp.prev=head;
        head.next=temp;
        
        return temp.value;
    }
    
    public void put(int key, int value) {
        
        if(!hm.containsKey(key)) hm.put(key,new Node(key,value));
        else hm.get(key).value=value;
        
        Node temp=hm.get(key);
        if(temp.next!=null)
        {
            temp.next.prev=temp.prev;
            temp.prev.next=temp.next;
        }
        temp.next=head.next;
        temp.prev=head;
        head.next.prev=temp;
        head.next=temp;
        if(hm.size()-1==size)
        {
            hm.remove(tail.prev.key);
            Node node=tail.prev;
            node.prev.next = node.next;
        node.next.prev = node.prev;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */