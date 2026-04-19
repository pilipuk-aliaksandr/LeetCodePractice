package by.pilipuk.Algorithms4thEditionExercises.chapter1_1;

import java.util.Arrays;

public class _1_1_13 {
    public static void main(String[] args) {
        boolean[][] arr = new boolean[][] {{true, false, true}, {true, false, true}};

        boolean[][] newArr = new boolean[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                newArr[j][i] = arr[i][j];
            }
        }

        System.out.println(Arrays.deepToString(arr));
        System.out.println();
        System.out.println(Arrays.deepToString(newArr));
    }
}
