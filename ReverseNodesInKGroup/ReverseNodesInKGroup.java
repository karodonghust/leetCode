package ReverseNodesInKGroup;

import java.util.List;
import java.util.Stack;

public class ReverseNodesInKGroup {


    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        ListNode node = new ListNode(1);
        listNode.next = node;
        for (int i = 2; i < 5; i++) {
            node.next = new ListNode(i);
            node = node.next;
        }
        ReverseNodesInKGroup reverseNodesInKGroup = new ReverseNodesInKGroup();
        ListNode listNode1 = reverseNodesInKGroup.reverseKGroup(listNode, 2);
        while (listNode1 != null) {
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }
    }


    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode emptyHead = new ListNode(0);
        emptyHead.next = head;
        ListNode current = emptyHead;
        ListNode parent = current;
        Stack<ListNode> stack = new Stack();
        while (true) {
            for (int i = 0; i < k; i++) {
                if (current.next != null) {
                    stack.push(current.next);
                    current = current.next;
                } else {
                    break;
                }
            }
            if (stack.size() < k) {
                break;
            }
            ListNode top = stack.pop();
            ListNode temp = top.next;
            parent.next = top;
            parent = parent.next;
            for (int i = 0; i < k - 1; i++) {
                parent.next = stack.pop();
                parent = parent.next;
            }
            parent.next = temp;
            current = parent;
        }

        return emptyHead.next;
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
