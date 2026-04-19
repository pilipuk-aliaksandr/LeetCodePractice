package by.pilipuk.Algorithms4thEditionExercises.chapter1_1;

public class _1_1_24_gcd_search {
    public static void main(String[] args) {
        System.out.println(euclid(3, 71));
    }

    public  static int euclid(int a, int b) {
        System.out.println(a + " " + b);
        if (b == 0) {
            return a;
        }

        int temp = a % b;
        return euclid(b, temp);
    }
}