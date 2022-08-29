class LFUCache {
    HashMap<Integer,NodeList> freq=new HashMap<>();
    HashMap<Integer,Node> hm=new HashMap<>();
    int capacity;
    int leastFreq=1;
    public LFUCache(int capacity) {
        this.capacity=capacity;
    }

    // public static void main(String[] args) {
    //     Solution a=new Solution(2);
    //     a.put(1,1);
    //     a.put(2,2);
    //     System.out.println(a.get(1));
    //     a.put(3,3);
    //     System.out.println(a.get(2));
    //     System.out.println(a.get(3));
    //     a.put(4,4);
    //     System.out.println(a.get(1));
    //     System.out.println(a.get(3));
    //     System.out.println(a.get(4));
    // }

    public int get(int key) {
        if(hm.containsKey(key))
        {
            Node temp=hm.get(key);
            remove(temp);
            if(!freq.containsKey(leastFreq))
                leastFreq++;
            temp.freq++;
            insert(temp);

            return temp.value;
        }
        else
        {
            return -1;
        }
    }

    public void put(int key, int value) {
        Node temp;
        if(hm.containsKey(key))
        {
            temp=hm.get(key);
            remove(temp);
            if(!freq.containsKey(leastFreq))
                leastFreq++;
            temp.freq++;
            temp.value=value;
        }
        else
        {
            temp=new Node(key,value);
        }
        validateSize(1);
        insert(temp);
        validateSize(0);
    }

    public void validateSize(int k)
    {
        if(freq.get(leastFreq)!=null && hm.size()+k>capacity)
        {
            remove(freq.get(leastFreq).tail.prev);
        }
        if(!freq.containsKey(leastFreq) || freq.get(leastFreq).head.next==freq.get(leastFreq).tail)
        {
            leastFreq=Integer.MAX_VALUE;
            for(int i:freq.keySet())
            {
                if(freq.get(i).head.next!=freq.get(i).tail)
                    leastFreq=Math.min(leastFreq,i);
            }
        }
    }

    public void insert(Node node)
    {
        hm.put(node.key,node);
        if(!freq.containsKey(node.freq))
        {
            freq.put(node.freq,new NodeList());
        }
        NodeList list=freq.get(node.freq);
        node.prev=list.head;
        node.next=list.head.next;
        list.head.next.prev=node;
        list.head.next=node;
        if(leastFreq>node.freq)
        {
            leastFreq=node.freq;
        }
    }

    public void remove(Node node)
    {
        hm.remove(node.key);
        node.next.prev=node.prev;
        node.prev.next=node.next;
        if(freq.get(node.freq).head.next==freq.get(node.freq).tail && node.freq==leastFreq)         {
            freq.remove(node.freq);
            for(int i:freq.keySet())
            {
                leastFreq=Integer.MAX_VALUE;
                if(freq.get(i).head.next!=freq.get(i).tail)
                    leastFreq=Math.min(leastFreq,i);
            }
        }
    }

    class Node
    {
        Node next,prev;
        int key,value,freq;
        Node(int key,int value)
        {
            this.key=key;
            this.freq=1;
            this.value=value;
        }
    }
    class NodeList
    {
        Node head,tail;
        NodeList()
        {
            head=new Node(0,0);
            tail=new Node(0,0);
            head.next=tail;
            tail.prev=head;
        }
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */