package by.pilipuk.leetCode;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(')');
            } else if (s.charAt(i) == '{') {
                stack.push('}');
            } else if (s.charAt(i) == '[') {
                stack.push(']');
            } else {

                if (stack.empty()) {
                    return false;
                } else {
                    if (s.charAt(i) == stack.peek()) {
                        stack.pop();
                    } else return false;
                }
            }
        }

        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid1(String s) {

        int kr = 0;
        int kv = 0;
        int fig = 0;

        for (int i = 0; i < s.length(); i++) {
            String symbol = String.valueOf(s.charAt(i));
            String nextSymbol = "";
            if (i != s.length() - 1) {
                nextSymbol = String.valueOf(s.charAt(i + 1));
            } else {
                nextSymbol = "";
            }
            switch (symbol) {
                case "(" -> {
                    if (nextSymbol.equals("]") || nextSymbol.equals("}") || nextSymbol.isEmpty()) {
                        kr = -10000;
                    } else {
                        kr -= 1;
                    }
                }
                case "[" -> {
                    if (nextSymbol.equals(")") || nextSymbol.equals("}") || nextSymbol.equals("")) {
                        kv = -10000;
                    } else {
                        kv -= 1;
                    }
                }
                case "{" -> {
                    if (nextSymbol.equals(")") || nextSymbol.equals("]") || nextSymbol.isEmpty()) {
                        fig = -10000;
                    } else {
                        fig -= 1;
                    }
                }
                case ")" -> kr += 1;
                case "]" -> kv += 1;
                case "}" -> fig += 1;
            }
        }
        if (kv == 0 && kr == 0 && fig == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}