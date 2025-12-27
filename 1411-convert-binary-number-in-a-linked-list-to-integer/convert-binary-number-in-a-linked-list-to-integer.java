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

    // Sumit Goswami
    public int getDecimalValue(ListNode head) {
        head = reverseLinkedList(head);
         ListNode temp = head;
        int i =0 , sum = 0;
        while (temp != null) {
            sum += temp.val*Math.powExact(2, i);
            i++;
            temp = temp.next;
        }

        return sum;
    }
       public static ListNode reverseLinkedList(ListNode head) {

        ListNode temp = head;

        ListNode nHead = null;

        while (temp!=null) {

            ListNode newNode = new ListNode(temp.val);

            newNode.next = nHead;

            nHead = newNode;

            temp = temp.next;
        }
        return nHead;
     
    }
}