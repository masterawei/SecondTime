package LinkedList;

/**
 * @author away
 * @date 2021-11-21 22:12
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast =head;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        while (fast!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return dummy.next;


    }
}
