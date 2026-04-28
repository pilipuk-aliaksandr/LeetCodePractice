package by.pilipuk.Algorithms4thEditionExercises.chapter1_3;

import java.util.Iterator;

public class _1_3_12_iterator {
    public static FixedCapacityStackOfStrings copy(FixedCapacityStackOfStrings stack) {
        FixedCapacityStackOfStrings temp = new FixedCapacityStackOfStrings(1);
        FixedCapacityStackOfStrings newStack = new FixedCapacityStackOfStrings(1);

        Iterator<String> iterator = stack.iterator();

        while (iterator.hasNext()) {
            temp.push(iterator.next());
        }

        Iterator<String> i = temp.iterator();

        while (i.hasNext()) {
            newStack.push(i.next());
        }

        return newStack;
    }

    public static void main(String[] args) {
        FixedCapacityStackOfStrings fixedCapacityStackOfStrings = new FixedCapacityStackOfStrings(10);
        fixedCapacityStackOfStrings.push("I");
        fixedCapacityStackOfStrings.push("love");
        fixedCapacityStackOfStrings.push("Veronica");
        fixedCapacityStackOfStrings.push("Pilipuk");
        fixedCapacityStackOfStrings.push("so");
        fixedCapacityStackOfStrings.push("much");
        fixedCapacityStackOfStrings.push("!");
        fixedCapacityStackOfStrings.push("!");
        fixedCapacityStackOfStrings.push("!");
        fixedCapacityStackOfStrings.push("!");
        fixedCapacityStackOfStrings.push("!");

        for (String stack : copy(fixedCapacityStackOfStrings)) {
            System.out.println(stack);
        }
    }
}
