package org.geekbang.algs.day03;

/**
 * 189. 旋转数组
 * https://leetcode-cn.com/problems/rotate-array/
 */
public class Practice_1 {

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;                       // 假设k=2
        reverse(nums,0,nums.length-1); // 1234567 -> 7654321
        reverse(nums,0,k-1);           // 7654321 -> 6754321
        reverse(nums,k,nums.length-1);        // 6754321 -> 6712345
    }

    private static void reverse(int[] nums, int start, int end) {
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * test cases
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        rotate(nums, k);
        System.out.println("结果：");
        for (int a = 0; a < nums.length; a++) {
            System.out.print(nums[a] + " ");
        }
    }
}
