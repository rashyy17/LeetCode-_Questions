class Solution {
    ListNode getIntersectionNode(ListNode firstHead, ListNode secondHead) {
        if (firstHead == null || secondHead == null) return null;

        ListNode pointerA = firstHead;
        ListNode pointerB = secondHead;

        while (pointerA != pointerB) {
            pointerA = (pointerA == null) ? secondHead : pointerA.next;
            pointerB = (pointerB == null) ? firstHead : pointerB.next;
        }

        return pointerA;
    }
}
