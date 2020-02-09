package org.geekbang.algs.day06;

/**
 * 283. 移动零
 * https://leetcode-cn.com/problems/move-zeroes/
 */
public class Question_283 {

    public static void moveZeroes(int[] nums) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                nums[p++] = nums[i];
                if (i!=p){
                    nums[i] = 0;
                }
            }
        }
    }

    /**
     * test cases
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        // print result
        System.out.println("结果：");
        for (int e : nums) {
            System.out.print(e + " ");
        }
    }
}
