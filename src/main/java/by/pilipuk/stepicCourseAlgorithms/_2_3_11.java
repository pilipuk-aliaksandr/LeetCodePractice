package by.pilipuk.stepicCourseAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2_3_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] str = reader.readLine().trim().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        StringBuilder res = new StringBuilder();

        if (n == m) {
            for (int i = 0; i < n; i++) {
                res.append("B").append("G");
            }
        } else if (n > m) {
            if (m * 2 >= n) {
                int b = n;
                int g = m;

                while (b != 0) {
                    res.append("B");
                    b--;
                    res.append("G");
                    g--;
                    if (b != 0) {
                        res.append("B");
                        b--;
                    }
                }

                int j = 0;
                while (g != 0) {
                    if (res.charAt(j) == res.charAt(j + 1)) {
                        res.insert(j, "G");
                        g--;
                    }
                    j++;
                }
            } else {
                System.out.print("NO SOLUTION");
            }
        } else {
            if (n * 2 >= m) {
                int b = n;
                int g = m;

                while (g != 0) {
                    res.append("G");
                    g--;
                    res.append("B");
                    b--;
                    if (g != 0) {
                        res.append("G");
                        g--;
                    }
                }

                int j = 0;
                while (b != 0) {
                    if (res.charAt(j) == res.charAt(j + 1)) {
                        res.insert(j, "B");
                        b--;
                    }
                    j++;
                }
            } else {
                System.out.print("NO SOLUTION");
            }
        }
        System.out.println(res.toString());
    }
}