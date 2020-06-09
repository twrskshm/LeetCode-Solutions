/*
2. Add Two Numbers

Time complexities:
Worst case: O(max(m, n))
Best case: O(max(m, n))

Space complexity:
Worst case: O(max(m, n))
Best case: O(max(m, n))
*/

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currentNode = new ListNode();
        ListNode result = currentNode;
        int carryOver = 0;

        while (l1 != null || l2 != null) {
            int valueOne = (l1 != null) ? l1.val : 0;
            int valueTwo = (l2 != null) ? l2.val : 0;
            int newValue = (valueOne + valueTwo + carryOver) % 10;
            carryOver = (valueOne + valueTwo + carryOver) / 10;

            currentNode.next = new ListNode(newValue);

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
            currentNode = currentNode.next;
        }

        if (carryOver == 1) {
            currentNode.next = new ListNode(1);
        }

        return result.next;
    }
}
