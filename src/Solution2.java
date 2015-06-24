/**
 * #2 Add Two Numbers
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * Input: 2 -> 4 -> 3
 *        5 -> 6 -> 4
 * Output: 7 -> 0 -> 8
 */
public class Solution2 {

    public final static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(3);

        ListNode node2 = new ListNode(5);
        node2.next = new ListNode(6);
        node2.next.next = new ListNode(4);

        ListNode result = new Solution2().addTwoNumbers(node1, node2);
        do {
            System.out.print(result.val + "->");
            result = result.next;
        } while(result != null);
    }

    private ListNode addTwoNumbers(ListNode node1, ListNode node2) {

        return addList(node1, node2, 0);

    }

    private ListNode addList(ListNode node1, ListNode node2, int carry) {
        if(node1 == null && node2 == null) {
            if(carry != 0)
                return new ListNode(carry);
            return null;
        }
        int val1 = (node1 != null) ? node1.val : 0;
        int val2 = (node2 != null) ? node2.val : 0;
        int val = val1 + val2 + carry;
        ListNode result = new ListNode(val % 10);
        ListNode next1 = (node1 != null) ? node1.next : null;
        ListNode next2 = (node2 != null) ? node2.next : null;
        result.next = addList( next1, next2, val / 10);
        return result;
    }

}
