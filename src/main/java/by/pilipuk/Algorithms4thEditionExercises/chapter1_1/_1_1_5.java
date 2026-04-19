package by.pilipuk.Algorithms4thEditionExercises.chapter1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1_1_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double x = Double.parseDouble(reader.readLine());
        double y = Double.parseDouble(reader.readLine());

        if (x < 2 && x > 1 && y < 2 && y > 1) {
            System.out.println(true);
        } else System.out.println(false);
    }
}
