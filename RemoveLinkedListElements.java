public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp = null, result = null;
        while(head != null) {
            if(head.val != val) {
                if(temp == null) {
                    temp = new ListNode(head.val);
                    result = temp;
                } else {
                    temp.next = new ListNode(head.val);
                    temp = temp.next;
                }
            }

            head = head.next;
        }

        return result;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
