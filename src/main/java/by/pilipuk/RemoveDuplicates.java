package by.pilipuk;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast]; // Переносим уникальный элемент вперед
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 1, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10, 10};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.println(removeDuplicates.removeDuplicates(nums));
    }
}
