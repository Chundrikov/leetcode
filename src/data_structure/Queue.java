package data_structure;

public class Queue<T> {

    private Node first;
    private Node last;
    private int size;

    private class Node {
        T item;
        Node next;
    }

    //adding to the end of the queue
    public void addQueue(T item) {
        Node oldLast = last;
        last.item = item;
        last.next = null;
        oldLast.next = last;
        size++;
    }

    //removing first node from the start of the queque
    public T deQueue() {
        T item = first.item;
        first = first.next;
        size--;
        return item;
    }
}
