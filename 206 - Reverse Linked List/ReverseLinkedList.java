/*
Reverse a singly linked list.
*/

import com.company.LinkedList;

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

    public static com.company.ListNode reverseList(com.company.ListNode head) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        while (head != null) {
            linkedList.add(0, head.val);
            head = head.next;
        }

        com.company.ListNode currentNode = null, result = null;
        for (int value: linkedList) {
            if (currentNode == null) {
                currentNode = new com.company.ListNode(value);
                result = currentNode;
            } else {
                currentNode.next = new com.company.ListNode(value);
                currentNode = currentNode.next;
            }
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
