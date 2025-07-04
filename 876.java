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
        ListNode s=head;
        ListNode f=head;
        int h=0;
        while( f!=null && f.next!=null ){
            f=f.next.next;
            s=s.next;
            h++;
        }
        return s;
    }
}
