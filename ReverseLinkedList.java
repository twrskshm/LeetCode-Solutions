import java.util.LinkedList;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        LinkedList<Integer> list = new LinkedList();

        while(head != null) {
            list.add(0, head.val);
            head = head.next;
        }

        ListNode first = null, result = null;
        for(int i: list) {
            if(first == null) {
                first = new ListNode(i);
                result = first;
            }

            first.next = new ListNode(i);
            first = first.next;
        }

        return result.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}