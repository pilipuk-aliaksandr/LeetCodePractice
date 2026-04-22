package by.pilipuk.Algorithms4thEditionExercises.chapter1_3;

import edu.princeton.cs.algs4.StdIn;

import java.util.Objects;

public class _1_3_2 {
    public static void main(String[] args) {
        FixedCapacityStackOfStrings fixedCapacityStackOfStrings = new FixedCapacityStackOfStrings(1);

        String[] str = StdIn.readAllStrings();
        for (int i = 0; i < str.length; i++) {
            if (Objects.equals(str[i], "-")) {
                if (!fixedCapacityStackOfStrings.isEmpty()) {
                    fixedCapacityStackOfStrings.pop();
                    continue;
                }
            }
            fixedCapacityStackOfStrings.push(str[i]);
        }

        for (int i = 0; i < fixedCapacityStackOfStrings.size(); i++) {
            System.out.println(fixedCapacityStackOfStrings.pop());
        }
    }
}