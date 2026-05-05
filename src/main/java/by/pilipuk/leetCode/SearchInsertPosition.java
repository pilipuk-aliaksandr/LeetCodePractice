package by.pilipuk.leetCode;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int middle = l + (r - l) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (target < nums[middle]) {
                r = middle - 1;
            } else {
                l = middle + 1;
            }
        }

        if (target > nums[l]) {
            return l + 1;
        } else {
            if (l != 0) {
                return l;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,3,5,6};
        System.out.println(searchInsert(nums, 7));
    }
}