package by.pilipuk.Algorithms4thEditionExercises.chapter1_3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

import static by.pilipuk.Algorithms4thEditionExercises.chapter1_3._1_3_10_InfixToPostfix.infixToPostfix_withPrioritiesOfOperators;

public class _1_3_11_evaluatePostfixRecord {
    public static int evaluatePostfixRecord(String postfixRecord) {
        String[] str = postfixRecord.trim().split(" ");

        Deque<Integer> vals = new ArrayDeque<>();

        for (String s : str) {
            if (vals.size() >= 2 && s.equals("+")) {
                vals.push(vals.pop() + vals.pop());
            } else if (vals.size() >= 2 && s.equals("-")) {
                vals.push(vals.pop() - vals.pop());
            } else if (vals.size() >= 2 && s.equals("*")) {
                vals.push(vals.pop() * vals.pop());
            } else if (vals.size() >= 2 && s.equals("/")) {
                vals.push(vals.pop() / vals.pop());
            } else {
                vals.push(Integer.parseInt(s));
            }
        }

        return vals.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluatePostfixRecord(infixToPostfix_withPrioritiesOfOperators("( 1 * 2 + 3 * 5 ) * 4")));
    }
}