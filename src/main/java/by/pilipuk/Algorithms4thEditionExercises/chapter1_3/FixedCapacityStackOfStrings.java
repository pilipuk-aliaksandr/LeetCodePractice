package by.pilipuk.Algorithms4thEditionExercises.chapter1_3;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class FixedCapacityStackOfStrings implements Iterable<String> {
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

    @Override
    public Iterator<String> iterator() {
        Iterator<String> iterator = new Iterator<>() {
            @Override
            public boolean hasNext() {
                return !isEmpty();
            }

            @Override
            public String next() {
                return pop();
            }
        };
        return iterator;
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<String> spliterator() {
        return Iterable.super.spliterator();
    }
}