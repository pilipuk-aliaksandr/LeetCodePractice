package by.pilipuk.stepicCourseAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2_4_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        move(n, 1, 3, 2);
    }

    public static void move(int n, int from, int to, int additional) {
        if (n == 1) {
            System.out.println("Переместите диск с " + from + " на " + to);
            return;
        }

        move((n - 1), from, additional, to);

        System.out.println("Переместите диск с " + from + " на " + to);

        move((n - 1), additional, to, from);
    }
}