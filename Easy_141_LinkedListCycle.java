import java.util.HashSet;

/**
 * if the linked list has a cycle the two pointers will meet at some point.
 */
public class Easy_141_LinkedListCycle {
    public boolean hasCycle(ListNode head) {
       if (head == null) return false;
       ListNode tortoise = head;
       ListNode hare = head;

       while (hare.next != null && hare.next.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            if (tortoise == hare) return true;
        }
        return false;
    }
}
