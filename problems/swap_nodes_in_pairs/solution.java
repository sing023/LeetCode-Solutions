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
    public ListNode swapPairs(ListNode head) {
        // Dummy node to simplify edge cases
        ListNode returnHead = new ListNode(0);
        returnHead.next = head;
        
        // Initialize current pointer
        ListNode current = returnHead;
        
        while (current.next != null && current.next.next != null) {
            // Nodes to be swapped
            ListNode first = current.next;
            ListNode second = current.next.next;
            
            // Swapping the nodes
            first.next = second.next;
            second.next = first;
            current.next = second;
            
            // Move current pointer
            current = first;
        }
        
        return returnHead.next;
    }
}
