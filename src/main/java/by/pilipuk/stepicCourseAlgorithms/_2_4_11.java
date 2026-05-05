package by.pilipuk.stepicCourseAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2_4_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();

        isPalindromeRecursive(str, 0, str.length() - 1, true);
    }

    public static void isPalindromeRecursive(String str, int l, int r, boolean flag) {
        if ((r - l  == 1 || r - l == 0) && flag) {
            System.out.println(true);
            return;
        } else if ((r - l  == 1 || r - l == 0) && !flag) {
            System.out.println(false);
            return;
        }

        if (str.charAt(r) != str.charAt(l)) {
            flag = false;
        }

        isPalindromeRecursive(str, l + 1, r - 1, flag);
    }
}