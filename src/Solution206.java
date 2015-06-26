import java.util.Stack;

/**
 * #206 Reverse Linked List
 * Reverse a singly linked list.
 */
public class Solution206 {

    public static final void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        ListNode rev = reverseList(node);
        while(rev != null) {
            System.out.print(rev.val);
            rev = rev.next;
            if(rev != null)
                System.out.print("->");
        }
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode next = head.next;
        head.next = null;
        while(next != null) {
            ListNode tmp = next.next;
            next.next = head;
            head = next;
            next = tmp;
        }
        return head;
    }

}
