package MergeTwoSortedLists;

public class MergeTwoSortedLists {


    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(1);
        ListNode node1 = list1;
        ListNode node2 = list2;
        for (int i = 2; i < 4; i++) {
            node1.next = new ListNode(i);
            node2.next = new ListNode(i);
            node1 = node1.next;
            node2 = node2.next;
        }
        ListNode result = new MergeTwoSortedLists().mergeTwoLists(list1, list2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }


    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
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
