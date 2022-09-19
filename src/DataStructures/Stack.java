package DataStructures;

import java.util.Iterator;

public class Stack<T> implements Iterable<T> {

    // Object, cause generic arrays in Java are not allowed
    private T[] a = (T[]) new Object[1];
    private int n = 0;

    public boolean isEmpty(){
        return n == 0;
    }

    public int size() {
        return n;
    }

    //shifting the stack to a new array of size max
    private void resize(int max) {
        T[] temp = (T[]) new Object[max];
        for (int i = 0; i < n; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    //adding an element to the top of the stack
    public void push(T t) {
        if(n == a.length) {
            resize(2*a.length);
        }
        a[n++] = t;
    }

    //removing an element from the top of the stack
    public T pop() {
        T t = a[n--];
        a[n] = null;
        if (n > 0 && n == a.length/4) {
            resize(a.length/2);
        }
        return t;
    }

    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<T> {
        private int i = n;

        public boolean hasNext() {
            return i > 0;
        }

        public T next() {
            return a[i--];
        }

        public void remove() {

        }
    }
}
