package SwapNodesInPairs;

public class SwapNodesInPairs {


    public static void main(String[] args) {


    }

    public ListNode swapPairs(ListNode head) {
        ListNode parent = new ListNode(0);
        parent.next = head;
        ListNode current = parent;
        while (current.next != null && current.next.next != null) {
            ListNode temp1 = current.next;
            ListNode temp2 = current.next.next;
            current.next = temp2;
            temp1.next = temp2.next;
            current.next.next = temp1;
            current = temp1;
        }
        return parent.next;
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
