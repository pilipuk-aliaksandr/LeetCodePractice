package by.pilipuk.Algorithms4thEditionExercises.chapter1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _1_3_9_equalInfixToPostfix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] str = reader.readLine().trim().split(" ");

        Stack<String> operators = new Stack<>();
        Stack<String> vals = new Stack<>();

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("+") || str[i].equals("-") || str[i].equals("*") || str[i].equals("/")) {
                operators.push(str[i]);
            } else if (str[i].equals(")")) {
                String val1 = vals.pop();
                String val2 = vals.pop();

                String subRes = "( " + val2 + " " + operators.pop() + " " + val1 + " )";
                vals.push(subRes);
            } else {
                vals.push(str[i]);
            }
        }
        for (int i = 0; i < vals.size(); i++) {
            System.out.println(vals.pop());
        }
    }
}