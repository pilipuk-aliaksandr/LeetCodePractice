package by.pilipuk.Algorithms4thEditionExercises.chapter1_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _1_3_10_InfixToPostfix {
    public static String infixToPostfix_withPrioritiesOfOperators(String infixRecord) {
        String[] str = infixRecord.trim().split(" ");

        Map<String, Integer> ope = new HashMap<>();
        ope.put("(", 0);
        ope.put("+", 1);
        ope.put("-", 1);
        ope.put("*", 2);
        ope.put("/", 2);

        Stack<String> operators = new Stack<>();

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            if (ope.containsKey(str[i])) {
                if (ope.get(str[i]) == 0 || operators.empty()) {
                    operators.push(str[i]);
                } else {
                    while (!operators.empty() && ope.get(str[i]) <= ope.get(operators.peek())) {
                        res.append(operators.pop()).append(" ");
                    }
                    operators.push(str[i]);
                }
            } else if (str[i].equals(")")) {
                while(!operators.peek().equals("(")) {
                    res.append(operators.pop()).append(" ");
                }
                operators.pop();
            } else res.append(str[i]).append(" ");
        }

        while (!operators.empty()) {
            res.append(operators.pop()).append(" ");
        }

        return res.toString();
    }

    public static String infixToPostfix_withoutPrioritiesOfOperators(String infixRecord) {
        String[] str = infixRecord.trim().split(" ");

        Stack<String> operators = new Stack<>();

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("(") || str[i].equals("+") || str[i].equals("-") || str[i].equals("*") || str[i].equals("/")) {
                operators.push(str[i]);
            } else if (str[i].equals(")")) {
                while (!operators.peek().equals("(")) {
                    res.append(operators.pop()).append(" ");
                }
                operators.pop();
            } else res.append(str[i]).append(" ");
        }

        while (!operators.empty()) {
            res.append(operators.pop()).append(" ");
        }

        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(infixToPostfix_withoutPrioritiesOfOperators("( 1 * 2 + 3 ) * 4"));
        System.out.println(infixToPostfix_withPrioritiesOfOperators("( 1 * 2 + 3 ) * 4"));
    }
}