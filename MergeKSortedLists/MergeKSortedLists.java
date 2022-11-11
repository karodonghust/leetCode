package MergeKSortedLists;

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result;
        if (lists.length == 0) {
            return null;
        } else if (lists.length == 1) {
            return lists[0];
        }
        ListNode list1 = lists[0];
        for (int i = 1; i < lists.length; i++) {
            list1 = mergeLists(list1, lists[i]);
        }

        return list1;
    }

    public ListNode mergeLists(ListNode list1, ListNode list2) {
        ListNode head;
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val < list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }
        ListNode node = head;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                node.next = list2;
                break;
            } else if (list2 == null) {
                node.next = list1;
                break;
            }
            if (list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
                node = node.next;
            } else {
                node.next = list2;
                list2 = list2.next;
                node = node.next;
            }
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