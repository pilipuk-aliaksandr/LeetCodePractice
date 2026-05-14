package by.pilipuk.stepicCourseAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_3_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = reader.readLine().trim().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[][] arr = new int[n][m];
        int[][] count = new int[n][m];
        String[][] res = new String[n][m];

        int w = Integer.parseInt(reader.readLine());

        for (int i = 0; i < w; i++) {
            String[] str = reader.readLine().trim().split(" ");
            arr[Integer.parseInt(str[0]) - 1][Integer.parseInt(str[1]) - 1] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            int ni = i + di;
                            int nj = j + dj;
                            if (ni >= 0 && ni < n && nj >= 0 && nj < m) {
                                count[ni][nj]++;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    res[i][j] = "*";
                } else {
                    res[i][j] = String.valueOf(count[i][j]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}