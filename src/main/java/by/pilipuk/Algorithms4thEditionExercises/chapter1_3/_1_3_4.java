package by.pilipuk.Algorithms4thEditionExercises.chapter1_3;

import java.util.Stack;

public class _1_3_4 {
    public static void main(String[] args) {
        char[] chars = new char[] {'[', '(', ')', ']', '{', '}', '{', '[', '(', ')', '(', ')', ']', '(', ')', '}'};
        char[] chars1 = new char[] {'[', '(', ']', ')'};
        System.out.println(isValid(chars));
        System.out.println();
        System.out.println(isValid(chars1));
    }

    public static boolean isValid(char[] chars) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                if (chars[i] == '(') {
                    stack.push(')');
                } else if (chars[i] == '{') {
                    stack.push('}');
                } else if (chars[i] == '[') {
                    stack.push(']');
                }
            } else {
                if (!stack.empty()) {
                    if (stack.peek() == chars[i]) {
                        stack.pop();
                    }
                } else {
                    return false;
                }
            }
        }

        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}