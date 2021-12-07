package LinkedList;

/**
 * @author away
 * @date 2021-11-21 22:53
 */
public class IntersectionOfTwoLinkedListsLcciSubmissions {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        do {
            if (fast == null || fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;

        } while (slow != fast);
        slow = head;
         while (slow != fast){
             slow = slow.next;
             fast = fast.next;
         }
        return slow;
    }
}
