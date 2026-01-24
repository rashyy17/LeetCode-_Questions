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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode es=head;
        ListNode ee=es;
        ListNode os=head.next;
        ListNode oe=os;
        ListNode dummy=head.next.next;
        
        int c=0;
        while(dummy!=null){
            if(c%2==0){
                    ee.next=dummy;
                    ee=ee.next;
                    dummy=dummy.next;
            }
            else{
                    oe.next=dummy;
                    oe=oe.next;
                dummy=dummy.next;
            }
            c++;
        }
        oe.next = null;
        ee.next=os;
        return es;
    }
}
