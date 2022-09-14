package DataStructures;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {

    // Object, cause generic arrays in Java are not allowed
    private Item[] a = (Item[]) new Object[1];
    private int n = 0;

    public boolean isEmpty(){
        return n == 0;
    }

    public int size() {
        return n;
    }

    //shifting the stack to a new array of size max
    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < n; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    //adding an element to the top of the stack
    public void push(Item item) {
        if(n == a.length) {
            resize(2*a.length);
        }
        a[n++] = item;
    }

    //removing an element from the top of the stack
    public Item pop() {
        Item item = a[n--];
        a[n] = null;
        if (n > 0 && n == a.length/4) {
            resize(a.length/2);
        }
        return item;
    }

    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = n;

        public boolean hasNext() {
            return i > 0;
        }

        public Item next() {
            return a[i--];
        }

        public void remove() {

        }
    }
}
