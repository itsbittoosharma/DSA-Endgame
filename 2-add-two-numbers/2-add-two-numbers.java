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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode(), dummy=ans;
        int sum=0, carry=0;
        while(l1!=null&&l2!=null)
        {
            sum=l1.val+l2.val+carry;
            carry=sum/10;
            sum%=10;
            ans.next=new ListNode(sum);
            ans=ans.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null)
        {
            sum=l1.val+carry;
            carry=sum/10;
            sum%=10;
            ans.next=new ListNode(sum);
            ans=ans.next;
            l1=l1.next;
        }
        while(l2!=null)
        {
            sum=l2.val+carry;
            carry=sum/10;
            sum%=10;
            ans.next=new ListNode(sum);
            ans=ans.next;
            l2=l2.next;
        }
        while(carry!=0)
        {
            sum=carry;
            carry=sum/10;
            sum%=10;
            ans.next=new ListNode(sum);
            ans=ans.next;
        }
        return dummy.next;
    }
}