package by.pilipuk.Algorithms4thEditionExercises.chapter1_1;

public class _1_1_20_ln {
    public static void main(String[] args) {
        System.out.println(ln(4));
    }

    public static double ln(int n) {
        if (n == 1) {
            return 0;
        }
        return Math.log(n) + ln(n - 1);
    }
}