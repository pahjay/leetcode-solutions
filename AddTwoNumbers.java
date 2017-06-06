package solutions;

/**
 * Created by ryan on 2/9/17.
 *
 * Problem Description: https://leetcode.com/problems/add-two-numbers/?tab=Description
 */

// use arithmitic, if the two digits exceed 10, then send the remainder to the next two, continue pattern until complete

public class AddTwoNumbers {

    private class ListNode
    {
        int val;
        ListNode next;

        public ListNode(int i){
            val = i;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // limitation of API, cant set head of List to null
        ListNode head = new ListNode(0);
        ListNode curr = head;
        int carry = 0;

        while (l1 != null || l2 != null){
            // assign int value depending on whether l1 or l2 is done
            int j = (l1 != null) ? l1.val : 0;
            int k = (l2 != null) ? l2.val : 0;
            int sum = carry + j + k;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        // check for any trailing remainders
        if(carry > 0){
            curr.next = new ListNode(carry);
        }

        return head.next;
    }
}
