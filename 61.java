//Make it circular by making end.next=head 
//then break (going to kth position and making the node after k null)

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
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null) return head;
        ListNode l;
        int len=1;
        ListNode dummy=head;
        while(dummy.next!=null){
            len++;
            dummy=dummy.next;
        }
        dummy.next=head;
        k=k%len;
        int steps=len-k;
        ListNode tailEnd=head;
        for(int i=1;i<steps;i++){
            tailEnd=tailEnd.next;
        }
        ListNode ans=tailEnd.next;
        tailEnd.next=null;
        return ans;
    }
}
