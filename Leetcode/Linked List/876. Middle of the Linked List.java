/*
Question Link: https://leetcode.com/problems/middle-of-the-linked-list/
Problem Description:
     Given the head of a singly linked list, return the middle node of the linked list.
     If there are two middle nodes, return the second middle node.

  Example 1:
      Input: head = [1,2,3,4,5]
      Output: [3,4,5]
      Explanation: The middle node of the list is node 3.

  Example 2:
      Input: head = [1,2,3,4,5,6]
      Output: [4,5,6]
      Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

   Constraints:
    1) The number of nodes in the list is in the range [1, 100].
    2) 1 <= Node.val <= 100

 */

class Solution {
    public ListNode middleNode(ListNode head) {
    // BRUTE-FORCE
//         int count=1;
//         for(ListNode temp=head;temp.next!=null;temp=temp.next)
//         {
//             count++;
//             //System.out.println(count);
//         }
//         count=(count/2)+1;
//         ListNode temp=head;
//         for(;count>1;count--,temp=temp.next)
//         {
            
//         }
//         return temp;

    // OPTIMIZED
        ListNode rabit=head; ListNode tortoise=head;
        while(tortoise!=null && tortoise.next!=null)
        {
            rabit=rabit.next;
            tortoise=tortoise.next.next;
        }
        return rabit;
    }
} 
