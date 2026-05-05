package by.pilipuk.stepicCourseAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class _2_4_15 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(reader.readLine());
        String str = reader.readLine();
        int n = Integer.parseInt(str);

        int length = str.length();

        Deque<Integer> stack = new ArrayDeque<>();

        while (n > 0) {
            stack.push(n % p);
            n /= p;
            length--;
        }

        System.out.print(str + "(10)=");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.print("(" + p + ")");
    }
}