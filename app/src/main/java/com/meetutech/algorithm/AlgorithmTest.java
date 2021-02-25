package com.meetutech.algorithm;

public class AlgorithmTest {
    /**
     * 如何在一个 1 到 100 的整数数组中找到丢失的数字
     */
    public static int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 != i) {
                return nums[i] - 1;
            }
        }
        return nums[nums.length - 1] + 1;
    }

    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        System.out.println(missingNumber(nums) + "");
    }
}
