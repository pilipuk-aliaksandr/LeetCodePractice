package by.pilipuk.Algorithms4thEditionExercises.chapter1_1;

public class _1_1_22_recursive_binary_search {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(rank(11, arr, 0, arr.length, 1));
    }

    public static int rank(int target, int[] array, int left, int right, int counter) {
        if (left >= right) {
            return -1;
        }
        System.out.println(counter + " iteration. " + "Left index: " + left + ". Right index: " + right);
        int mid = left + ((right - left) / 2);

        if (array[mid] == target) {
            return mid;
        }
        if (target < array[mid]) {
            right = mid - 1;
        }
        if (target > array[mid]) {
            left = mid + 1;
        }
        counter++;

        return rank(target, array, left, right, counter);
    }
}