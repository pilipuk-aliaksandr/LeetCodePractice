package by.pilipuk.leetCode;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int res = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int cursqr = 0;
            cursqr = Math.min(height[right], height[left]) * Math.abs(right - left);

            if (res < cursqr) {
                res = cursqr;
            }

            if (height[right] < height[left]) {
                right--;
            } else {
                left++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
