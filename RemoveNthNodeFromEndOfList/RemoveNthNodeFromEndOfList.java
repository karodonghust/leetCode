package RemoveNthNodeFromEndOfList;


import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromEndOfList {


    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode current = head;
        for (int i = 1; i <= 1; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        removeNthNodeFromEndOfList.removeNthFromEnd(head, 1);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node);
            node = node.next;
        }
        int needDelete = list.size() - n;
        ListNode parent;
        if (needDelete == 0) {
            head = head.next;
        } else {
            parent = list.get(needDelete - 1);
            parent.next = list.get(needDelete).next;
        }

        return head;
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
