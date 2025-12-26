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
    public ListNode middleNode(ListNode head) {

        // Sumit Goswami
       ListNode temp = head;
       ListNode first = head;
       int count = 0;
       while(temp.next!=null){
        count++;
        temp = temp.next;
       }
int pos = 0;
       if(count%2==0){
         while(pos<count/2){
        pos++;
        first = first.next;
       }
       }else{
          while(pos<=count/2){
        pos++;
        first = first.next;
       }
       }

        
      

       return first;

    }
}