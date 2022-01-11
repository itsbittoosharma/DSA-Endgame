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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null) return head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=new ListNode(0,head);
        ListNode ans=prev;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            prev=prev.next;
        }
        
        prev.next=prev.next.next;
        return ans.next;
    }
}