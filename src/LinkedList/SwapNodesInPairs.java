package LinkedList;

/**
 * @author away
 * @date 2021-11-21 21:41
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode pre = dummy;

        dummy.next = head;
        ListNode next = new ListNode();
        while (head != null && head.next != null) {
            next = head.next.next;
            pre.next = head.next;
            head.next.next=head;
            head.next = next;
            pre = head;
            head = next;
        }
        return dummy.next;
    }
}
