package by.pilipuk.Algorithms4thEditionExercises.chapter1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestOptimizedUF1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        OptimizedUnionFind OptimizedUF = new OptimizedUnionFind(n);

        for (int i = 0; i < n; i++) {
            String[] str = reader.readLine().trim().split(" ");
            int p = Integer.parseInt(str[0]);
            int q = Integer.parseInt(str[1]);

            if (!OptimizedUF.connected(p, q)) {
                OptimizedUF.union(p, q);

                System.out.println(p + " " + q);
            } else {
                System.out.println("Don't print " + p + " " + q);
            }
        }
    }
}