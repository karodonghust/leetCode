package AddTwoNumber;

public class AddTwoNumber {
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head;
        ListNode current = new ListNode(0);
        head = current;
        int upInt = 0;
        while (l1.next != null || l2.next != null) {
            int l1Number = (l1 == null) ? 0 : l1.val;
            int l2Number = (l2 == null) ? 0 : l2.val;
            int sum = l1Number + l2Number + upInt;
            upInt = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return head.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
