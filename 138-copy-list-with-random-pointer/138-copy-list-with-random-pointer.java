/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
public Node copyRandomList(Node head) {
        if(head == null){
           return null;
        }
       
        //step--1
        Node p = head;
        while(p!= null){
            Node n = new Node(p.val);
            n.next = p.next;
            p.next = n;
            p = n.next;
        }
        
        //step--2
        p = head;
        while(p!= null){
            if(p.random!= null){
                 p.next.random = p.random.next;
            }
           
            p = p.next.next;
        }
        
        //step--3
        
        p = head;
        Node head1 = head.next;
        Node q = head1;
        while(q.next != null){
            
            p.next = q.next;
            p = p.next;
            
            q.next = q.next.next;
            q = q.next;
            
        }
        p.next = null;
        
        return head1;
        
    }
}