package by.pilipuk.Algorithms4thEditionExercises.chapter1_1;

import java.util.ArrayList;
import java.util.List;

public class _1_1_19_Fibonacci {
    public static void main(String[] args) {
        List<Long> fibonacci = new ArrayList<>();

        for (int n = 0; n < 100; n++) {
            System.out.println(n + " " + fib(fibonacci, n));
        }
    }

    public static long f(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return f(n - 1) + f(n - 2);
    }

    public static long fib(List<Long> fibonacci, int n) {
        if (n == 0) {
            fibonacci.add(0L);
            return 0;
        }
        if (n == 1) {
            fibonacci.add(1L);
            return 1;
        }
        fibonacci.add(fibonacci.get(n - 1) + fibonacci.get(n - 2));
        return fibonacci.get(n);
    }
}
