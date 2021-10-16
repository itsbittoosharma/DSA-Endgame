 Middle of the Linked List

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
  
  
  public ListNode middleNode(ListNode head) {
    ListNode curr = head;
    
    int total = 0;
    while(curr != null){
        total++;
        curr = curr.next;
    }        
    
    //find the middle one
    total = total/2 + 1;
    
    ListNode cur = head;
    for(int i = 1; i < total; ++i){
        cur = cur.next;
    }
    
    return cur;
}
