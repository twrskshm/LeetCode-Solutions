/*
Reverse a singly linked list.
*/

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode result = null;

        while (head != null) {
            ListNode temporaryNode = head.next;
            head.next = result;
            result = head;
            head = temporaryNode;
        }

        return result;
    }
}

class ListNode {
    int val;
    com.company.ListNode next;

    ListNode(int x) {
        val = x;
    }
}
