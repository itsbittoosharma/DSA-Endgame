/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0 || head.next==null) return head;
        ListNode temp=head;
        ListNode temp2=head;
        int size=0;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        if(size==1) return head;
        k=k%size;
        int diff=size-k;
        temp=head;
        for(int i=0;i<k;i++)
        {
            temp=temp.next;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
            temp2=temp2.next;
        }
        temp.next=head;
        
        head=temp2.next;
        temp2.next=null;
        // System.out.println(k);
        return head;
    }
}