package by.pilipuk.Algorithms4thEditionExercises.chapter1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1_1_21 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder res = new StringBuilder();

        String line;
        while ((line = reader.readLine()) != null && !line.isEmpty()) {
            String[] str = line.trim().split(" ");
            double val = Math.round(Integer.parseInt(str[1]) / (double) Integer.parseInt(str[2]));

            res
                    .append("|")
                    .append(str[0])
                    .append("|")
                    .append(str[1])
                    .append("|")
                    .append(str[2])
                    .append("|").append(val)
                    .append("\n");
        }

        System.out.println(res.toString());
    }
}