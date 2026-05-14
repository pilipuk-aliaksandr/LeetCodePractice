package by.pilipuk.Algorithms4thEditionExercises.chapter1_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class testUF1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        UnionFind unionFind = new UnionFind(n);

        for (int i = 0; i < n; i++) {
            String[] str = reader.readLine().trim().split(" ");
            int p = Integer.parseInt(str[0]);
            int q = Integer.parseInt(str[1]);

            if (!unionFind.connected(p, q)) {
                unionFind.union(p, q);

                System.out.println(p + " " + q);
            } else {
                System.out.println("Don't print " + p + " " + q);
            }
        }
    }
}