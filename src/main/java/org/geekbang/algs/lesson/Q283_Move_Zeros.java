package org.geekbang.algs.lesson;

/**
 * 283. 移动零
 * https://leetcode-cn.com/problems/move-zeroes/
 */
public class Q283_Move_Zeros {
    /**
     * 思路：
     * 数组分成两部分：已处理的和未处理的，用指针p指向已处理的数的下标。如：
     * p
     * 0, 1, 0, 3, 12
     * 然后遍历数组，逐个检查，如果发现当前下标i的数值nums[i]不是0，
     * 则复制到指针p指向的位置，然后将nums[i]=0，指针p右移一位
     */
    public static void moveZeroes(int[] nums) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[p] = nums[i];
                if (i != p) {
                    nums[i] = 0;
                }
                p++;
            }
        }
    }

    /**
     * test cases
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println("结果：");
        for (int a = 0; a < nums.length; a++) {
            System.out.print(nums[a] + " ");
        }
    }
}
