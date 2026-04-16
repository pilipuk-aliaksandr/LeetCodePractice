package by.pilipuk.TbankPractice;

import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            long n = s.length();

            long maxL = 0;
            long currentL = 0;

            String doubled = s + s;
            for (int i = 0; i < doubled.length(); i++) {
                if (doubled.charAt(i) == '1') {
                    currentL++;
                    maxL = Math.max(maxL, currentL);
                } else {
                    currentL = 0;
                }
            }

            if (maxL >= n) {
                System.out.println(n * n);
            } else {
                long side1 = (maxL + 1) / 2;
                long side2 = (maxL + 2) / 2;
                System.out.println(side1 * side2);
            }
        }
        sc.close();
    }
}