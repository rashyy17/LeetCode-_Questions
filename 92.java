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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        int i=1;
        ListNode prev=dummy;
        while(i<left){
            prev=prev.next;
            i++;
        }
        ListNode curr=prev.next;
        for(int j=0;j<right-left;j++){
            ListNode temp=curr.next;
            
            curr.next=temp.next;
            temp.next=prev.next;
            prev.next=temp;
        }
        return dummy.next;
    }
}
