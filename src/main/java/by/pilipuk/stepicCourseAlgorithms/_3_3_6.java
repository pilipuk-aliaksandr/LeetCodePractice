package by.pilipuk.stepicCourseAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_3_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = br.readLine();
        if (firstLine == null) return;

        String[] sizes = firstLine.trim().split(" ");
        int n = Integer.parseInt(sizes[0]);
        int m = Integer.parseInt(sizes[1]);

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] rowElements = br.readLine().trim().split(" ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(rowElements[j]);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(m).append(" ").append(n).append("\n");

        for (int j = 0; j < m; j++) {
            for (int i = n - 1; i >= 0; i--) {
                sb.append(matrix[i][j]);
                if (i > 0) sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}