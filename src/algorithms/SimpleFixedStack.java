package algorithms;

public class SimpleFixedStack {

    private String[] a;
    private int stackCapacity;

    public SimpleFixedStack(int N) {
        a = new String[N];
    }

    public void push(String element) {
        a[stackCapacity++] = element;
    }

    public String peek() {
        return a[stackCapacity -1];
    }

    public int stackSize() {
        return stackCapacity;
    }

    public boolean isEmpty() {
        return stackCapacity == 0;
    }

}
