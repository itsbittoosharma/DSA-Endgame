/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hs=new HashSet<ListNode>();
        while(headA!=null || headB!=null)
        {
            if(headA!=null) 
            {
                if(hs.contains(headA)) return headA;
                hs.add(headA);
                headA=headA.next;
            }
            if(headB!=null)
            {
                if(hs.contains(headB)) return headB;
                hs.add(headB);
                headB=headB.next;
            }
        }
        return null;
    }
}