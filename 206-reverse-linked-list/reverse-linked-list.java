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

        // Sumit Goswami
        ListNode curr = head;
        ListNode newhead = null;
        

        while(curr!=null){
           ListNode newNode = new ListNode(curr.val);
           newNode.next = newhead;

           newhead = newNode;

           curr = curr.next;

        }
     
        return newhead;
    }
}