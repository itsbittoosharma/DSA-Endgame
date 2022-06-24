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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==0||head==null) return head;
        ListNode temp=head;
        ListNode head1=head;
        while(n!=0) {
            temp=temp.next;
            n--;
        }
        if(temp==null) return head.next;
        while(temp.next!=null)
        {
            head=head.next;
            temp=temp.next;
            
        }
        head.next=head.next.next;
        return head1;
    }
}