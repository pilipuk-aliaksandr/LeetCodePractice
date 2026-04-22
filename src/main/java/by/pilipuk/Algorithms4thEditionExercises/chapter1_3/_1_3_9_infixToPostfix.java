package by.pilipuk.Algorithms4thEditionExercises.chapter1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _1_3_9_infixToPostfix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Stack<String> operators = new Stack<>();
        Stack<String> vals = new Stack<>();

        String[] str = reader.readLine().trim().split(" ");

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("+") || str[i].equals("-") || str[i].equals("*") || str[i].equals("/")) {
                operators.push(str[i]);
            } else if (str[i].equals(")")) {
                String op = operators.pop();
                String val2 = vals.pop();
                String val1 = vals.pop();

                String subExpression = "( " + val1 + " " + op + " " + val2 + " )";
                vals.push(subExpression);
            } else if (!str[i].equals("(")) {
                vals.push(str[i]);
            }
        }
        System.out.println(vals.pop());
    }
}