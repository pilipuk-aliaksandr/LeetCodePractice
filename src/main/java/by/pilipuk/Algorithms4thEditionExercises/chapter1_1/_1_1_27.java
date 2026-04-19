package by.pilipuk.Algorithms4thEditionExercises.chapter1_1;

public class _1_1_27 {
    public static void main(String[] args) {
        int n = 100;
        int k = 50;
        double[][] arr = new double[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                arr[i][j] = -1.0;
            }
        }
        System.out.println(binomial(n, k, 0.5, arr));
    }

    public static double binomial(int n, int k, double p, double[][] arr) {
        if (n == 0 && k == 0) {
            return 1.0;
        }

        if (n < 0 || k < 0) {
            return 0.0;
        }

        if (arr[n][k] != -1) {
            return arr[n][k];
        }

        arr[n][k] = (1.0 - p) * binomial(n - 1, k, p, arr) + p * binomial(n - 1, k - 1, p, arr);

        return arr[n][k];
    }
}