package by.pilipuk.Algorithms4thEditionExercises.chapter1_3;

public class FixedCapacityStackOfStrings {
    private String[] a;
    private int n;

    public FixedCapacityStackOfStrings(int capacity) {
        a = new String[capacity];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void push(String item) {
        if (isFull()) {
            a = resize(a);
        }
        a[n++] = item;
    }

    public String pop() {
        if (!isEmpty()) {
            String temp = a[n - 1];
            a[n - 1] = null;
            n--;
            return temp;
        }
        return "You can't pop item, because your stack is empty";
    }

    public String peek() {
        if (!isEmpty()) {
            return a[n - 1];
        }
        return "You can't peek item, because your stack is empty";
    }

    private Boolean isFull() {
        return n == a.length;
    }

    private String[] resize(String[] oldA) {
        String[] a = new String[oldA.length * 2];
        for (int i = 0; i < oldA.length; i++) {
            a[i] = oldA[i];
        }
        return a;
    }
}