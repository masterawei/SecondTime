package LinkedList;

/**
 * @author away
 * @date 2021-11-21 22:35
 */
public class IntersectionOfTwoLinkedListsLcci {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode Ahead = headA;
        ListNode Bhead = headB;
        while (headA != headB) {
            if (headA == null) {
                headA = Bhead;
            }else headA = headA.next;
            if (headB == null) {
                headB = Ahead;
            }else headB = headB.next;


        }
        return headA;
    }
}
