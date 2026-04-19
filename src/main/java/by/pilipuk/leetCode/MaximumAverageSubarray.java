package by.pilipuk.leetCode;

public class MaximumAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;

        int[] arr = new int[nums.length + 1];
        arr[0] = 0;

        for (int i = 0; i < nums.length; i++) {
            arr[i + 1] = arr[i] + nums[i];
        }

        for (int i = 0; i <= nums.length - k; i++) {
            double currAvg = (double) (arr[i + k] - arr[i]) / k;
            if (maxAvg < currAvg) {
                maxAvg = currAvg;
            }

        }

        return maxAvg;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5};
        System.out.println(findMaxAverage(nums, 1));
    }
}