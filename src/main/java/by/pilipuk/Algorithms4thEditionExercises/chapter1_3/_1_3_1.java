package by.pilipuk.Algorithms4thEditionExercises.chapter1_3;

public class _1_3_1 {
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
        System.out.println(fixedCapacityStackOfStrings.size());
    }
}
