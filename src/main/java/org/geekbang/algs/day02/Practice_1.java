package org.geekbang.algs.day02;

/**
 * 26. 删除排序数组中的重复项
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class Practice_1 {

    public static int removeDuplicates(int[] nums) {
        if (nums==null||nums.length==0){
            return 0;
        }
        int p = 0;
        for (int q = 1; q < nums.length;q++){
            if (nums[p]!=nums[q]){
                // 一定要先移动指针p
                nums[++p] = nums[q];
            }
        }
        return p+1;
    }

    /**
     * test cases
     *
     * @param args
     */
    public static void main(String[] args) {
        // int[] nums = new int[]{1, 1, 2};
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newArrLength = removeDuplicates(nums);
        System.out.println("删除重复元素后的数组：");
        for (int k = 0; k < newArrLength; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}
