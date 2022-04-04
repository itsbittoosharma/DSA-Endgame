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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head, second=head, temp=head;
        for(int i=1;i<k;i++)
        {
            first=first.next;
            temp=temp.next;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
            second=second.next;
        }
        int temp1=first.val;
        first.val=second.val;
        second.val=temp1;
        return head;
    }
}