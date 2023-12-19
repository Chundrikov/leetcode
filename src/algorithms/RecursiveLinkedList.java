import algorithms.ListNode;

public class RecursiveLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head.isEmpty()) { return head; }
        if (head.getNext() == null) { return head; }
        int first = head.getVal();
        int second = head.getNext().getVal();
        ListNode secondNode = head.getNext();
        ListNode updatedNode = new ListNode(first, head.getNext().getNext());
        head = new ListNode(second, updatedNode);
        return reverseList(secondNode);
    }
}
