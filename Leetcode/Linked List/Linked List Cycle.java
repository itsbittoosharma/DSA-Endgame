
/*

141. Linked List Cycle

Question Link:https://leetcode.com/problems/linked-list-cycle/
Problem Description:

Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

 

Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
Example 2:


Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

Constraints:

The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.
  
  
  class HasCycleInLinkedList{
   public boolean hasCycle(ListNode head){
       if(head == null || head.next == null) return false;
       if(head.next == head) return true;
       ListNode nextNode = head.next; 
       head.next = head;
       boolean isCycle = hasCycle(nextNode);
       return isCycle;
   }
}




C++ code--

class Solution {
public:
    bool hasCycle(ListNode *head) {
        if (!head) 
            return false;
        
        ListNode *slow = head, *fast = head;
        
        while (fast->next && fast->next->next) {
            slow = slow->next;
            fast = fast->next->next;
            if (slow == fast) 
                return true;
        }
        
        return false;
    }
};
