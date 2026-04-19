package by.pilipuk.Algorithms4thEditionExercises.chapter1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1_1_30 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        boolean[][] arr = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (gcd(i, j) == 1) {
                    arr[i][j] = true;
                } else arr[i][j] = false;
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }

    private static int gcd(int i, int j) {
        if (j == 0) {
            return i;
        }

        int temp = i % j;
        return gcd(j, temp);
    }
}