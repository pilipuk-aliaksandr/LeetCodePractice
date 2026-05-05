package by.pilipuk.stepicCourseAlgorithms;

public class _2_4_4 {

    public static int dream(int n, int x) {
        if (n <= 1) {
            return x;
        }
        for (int i = 1; i <= n; i++) {
            x += dream(i, x);
        }
        return x;
    }

    public static void main(String[] args) {
//        System.out.println(dream(4, 2));
        System.out.println(1/10);
    }
}