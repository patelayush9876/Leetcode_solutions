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
     public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        
        while (current != null) {
            ListNode nextTemp = current.next; // Store the next node
            current.next = previous;          // Reverse the current node's pointer
            
            previous = current;               // Move 'previous' one step forward
            current = nextTemp;               // Move 'current' one step forward
        }
        
        return previous;
    }
}