import java.util.List;

/**
 * Created by dev on 6/14/2017.
 */
public class Easy_21_MergeTwoSortedLinkedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       if (l1 == null) return l2;
       if (l2 == null) return l1;
        ListNode merge;
        if (l1.val <= l2.val) {
            merge = l1;
            merge.next = mergeTwoLists(l1.next, l2);
        } else {
            merge = l2;
            merge.next = mergeTwoLists(l1, l2.next);
        }
        return merge;
    }
}
