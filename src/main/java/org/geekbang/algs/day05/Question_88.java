package org.geekbang.algs.day05;

import org.geekbang.algs.day04.ListNode;

/**
 * 88. 合并两个有序数组
 * https://leetcode-cn.com/problems/merge-sorted-array
 */
public class Question_88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 确定指针的位置
        int p = m + n - 1;
        int p1 = m - 1;
        int p2 = n - 1;
        // p1、p2指针从两个数组后面开始比较
        while (p1 >= 0 && p2 >= 0){
            // 复制较大的值到nums1
            if (nums1[p1]<nums2[p2]){
                nums1[p] = nums2[p2--];
            }else{
                nums1[p] = nums1[p1--];
            }
            p--;
        }
        // 循环结束后，有可能p2还有元素未复制到nums1
        // 由于已经比较完毕，且数组都是排序好的
        // 所以nums2中剩下未复制的部分，肯定是最小的，可以直接复制到nums1
        // 注意：arraycopy最后一个参数是复制的长度，而非下标，所以要+1
        System.arraycopy(nums2,0,nums1,0,p2+1);
    }

    /**
     * test cases
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        // print result
        System.out.println("结果：");
        for (int e : nums1) {
            System.out.print(e + " ");
        }
    }
}
