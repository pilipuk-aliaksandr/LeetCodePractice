package by.pilipuk.leetCode;

import java.util.List;

public class MinimumPositiveSumSubarray {
    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int maxSum = Integer.MAX_VALUE;
        int currSum = 0;

        int[] prefixSum = new int[nums.size() + 1];
        prefixSum[0] = 0;

        for (int i = 0; i < nums.size(); i++) {
            prefixSum[i + 1] = prefixSum[i] + nums.get(i);
        }

        int left = l;
        while (left <= r) {
            for (int i = 1; i < nums.size() + 1; i++) {
                if (i >= left) {
                    currSum = prefixSum[i] - prefixSum[i - left];
                    if (currSum > 0 && maxSum > currSum) {
                        maxSum = currSum;
                    }
                }
            }
            left++;
        }

        if (maxSum == Integer.MAX_VALUE) {
            return -1;
        } else {
            return maxSum;
        }
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(-3,17);

        System.out.println(minimumSumSubarray(nums, 1, 2));
    }
}
