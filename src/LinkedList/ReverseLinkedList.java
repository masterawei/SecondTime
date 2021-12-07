package LinkedList;

/**
 * @author away
 * @date 2021-11-21 9:50
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = head;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public ListNode reverseListRecursion(ListNode head) {
        if (head == null||head.next == null ) {
            return head;
        }
        ListNode newHead = reverseListRecursion(head.next);
        head.next.next = newHead;
        head.next =null;
        return newHead;
    }
}
