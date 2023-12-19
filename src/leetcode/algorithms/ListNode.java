package algorithms;

public class ListNode {
     int val;
     ListNode next;
     public ListNode() {}
     ListNode(int val) { this.val = val; }
     public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public int getVal() {
        return val;
    }

    public ListNode getNext() {
        return next;
    }

    public boolean isEmpty() {
         return (Integer.valueOf(this.val) == null && this.next == null);
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result;

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            result = list1;
            result.next = mergeTwoLists(list1.next, list2);
        } else {
            result = list2;
            result.next = mergeTwoLists(list1, list2.next);
        }

        return result;
    }
}