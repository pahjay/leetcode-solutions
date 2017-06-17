/**
 * https://leetcode.com/problems/reverse-linked-list/#/description
 * rationale: to reverse a linked list, you reverse the link in-place
 */

public class Easy_206_ReverseLinkedList_Iterate {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode nextNode = head.next; // save next node for traversal
            head.next = newHead; // assign next node to previous head
            newHead = head; // save new head
            head = nextNode; // move head right
        }
        return newHead;
    }
}
