package by.pilipuk.Algorithms4thEditionExercises.chapter1_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1_1_15 {
    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 2, 3, 4, 1, 2, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(histogram(a, 10)));
        System.out.println();
        System.out.println(Arrays.toString(fasterHistogram(a, 10)));
        System.out.println();
        System.out.println(Arrays.toString(easyHistogram(a, 10)));

    }

    public static int[] histogram(int[] a, int m) {
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {

            int counter = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    counter++;
                }
            }
            arr[i] = counter;
        }

        return arr;
    }

    public static int[] fasterHistogram(int[] a, int m) {
        int[] arr = new int[m];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            map.merge(a[i], 1, (curr, next) -> next = curr + 1);
        }

        for (int i = 0; i < m; i++) {
            arr[i] = map.get(i);
        }

        return arr;
    }

    public static int[] easyHistogram(int[] a, int m) {
        int[] arr = new int[m];

        for (int i = 0; i < a.length; i++) {
            if (i <= m + 1) {
                arr[a[i]]++;
            }
        }

        return arr;
    }
}
