package by.pilipuk;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.merge(nums[i], 1, (o, n) -> n = o + 1);
        }

        int maxSize = 0;
        for (var entry : map.entrySet()) {
            if (map.containsKey(entry.getKey() + 1)) {
                int currSize = entry.getValue() + map.get(entry.getKey() + 1);
                if (maxSize < currSize) {
                    maxSize = currSize;
                }
            }
        }
        return maxSize;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,3,2,2,5,2,3,7};
        LongestHarmoniousSubsequence longestHarmoniousSubsequence = new LongestHarmoniousSubsequence();
        System.out.println(longestHarmoniousSubsequence.findLHS(nums));
    }
}
