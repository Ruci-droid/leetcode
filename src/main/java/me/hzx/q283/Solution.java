package me.hzx.q283;

import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * <p>
 * <a href="https://leetcode.cn/problems/move-zeroes/description/?utm_source=LCUS&utm_medium=ip_redirect&utm_campaign=transfer2china">283. 移动零</a>
 *
 * @author Ruci & Houzhangxu
 * @since 2023/8/10 10:00
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        Solution solution = new Solution();
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        int[] num2s = new int[]{0};
        solution.moveZeroes(num2s);
        System.out.println(Arrays.toString(num2s));
        int[] num3s = new int[]{0, 0, 1};
        solution.moveZeroes(num3s);
        System.out.println(Arrays.toString(num3s));
        int[] num4s = new int[]{1};
        solution.moveZeroes(num4s);
        System.out.println(Arrays.toString(num4s));
    }

    public void moveZeroes(int[] nums) {
        // 双指针
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }

        // 其实原理就是把所有的非0元素全都按照顺序在数组中再次赋值, 最后再以最后一个元素为起始复制为0

    }

    public void moveZeroes2(int[] nums) {

        // 暴力破解
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            if (num == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = 0;
            }
        }

//        for (int i = 0; i < nums.length; i++) {
//            int num = nums[i];
//            if (num == 0) {
//                for (int j = i; j < nums.length - 1; j++) {
//                    nums[j] = nums[j + 1];
//                }
//                nums[nums.length - 1] = 0;
//                i = i - 1;
//            }
//        }

        // 0 0 0 1 0 0 0
        // 0 0 1 0 0 0 0
        //

    }

}
