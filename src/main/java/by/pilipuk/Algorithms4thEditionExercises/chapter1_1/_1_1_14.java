package by.pilipuk.Algorithms4thEditionExercises.chapter1_1;

public class _1_1_14 {
    public static void main(String[] args) {
        System.out.println(lg(16));
    }

    public static int lg(int n) {
        if (n % 2 != 0) {
            return -1;
        }

        int counter = 0;
        int res = 2;

        while (res <= n) {
            res *= 2;
            counter++;
        }
        return counter;
    }
}