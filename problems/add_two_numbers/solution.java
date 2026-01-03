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
      ListNode answ = new ListNode(0);
      ListNode current = answ;
      int bringForward =0;
      while(l1 !=null ||  l2 !=null) {
        int currentVal = bringForward;
        
        if (l1 !=null) {
            currentVal +=l1.val;
            l1 = l1.next;
        }
        if (l2 !=null) {
            currentVal +=l2.val;
            l2 = l2.next;
        }
       
        bringForward = currentVal / 10;
        current.next = new ListNode(currentVal%10);
        current = current.next;
      } 
      if (bringForward>0) {
        current.next = new ListNode(1);
        current = current.next;
      } 
      return answ.next;
    }
}