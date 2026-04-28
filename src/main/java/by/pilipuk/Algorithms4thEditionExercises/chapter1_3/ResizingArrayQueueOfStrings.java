package by.pilipuk.Algorithms4thEditionExercises.chapter1_3;

public class ResizingArrayQueueOfStrings {
    private String[] a;
    private int n;
    private int first;
    private int last;

    public ResizingArrayQueueOfStrings(int capacity) {
        a = new String[capacity];
        n = 0;
        first = 0;
        last = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    private boolean isFull() {
        return n == a.length;
    }

    public void add(String item) {
        if (isFull()) {
            resize(a.length * 2);
        }
        a[last++] = item;
        if (last == a.length) last = 0;
        n++;
    }

    private void resize(int newCapacity) {
        String[] temp = new String[newCapacity];
        for (int i = 0; i < n; i++) {
            temp[i] = a[(first + i) % a.length];
        }
        first = 0;
        last = n;
        a = temp;
    }

    public String remove() {
        if (n > 0 && n <= a.length / 4) {
            resize(a.length / 2);
        }
        if (n != 0) {
            String temp = a[first];
            a[first] = null;
            n--;
            first++;
            if (first == a.length) first = 0;
            return temp;
        }
        return "Can't remove item from empty queue";
    }
}