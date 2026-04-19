package by.pilipuk.Algorithms4thEditionExercises.chapter1_1;

public class _1_1_11 {
    public static void main(String[] args) {
        boolean[][] arr = new boolean[][] {{true, false, true}, {true, false, true}, {true, false, true}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == true) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}