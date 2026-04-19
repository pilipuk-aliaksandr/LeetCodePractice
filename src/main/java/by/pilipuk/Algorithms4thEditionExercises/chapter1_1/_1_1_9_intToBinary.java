package by.pilipuk.Algorithms4thEditionExercises.chapter1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1_1_9_intToBinary {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        StringBuilder res = new StringBuilder();

        for (int i = n; i > 0; i /= 2) {
            res.append(i % 2);
        }

        System.out.println(res.reverse().toString());
    }
}
