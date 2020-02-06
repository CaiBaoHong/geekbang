package org.geekbang.algs.day03;

/**
 * 189. 旋转数组
 * https://leetcode-cn.com/problems/rotate-array/
 */
public class Question_189 {
    /**
     * 思路：
     *
     * 逆向思维！！！
     *
     * 如： nums数组： 1 2 3 4 5 6 7， k = 3
     * 则： 则结果是:  5 6 7 1 2 3 4
     *
     * 再看几个：
     *         1 2 3 4 5 6 7
     * k = 2,  6 7|1 2 3 4 5
     * k = 3,  5 6 7|1 2 3 4
     * k = 4,  4 5 6 7|1 2 3
     * k = 5,  3 4 5 6 7|1 2
     * k = 6,  2 3 4 5 6 7|1
     * k = 7,  1 2 3 4 5 6 7|
     * k = 8,  7|1 2 3 4 5 6
     *
     * 规律是： k%n=3 个元素会被移动到数组的头部, 且数组分成两部分
     * 可以通过三次反转数组元素得到结果，假设k=2
     * 第一次，反转整个数组：    7 6 5 4 3 2 1
     * 第二次，反转前k个数字：   6 7|5 4 3 2 1
     * 第二次，反转后n-k个数字： 6 7|1 2 3 4 5
     *
     * @param nums
     * @return
     */
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length-1); // 1234567 --> 7654321
        reverse(nums,0,k-1);    // 7 6 5 --> 5 6 7
        reverse(nums,k,nums.length-1); // 4 3 2 1 --> 1 2 3 4
    }

    public static void reverse(int[] nums, int start, int end){
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
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
        System.out.println("结果：");
        for (int a = 0; a < nums.length; a++) {
            System.out.print(nums[a] + " ");
        }
    }
}
